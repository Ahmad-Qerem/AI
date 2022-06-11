package ML;
import java.util.Arrays;
public class NeuralNetWork {
    public static enum Layert {
        I, H, O
    };
    public static int Epoch = 100;
    public static double Alpha = 1;
    public static double MSE = 100;
    public static int NumberOfNuronInInputLayer = 0;
    public static int NumberOfNuronInHiddenLayer = 0;
    public static int NumberOfNuronInOutputLayer = 0;
    public Neuron[] Neurons;
    public NeuralNetWork(int numberOfAllNeurn, int in, int hidden, int out) {
        int currentIndex = 0;
        Neurons = new Neuron[numberOfAllNeurn];
        NumberOfNuronInInputLayer = in;
        NumberOfNuronInHiddenLayer = hidden;
        NumberOfNuronInOutputLayer = out;
        for (int i = 0; i < NumberOfNuronInInputLayer; i++) {
            Neurons[currentIndex] = new Neuron(Layert.I);
            currentIndex += 1;
        }
        for (int i = 0; i < NumberOfNuronInHiddenLayer; i++) {
            Neurons[currentIndex] = new Neuron(Layert.H);
            Neurons[currentIndex].weights[0] = Neuron.randomWeight(2,2);
            Neurons[currentIndex].weights[1] = Neuron.randomWeight(2,2);
            Neurons[currentIndex].threshold = Neuron.randomWeight(1,2);
            currentIndex += 1;
        }
        for (int i = 0; i < NumberOfNuronInOutputLayer; i++) {
            Neurons[currentIndex] = new Neuron(Layert.O);
            Neurons[currentIndex].weights[0] = Neuron.randomWeight(2,1);
            Neurons[currentIndex].weights[1] = Neuron.randomWeight(2,1);
            Neurons[currentIndex].threshold = Neuron.randomWeight(1,1);
            currentIndex += 1;
        }
    }
    public double F1(double x) {
        double Y;
        Y = (-x * Neurons[2].weights[0] + Neurons[2].threshold) / Neurons[2].weights[1];
        return Y;
    }
    public double F2(double x) {
        double Y;
        Y = (-x * Neurons[3].weights[0] + Neurons[3].threshold) / Neurons[3].weights[1];
        return Y;
    }
    public void forwardPropagation(double input[]) {
        double ws = 0;
        for (int i = 0; i < Neurons.length; i++) {
            switch (Neurons[i].layert) {
                case I:
                    Neurons[i].output = input[i];
                    break;
                case H:
                    ws =(Neurons[i].weights[0] * Neurons[0].output + Neurons[i].weights[1] * Neurons[1].output)+Neurons[i].threshold;
                    Neurons[i].output = Neurons[i].activationFunction(ws);
                    break;
                case O:
                    ws = (Neurons[i].weights[0] * Neurons[2].output + Neurons[i].weights[1] * Neurons[3].output)+Neurons[i].threshold;
                    Neurons[i].output = Neurons[i].activationFunction(ws);
                    break;
            }
        }
    }
    public void backPropagation(double targetresult) {
        Neurons[4].error_gradient = (targetresult - Neurons[4].output) * Neurons[4].derivative();
        Neurons[4].new_threshold = Neurons[4].threshold + (Alpha * Neurons[4].error_gradient);
        Neurons[4].new_weight[0] = Neurons[4].weights[0] + (Alpha * Neurons[4].error_gradient*Neurons[2].output);
        Neurons[4].new_weight[1] = Neurons[4].weights[1] + (Alpha * Neurons[4].error_gradient*Neurons[3].output);

        Neurons[3].error_gradient=(Neurons[4].weights[1] * Neurons[4].error_gradient) * Neurons[3].derivative();
        Neurons[3].new_threshold = Neurons[3].threshold + (Alpha * Neurons[3].error_gradient);
        Neurons[3].new_weight[0] = Neurons[3].weights[0] + (Alpha * Neurons[3].error_gradient*Neurons[0].output);
        Neurons[3].new_weight[1] = Neurons[3].weights[1] + (Alpha * Neurons[3].error_gradient*Neurons[1].output);

        Neurons[2].error_gradient=(Neurons[4].weights[0] * Neurons[4].error_gradient) * Neurons[2].derivative();
        Neurons[2].new_threshold = Neurons[2].threshold + (Alpha *Neurons[2].error_gradient);
        Neurons[2].new_weight[0] = Neurons[2].weights[0] + (Alpha * Neurons[2].error_gradient*Neurons[0].output);
        Neurons[2].new_weight[1] = Neurons[2].weights[1] + (Alpha * Neurons[2].error_gradient*Neurons[1].output);
    }
    public void applayChanges(){
        for (int i=2;i<5;i++){
            Neurons[i].threshold=Neurons[i].new_threshold;
            Neurons[i].weights[0]=Neurons[i].new_weight[0];
            Neurons[i].weights[1]=Neurons[i].new_weight[1];
        
        }
    }
    public String toString() {
        return Arrays.toString(Neurons);
    }
}