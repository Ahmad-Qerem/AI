package ML;
public class Neuron {
    public NeuralNetWork.Layert layert;
    public double[] weights = {1, 1};
    public double output = 0;
    public double threshold = 1;
    public double []new_weight = {0,0};
    public double new_threshold = 0;
    public double error_gradient = 0;
    public Neuron(NeuralNetWork.Layert layert) {
        this.layert = layert;
    }
    public double activationFunction(double sum) {
        output = 1.0 / (1 + Math.exp(-1.0 * sum));
        return output;
    }
    public double derivative() {
        return output * (1.0 - output);
    }
    public  double calculateY(double input[]) {
        double Y;
        Y =(this.weights[0] *input[0] + this.weights[1] * input[1])+this.threshold;
        return Y;
    }
    public double F(double x) {
        double Y;
        Y = (-x*weights[0]+threshold)/weights[1];
        return Y;
    }
    public  void adjustmentWeight(double input[],double targetresult,double Alpha) {
        double y =calculateY(input);
        this.output=this.activationFunction(y);
        this.error_gradient = (targetresult - this.output) * this.derivative();
        
        this.threshold = this.threshold + (Alpha *this.error_gradient);
        this.weights[0] = this.weights[0] + (Alpha * this.error_gradient*input[0]);
        this.weights[1] = this.weights[1] + (Alpha * this.error_gradient*input[1]);
    }
    public static double randomWeight(double leftLimit, double rightLimit) {
        double generatedLong = leftLimit + (double) (Math.random() * (rightLimit - leftLimit));
        return generatedLong;
    }

}
