package GUIPackages;

import ML.NeuralNetWork;
import ML.Neuron;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GUILogicGate extends javax.swing.JFrame {

    public static final double[][][] anddata = {{{0, 0}, {0}}, {{1, 0}, {0}}, {{0, 1}, {0}}, {{1, 1}, {1}}};
    public static final double[][][] nanddata = {{{0, 0}, {1}}, {{1, 0}, {1}}, {{0, 1}, {1}}, {{1, 1}, {0}}};
    public static final double[][][] nordata = {{{0, 0}, {1}}, {{1, 0}, {0}}, {{0, 1}, {0}}, {{1, 1}, {0}}};
    public static final double[][][] ordata = {{{0, 0}, {0}}, {{1, 0}, {1}}, {{0, 1}, {1}}, {{1, 1}, {1}}};
    public static final double[][][] xordata = {{{0, 0}, {0}}, {{1, 0}, {1}}, {{0, 1}, {1}}, {{1, 1}, {0}}};
    public static final double[][][] xnordata = {{{0, 0}, {1}}, {{1, 0}, {0}}, {{0, 1}, {0}}, {{1, 1}, {1}}};
    ///////////////////////////////
    NeuralNetWork neuralnetwork;
    Neuron neuron;
    int dataType = 0;
    int startMode = 0;
    int Epoch = 100;
    int Itration = 1000;
    double MSEIN = 0.5;
    double Ahpha = 0.1;
    public static double[][][] data;
    Icon currntIcon;

    public GUILogicGate() {
        initComponents();
        ANDIcon.setIcon(new ImageIcon("AND.png"));
        NANDIcon.setIcon(new ImageIcon("NAND.png"));
        ORIcon.setIcon(new ImageIcon("OR.png"));
        NORIcon.setIcon(new ImageIcon("NOR.png"));
        XORIcon.setIcon(new ImageIcon("XOR.png"));
        XNORIcon.setIcon(new ImageIcon("XNOR.png"));
    }

    private void learnByMSE() {
        double res = 0;
        double error = 100;
        int E = 1;
        while ((error / 4) >= MSEIN) {
            error = 0;
            for (int j = 0; j < data.length; j++) {
                if (this.dataType == 1) {
                    neuralnetwork.forwardPropagation(data[j][0]);
                    neuralnetwork.backPropagation(data[j][1][0]);
                    neuralnetwork.applayChanges();
                    res = neuralnetwork.Neurons[4].output;
                } else {
                    neuron.adjustmentWeight(data[j][0], data[j][1][0], Ahpha);
                    res = neuron.output;
                }
                String str = String.valueOf(E) + "\t | " + String.valueOf(data[j][0][0]) + "\t | " + "- \t |" + String.valueOf(data[j][0][1]) + "\t |" + "- \t | " + "- \t | " + res + "\t | " + data[j][1][0] + "\t |" + (data[j][1][0] - res) + "\t | ";
                if (j != 3) {
                    str += " - \t |" + "\n";
                }
                jTextArea1.append(str);

                error += Math.pow((data[j][1][0] - res), 2);
            }
            String str = String.valueOf(error / 4) + "\t |" + "\n";
            jTextArea1.append(str);
            E += 1;
        }
    }

    private void learnByItration() {
        double res = 0;
        while (Itration > 0) {
            double error = 0;
            for (int j = 0; j < data.length; j++) {
                if (this.dataType == 1) {
                    neuralnetwork.forwardPropagation(data[j][0]);
                    neuralnetwork.backPropagation(data[j][1][0]);
                    neuralnetwork.applayChanges();
                    res = neuralnetwork.Neurons[4].output;
                } else {
                    neuron.adjustmentWeight(data[j][0], data[j][1][0], Ahpha);
                    res = neuron.output;
                }
                String str = String.valueOf(Itration) + "\t | " + String.valueOf(data[j][0][0]) + "\t | " + "- \t |" + String.valueOf(data[j][0][1]) + "\t |" + "- \t | " + "- \t | " + res + "\t | " + data[j][1][0] + "\t |" + (data[j][1][0] - res) + "\t | ";
                if (j != 3) {
                    str += " - \t |" + "\n";
                }
                jTextArea1.append(str);
                error += Math.pow((data[j][1][0] - res), 2);
                Itration -= 1;
            }
            String str = String.valueOf(error / 4) + "\t |" + "\n";
            jTextArea1.append(str);
        }
    }

    private void learnByEpoch() {
        double res = 0;
        while (Epoch > 0) {
            double error = 0;
            for (int j = 0; j < data.length; j++) {
                if (this.dataType == 1) {
                    neuralnetwork.forwardPropagation(data[j][0]);
                    neuralnetwork.backPropagation(data[j][1][0]);
                    neuralnetwork.applayChanges();
                    res = neuralnetwork.Neurons[4].output;
                } else {
                    neuron.adjustmentWeight(data[j][0], data[j][1][0], Ahpha);
                    res = neuron.output;
                }
                String str = String.valueOf(Epoch) + "\t | " + String.valueOf(data[j][0][0]) + "\t | " + "- \t |" + String.valueOf(data[j][0][1]) + "\t |" + "- \t | " + "- \t | " + res + "\t | " + data[j][1][0] + "\t |" + (data[j][1][0] - res) + "\t | ";
                if (j != 3) {
                    str += " - \t |" + "\n";
                }
                jTextArea1.append(str);
                error += Math.pow((data[j][1][0] - res), 2);
            }
            String str = String.valueOf(error / 4) + "\t |" + "\n";
            jTextArea1.append(str);
            Epoch -= 1;
        }
    }

    private double TestData(double[] D) throws NumberFormatException {
        D[0] = Double.parseDouble(X1.getText());
        D[1] = Double.parseDouble(X2.getText());
        double y = 0;
        if (dataType == 0) {
            y = neuron.activationFunction(neuron.calculateY(D));
            if (y > 0.5) {
                y = 1;
            } else {
                y = 0;
            }
        } else {
            neuralnetwork.forwardPropagation(D);
            y = neuralnetwork.Neurons[4].output;
            if (y > 0.5) {
                y = 1;
            } else {
                y = 0;
            }
        }
        return y;
    }

    private void DrawLine() {
        // TODO add your handling code here:
        Graphics G = jPanel9.getGraphics();
        Graphics2D G2D = (Graphics2D) G;
        G2D.setColor(Color.red);
        G2D.setStroke(new BasicStroke(5));
        if (dataType == 0) {
            DrowArea.setIcon(currntIcon);
            G2D.drawLine((-50) + 84, -((int) (neuron.F(0) * 100) + 100) + 240, 260 * 100 + 84, -1 * (int) (neuron.F(250)) * 100 + 228);
        } else {
            DrowArea.setIcon(currntIcon);
            G2D.drawLine((-50) * 100 + 84, -1 * ((int) (neuralnetwork.F1(-50) * 100)) + 228, (((250) * 100)) + 84, -1 * (int) (neuralnetwork.F1(250)) * 100 + 228);
            G2D.drawLine((-50) * 100 + 84, -1 * ((int) (neuralnetwork.F2(-50) * 100)) + 228, (((250) * 100)) + 84, -1 * (int) (neuralnetwork.F2(250)) * 100 + 228);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SelctionP = new javax.swing.JPanel();
        ANDGate = new javax.swing.JPanel();
        ANDIcon = new javax.swing.JLabel();
        NANDGate = new javax.swing.JPanel();
        NANDIcon = new javax.swing.JLabel();
        ORgate = new javax.swing.JPanel();
        ORIcon = new javax.swing.JLabel();
        NORGate = new javax.swing.JPanel();
        NORIcon = new javax.swing.JLabel();
        XORGate = new javax.swing.JPanel();
        XORIcon = new javax.swing.JLabel();
        XNORGate = new javax.swing.JPanel();
        XNORIcon = new javax.swing.JLabel();
        WorkP = new javax.swing.JPanel();
        TisitinP = new javax.swing.JPanel();
        TestingGate = new javax.swing.JPanel();
        TestingIcon = new javax.swing.JLabel();
        X1 = new javax.swing.JTextField();
        Y = new javax.swing.JTextField();
        X2 = new javax.swing.JTextField();
        TestDataB = new javax.swing.JButton();
        TistingLabel = new javax.swing.JLabel();
        ConfigrationP = new javax.swing.JPanel();
        StopingCriteriaL = new javax.swing.JLabel();
        stopingcriteriaCB = new javax.swing.JComboBox<>();
        AlphaL = new javax.swing.JLabel();
        alphaT = new javax.swing.JComboBox<>();
        EpochL = new javax.swing.JLabel();
        epochT = new javax.swing.JTextField();
        ItraitionL = new javax.swing.JLabel();
        itraitionT = new javax.swing.JTextField();
        MSEL = new javax.swing.JLabel();
        MSET = new javax.swing.JTextField();
        StartB = new javax.swing.JButton();
        OutputP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        DrowArea = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        TextSelectionP = new javax.swing.JPanel();
        TextAtTop = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Logic Gates Machine Learning");
        setBounds(new java.awt.Rectangle(0, 0, 800, 700));
        setMinimumSize(new java.awt.Dimension(800, 700));
        setResizable(false);

        SelctionP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Logic Gates", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 153, 255))); // NOI18N

        ANDGate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ANDIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad-AL-Qerem\\Documents\\NetBeansProjects\\LogicalGateML\\AND.png")); // NOI18N
        ANDIcon.setToolTipText("AND GATE");
        ANDIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ANDIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ANDIconMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ANDGateLayout = new javax.swing.GroupLayout(ANDGate);
        ANDGate.setLayout(ANDGateLayout);
        ANDGateLayout.setHorizontalGroup(
            ANDGateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ANDIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 149, Short.MAX_VALUE)
        );
        ANDGateLayout.setVerticalGroup(
            ANDGateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ANDIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );

        SelctionP.add(ANDGate);

        NANDGate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NANDIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad-AL-Qerem\\Documents\\NetBeansProjects\\LogicalGateML\\NAND.png")); // NOI18N
        NANDIcon.setToolTipText("NAND GATE");
        NANDIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NANDIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NANDIconMousePressed(evt);
            }
        });

        javax.swing.GroupLayout NANDGateLayout = new javax.swing.GroupLayout(NANDGate);
        NANDGate.setLayout(NANDGateLayout);
        NANDGateLayout.setHorizontalGroup(
            NANDGateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NANDIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 149, Short.MAX_VALUE)
        );
        NANDGateLayout.setVerticalGroup(
            NANDGateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NANDIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );

        SelctionP.add(NANDGate);

        ORgate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ORIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad-AL-Qerem\\Documents\\NetBeansProjects\\LogicalGateML\\OR.png")); // NOI18N
        ORIcon.setToolTipText("OR GATE");
        ORIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ORIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ORIconMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ORgateLayout = new javax.swing.GroupLayout(ORgate);
        ORgate.setLayout(ORgateLayout);
        ORgateLayout.setHorizontalGroup(
            ORgateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ORIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 149, Short.MAX_VALUE)
        );
        ORgateLayout.setVerticalGroup(
            ORgateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ORIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );

        SelctionP.add(ORgate);

        NORGate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NORIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad-AL-Qerem\\Documents\\NetBeansProjects\\LogicalGateML\\NOR.png")); // NOI18N
        NORIcon.setToolTipText("NOR GATE");
        NORIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NORIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NORIconMousePressed(evt);
            }
        });

        javax.swing.GroupLayout NORGateLayout = new javax.swing.GroupLayout(NORGate);
        NORGate.setLayout(NORGateLayout);
        NORGateLayout.setHorizontalGroup(
            NORGateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NORIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 149, Short.MAX_VALUE)
        );
        NORGateLayout.setVerticalGroup(
            NORGateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NORIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );

        SelctionP.add(NORGate);

        XORGate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        XORIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad-AL-Qerem\\Documents\\NetBeansProjects\\LogicalGateML\\XOR.png")); // NOI18N
        XORIcon.setToolTipText("XOR GATE");
        XORIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        XORIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                XORIconMousePressed(evt);
            }
        });

        javax.swing.GroupLayout XORGateLayout = new javax.swing.GroupLayout(XORGate);
        XORGate.setLayout(XORGateLayout);
        XORGateLayout.setHorizontalGroup(
            XORGateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(XORIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 149, Short.MAX_VALUE)
        );
        XORGateLayout.setVerticalGroup(
            XORGateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(XORIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );

        SelctionP.add(XORGate);

        XNORGate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        XNORIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad-AL-Qerem\\Documents\\NetBeansProjects\\LogicalGateML\\XNOR.png")); // NOI18N
        XNORIcon.setToolTipText("XNOR GATE");
        XNORIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        XNORIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                XNORIconMousePressed(evt);
            }
        });

        javax.swing.GroupLayout XNORGateLayout = new javax.swing.GroupLayout(XNORGate);
        XNORGate.setLayout(XNORGateLayout);
        XNORGateLayout.setHorizontalGroup(
            XNORGateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(XNORIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 147, Short.MAX_VALUE)
        );
        XNORGateLayout.setVerticalGroup(
            XNORGateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(XNORIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );

        SelctionP.add(XNORGate);

        TisitinP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Testing", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 153, 255))); // NOI18N

        TestingGate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TestingGate.setEnabled(false);

        TestingIcon.setToolTipText("AND");

        javax.swing.GroupLayout TestingGateLayout = new javax.swing.GroupLayout(TestingGate);
        TestingGate.setLayout(TestingGateLayout);
        TestingGateLayout.setHorizontalGroup(
            TestingGateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TestingIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        TestingGateLayout.setVerticalGroup(
            TestingGateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TestingIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        X1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        X1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        X1.setText("X1");
        X1.setToolTipText("A");
        X1.setActionCommand("<Not Set>");
        X1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        X1.setName("st"); // NOI18N
        X1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                X1MouseClicked(evt);
            }
        });

        Y.setEditable(false);
        Y.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Y.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Y.setText("Y");

        X2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        X2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        X2.setText("X2");
        X2.setToolTipText("B");
        X2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        X2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                X2MouseClicked(evt);
            }
        });

        TestDataB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TestDataB.setText("Test Data");
        TestDataB.setToolTipText("find the expected output");
        TestDataB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TestDataB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestDataBActionPerformed(evt);
            }
        });

        TistingLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TistingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout TisitinPLayout = new javax.swing.GroupLayout(TisitinP);
        TisitinP.setLayout(TisitinPLayout);
        TisitinPLayout.setHorizontalGroup(
            TisitinPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TisitinPLayout.createSequentialGroup()
                .addGroup(TisitinPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TisitinPLayout.createSequentialGroup()
                        .addGroup(TisitinPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TisitinPLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(X1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TisitinPLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(X2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TestingGate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TisitinPLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(TistingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TisitinPLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(TestDataB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TisitinPLayout.setVerticalGroup(
            TisitinPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TisitinPLayout.createSequentialGroup()
                .addComponent(TistingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 7, Short.MAX_VALUE)
                .addGroup(TisitinPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TisitinPLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TestingGate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TisitinPLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(TestDataB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(TisitinPLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(X1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(X2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ConfigrationP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configuration ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 153, 255))); // NOI18N

        StopingCriteriaL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        StopingCriteriaL.setText("Stopping criteria :");

        stopingcriteriaCB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stopingcriteriaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Epoch", "Itration", "MSE" }));
        stopingcriteriaCB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stopingcriteriaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopingcriteriaCBActionPerformed(evt);
            }
        });

        AlphaL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AlphaL.setText("Learning Rate :");

        alphaT.setEditable(true);
        alphaT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alphaT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.1", "0.3", "0.5", "1", "3", "6" }));
        alphaT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alphaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alphaTActionPerformed(evt);
            }
        });

        EpochL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EpochL.setText("# Epoch :");

        epochT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        epochT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        epochT.setText("100");
        epochT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ItraitionL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ItraitionL.setText("# Itration : ");

        itraitionT.setEditable(false);
        itraitionT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        itraitionT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        itraitionT.setText("10000");
        itraitionT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        MSEL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MSEL.setText("MSE : ");

        MSET.setEditable(false);
        MSET.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MSET.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MSET.setText("0.05");
        MSET.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        StartB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StartB.setText("Start ");
        StartB.setToolTipText("start learning opration");
        StartB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StartB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConfigrationPLayout = new javax.swing.GroupLayout(ConfigrationP);
        ConfigrationP.setLayout(ConfigrationPLayout);
        ConfigrationPLayout.setHorizontalGroup(
            ConfigrationPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfigrationPLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(ConfigrationPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConfigrationPLayout.createSequentialGroup()
                        .addGroup(ConfigrationPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(StopingCriteriaL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AlphaL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EpochL, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MSEL, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ConfigrationPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(epochT, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(itraitionT)
                            .addComponent(MSET)
                            .addComponent(stopingcriteriaCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alphaT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ItraitionL, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ConfigrationPLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(StartB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ConfigrationPLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {MSET, epochT, itraitionT});

        ConfigrationPLayout.setVerticalGroup(
            ConfigrationPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfigrationPLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(ConfigrationPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ConfigrationPLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(StopingCriteriaL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(stopingcriteriaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ConfigrationPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(alphaT)
                    .addComponent(AlphaL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ConfigrationPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(epochT, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(EpochL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ConfigrationPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(itraitionT, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(ItraitionL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ConfigrationPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MSET, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(MSEL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(StartB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        ConfigrationPLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {MSET, epochT, itraitionT});

        OutputP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Output", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 153, 255))); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DrowArea, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DrowArea, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
        );

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Clear All");
        jButton2.setToolTipText("clear all fields");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("-----------------------------------------------------------------------------------------------------------------\n# EPOCH \t| X1 \t| W1 \t| X2\t| W2\t| THRESHOLD\t| Y actual\t| Y desierd\t| ERROR        |  MSE\t|\n-----------------------------------------------------------------------------------------------------------------");
        jTextArea2.setAutoscrolls(false);
        jScrollPane2.setViewportView(jTextArea2);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Drow");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OutputPLayout = new javax.swing.GroupLayout(OutputP);
        OutputP.setLayout(OutputPLayout);
        OutputPLayout.setHorizontalGroup(
            OutputPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OutputPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OutputPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OutputPLayout.createSequentialGroup()
                        .addGroup(OutputPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(OutputPLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
        );

        OutputPLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        OutputPLayout.setVerticalGroup(
            OutputPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OutputPLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OutputPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OutputPLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(OutputPLayout.createSequentialGroup()
                        .addGroup(OutputPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(53, 302, Short.MAX_VALUE))))
        );

        OutputPLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2});

        javax.swing.GroupLayout WorkPLayout = new javax.swing.GroupLayout(WorkP);
        WorkP.setLayout(WorkPLayout);
        WorkPLayout.setHorizontalGroup(
            WorkPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WorkPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(WorkPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConfigrationP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TisitinP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OutputP, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        WorkPLayout.setVerticalGroup(
            WorkPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WorkPLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(WorkPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OutputP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(WorkPLayout.createSequentialGroup()
                        .addComponent(ConfigrationP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TisitinP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        TextAtTop.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        TextAtTop.setText("Please select one of the following logic gate to learn");
        TextSelectionP.add(TextAtTop);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextSelectionP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(WorkP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SelctionP, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TextSelectionP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SelctionP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WorkP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartBActionPerformed
        if (data != null) {
            switch (startMode) {
                case 0 -> {
                    Epoch = Integer.parseInt(epochT.getText());
                    learnByEpoch();
                }
                case 1 -> {
                    Itration = Integer.parseInt(itraitionT.getText());
                    learnByItration();
                }
                case 2 -> {
                    MSEIN = Double.parseDouble(this.MSET.getText());
                    learnByMSE();
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Plese select a gate to learn");
        }
    }//GEN-LAST:event_StartBActionPerformed


    private void TestDataBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestDataBActionPerformed
        double[] D = {0, 0};
        double y = TestData(D);
        Y.setText(String.valueOf(y));
    }//GEN-LAST:event_TestDataBActionPerformed


    private void X1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X1MouseClicked
        X1.selectAll();
    }//GEN-LAST:event_X1MouseClicked
    private void X2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X2MouseClicked
        X2.selectAll();
    }//GEN-LAST:event_X2MouseClicked
    private void stopingcriteriaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopingcriteriaCBActionPerformed
        startMode = stopingcriteriaCB.getSelectedIndex();
        switch (startMode) {
            case 0 -> {
                epochT.setEditable(true);
                itraitionT.setEditable(false);
                MSET.setEditable(false);
            }
            case 1 -> {
                epochT.setEditable(false);
                itraitionT.setEditable(true);
                MSET.setEditable(false);
            }
            case 2 -> {
                epochT.setEditable(false);
                itraitionT.setEditable(false);
                MSET.setEditable(true);
            }
            default -> {
            }
        }
    }//GEN-LAST:event_stopingcriteriaCBActionPerformed
    private void ANDIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ANDIconMousePressed
        neuralnetwork = new NeuralNetWork(5, 2, 2, 1);
        neuron = new Neuron(NeuralNetWork.Layert.H);
        dataType = 0;
        data = anddata;
        currntIcon = new ImageIcon("ANDY.png");
        DrowArea.setIcon(currntIcon);
        TestingIcon.setIcon(ANDIcon.getIcon());
        TistingLabel.setText("AND");
    }//GEN-LAST:event_ANDIconMousePressed
    private void NANDIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NANDIconMousePressed
        neuralnetwork = new NeuralNetWork(5, 2, 2, 1);
        neuron = new Neuron(NeuralNetWork.Layert.H);
        data = nanddata;
        currntIcon = new ImageIcon("NANDY.png");
        DrowArea.setIcon(currntIcon);
        TestingIcon.setIcon(NANDIcon.getIcon());
        TistingLabel.setText("NAND");
    }//GEN-LAST:event_NANDIconMousePressed
    private void ORIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ORIconMousePressed
        neuralnetwork = new NeuralNetWork(5, 2, 2, 1);
        neuron = new Neuron(NeuralNetWork.Layert.H);
        dataType = 0;
        data = ordata;
        currntIcon = new ImageIcon("ORY.png");
        DrowArea.setIcon(currntIcon);
        TestingIcon.setIcon(ORIcon.getIcon());
        TistingLabel.setText("OR");
    }//GEN-LAST:event_ORIconMousePressed
    private void NORIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NORIconMousePressed
        neuralnetwork = new NeuralNetWork(5, 2, 2, 1);
        neuron = new Neuron(NeuralNetWork.Layert.H);
        dataType = 0;
        data = nordata;
        currntIcon = new ImageIcon("NORY.png");
        DrowArea.setIcon(currntIcon);
        TestingIcon.setIcon(NORIcon.getIcon());
        TistingLabel.setText("NOR");
    }//GEN-LAST:event_NORIconMousePressed
    private void XORIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XORIconMousePressed
        neuralnetwork = new NeuralNetWork(5, 2, 2, 1);
        neuron = new Neuron(NeuralNetWork.Layert.H);
        dataType = 1;
        data = xordata;
        currntIcon = new ImageIcon("XORY.png");
        DrowArea.setIcon(currntIcon);
        TestingIcon.setIcon(XORIcon.getIcon());
        TistingLabel.setText("XOR");
    }//GEN-LAST:event_XORIconMousePressed
    private void XNORIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XNORIconMousePressed
        neuralnetwork = new NeuralNetWork(5, 2, 2, 1);
        neuron = new Neuron(NeuralNetWork.Layert.H);
        dataType = 1;
        data = xnordata;
        currntIcon = new ImageIcon("XNORY.png");
        DrowArea.setIcon(currntIcon);
        TestingIcon.setIcon(XNORIcon.getIcon());
        TistingLabel.setText("XNOR");
    }//GEN-LAST:event_XNORIconMousePressed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DrowArea.setIcon(null);
        TestingIcon.setIcon(null);
        X1.setText("X1");
        X2.setText("X2");
        Y.setText("Y");
        MSET.setText("0.05");
        itraitionT.setText("10000");
        epochT.setText("100");
        alphaT.setSelectedIndex(0);
        stopingcriteriaCB.setSelectedIndex(0);
        jTextArea1.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed
    private void alphaTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alphaTActionPerformed
        Ahpha = Double.parseDouble(alphaT.getSelectedItem().toString());
        NeuralNetWork.Alpha = Ahpha;
    }//GEN-LAST:event_alphaTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DrawLine();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ANDGate;
    private javax.swing.JLabel ANDIcon;
    private javax.swing.JLabel AlphaL;
    private javax.swing.JPanel ConfigrationP;
    private javax.swing.JLabel DrowArea;
    private javax.swing.JLabel EpochL;
    private javax.swing.JLabel ItraitionL;
    private javax.swing.JLabel MSEL;
    private javax.swing.JTextField MSET;
    private javax.swing.JPanel NANDGate;
    private javax.swing.JLabel NANDIcon;
    private javax.swing.JPanel NORGate;
    private javax.swing.JLabel NORIcon;
    private javax.swing.JLabel ORIcon;
    private javax.swing.JPanel ORgate;
    private javax.swing.JPanel OutputP;
    private javax.swing.JPanel SelctionP;
    private javax.swing.JButton StartB;
    private javax.swing.JLabel StopingCriteriaL;
    private javax.swing.JButton TestDataB;
    private javax.swing.JPanel TestingGate;
    private javax.swing.JLabel TestingIcon;
    private javax.swing.JLabel TextAtTop;
    private javax.swing.JPanel TextSelectionP;
    private javax.swing.JPanel TisitinP;
    private javax.swing.JLabel TistingLabel;
    private javax.swing.JPanel WorkP;
    private javax.swing.JTextField X1;
    private javax.swing.JTextField X2;
    private javax.swing.JPanel XNORGate;
    private javax.swing.JLabel XNORIcon;
    private javax.swing.JPanel XORGate;
    private javax.swing.JLabel XORIcon;
    private javax.swing.JTextField Y;
    private javax.swing.JComboBox<String> alphaT;
    private javax.swing.JTextField epochT;
    private javax.swing.JTextField itraitionT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JComboBox<String> stopingcriteriaCB;
    // End of variables declaration//GEN-END:variables
}
