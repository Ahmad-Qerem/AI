package GUI_Package;
import Game.*;
import javax.sound.sampled.*;
import java.awt.Color;
import static java.lang.System.exit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class GUI_Frame_MainMenu extends javax.swing.JFrame {
    Board NewGameBoard = new Board();
    ControlSound CS = new ControlSound();
    Color blue1 = new Color(37, 176, 253, 255);
    Color brown1 = new Color(148, 66, 34);
    Clip Backsound = CS.loadClip("src\\soundtrack.wav");
    public GUI_Frame_MainMenu() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        BackGround.setIcon(new ImageIcon("src\\backgrond.png"));
        SinglePlayerB.setIcon(new ImageIcon("src\\icons8_science_fiction_32px.png"));
        MultiPlayerB.setIcon(new ImageIcon("src\\icons8_team_24px.png"));
        helpPicure.setIcon(new ImageIcon("src\\2021-07-18 220726.png"));
        PuseL.setIcon(new ImageIcon("src\\icons8_pause_30px_3.png"));
        Player1L.setIcon(new ImageIcon("src\\red.png"));
        Player2L.setIcon(new ImageIcon("src\\blue.png"));
        board.setIcon(new ImageIcon("src\\pnghut_connect-four-board-game-rectangle2.png"));
        ContinueB.setIcon(new ImageIcon("src\\icons8_sort_right_26px.png"));
        EndGameFromPuseB.setIcon(new ImageIcon("src\\icons8_white_flag_48px.png"));
        Help.setVisible(false);
        SinglePlayerMinu.setVisible(false);
        Minu.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
        PlayingAreaP.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        input1.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        input2.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        input3.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        input4.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        input5.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        input6.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        input7.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        Backsound.loop(100);
        Board.ConnectLabelsOnBoardWithMatrix(A1, A2, A3, A4, A5, A6, A7, B1, B2, B3, B4, B5, B6, B7, C1, C2, C3, C4, C5, C6, C7, D1, D2, D3, D4, D5, D6, D7, E1, E2, E3, E4, E5, E6, E7, F1, F2, F3, F4, F5, F6, F7);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        GameMainMinu = new javax.swing.JPanel();
        SinglePlayerMinu = new javax.swing.JPanel();
        Cancel = new javax.swing.JButton();
        Start = new javax.swing.JButton();
        Easy = new javax.swing.JRadioButton();
        Normal = new javax.swing.JRadioButton();
        Hard = new javax.swing.JRadioButton();
        DifficultyL = new javax.swing.JLabel();
        Help = new javax.swing.JPanel();
        headline = new javax.swing.JLabel();
        line1L = new javax.swing.JLabel();
        line2L = new javax.swing.JLabel();
        line3L = new javax.swing.JLabel();
        line4L = new javax.swing.JLabel();
        line5L = new javax.swing.JLabel();
        helpPicure = new javax.swing.JLabel();
        DoneB = new javax.swing.JButton();
        Minu = new javax.swing.JPanel();
        SinglePlayerB = new javax.swing.JButton();
        MultiPlayerB = new javax.swing.JButton();
        ExitB = new javax.swing.JButton();
        HelpP = new javax.swing.JPanel();
        HelpL = new javax.swing.JLabel();
        BackGround = new javax.swing.JLabel();
        PlayingBoard = new javax.swing.JPanel();
        PlayingAreaP = new javax.swing.JPanel();
        input1 = new javax.swing.JPanel();
        input2 = new javax.swing.JPanel();
        input3 = new javax.swing.JPanel();
        input4 = new javax.swing.JPanel();
        input5 = new javax.swing.JPanel();
        input6 = new javax.swing.JPanel();
        input7 = new javax.swing.JPanel();
        TheWinner = new javax.swing.JPanel();
        PlayerL = new javax.swing.JLabel();
        WinsL = new javax.swing.JLabel();
        EndGameFromWinnerB = new javax.swing.JButton();
        NumberOfWinner = new javax.swing.JLabel();
        Drow = new javax.swing.JPanel();
        WinsL1 = new javax.swing.JLabel();
        EndGameFromWinnerB1 = new javax.swing.JButton();
        PuseMinu = new javax.swing.JPanel();
        MainMenuL = new javax.swing.JLabel();
        ContinueB = new javax.swing.JButton();
        EndGameFromPuseB = new javax.swing.JButton();
        ExitFromPuseB = new javax.swing.JButton();
        A1 = new javax.swing.JLabel();
        A2 = new javax.swing.JLabel();
        A3 = new javax.swing.JLabel();
        A4 = new javax.swing.JLabel();
        A5 = new javax.swing.JLabel();
        A6 = new javax.swing.JLabel();
        A7 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        B4 = new javax.swing.JLabel();
        B5 = new javax.swing.JLabel();
        B6 = new javax.swing.JLabel();
        B7 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        C4 = new javax.swing.JLabel();
        C5 = new javax.swing.JLabel();
        C6 = new javax.swing.JLabel();
        C7 = new javax.swing.JLabel();
        D1 = new javax.swing.JLabel();
        D2 = new javax.swing.JLabel();
        D3 = new javax.swing.JLabel();
        D4 = new javax.swing.JLabel();
        D5 = new javax.swing.JLabel();
        D6 = new javax.swing.JLabel();
        D7 = new javax.swing.JLabel();
        E1 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        E3 = new javax.swing.JLabel();
        E4 = new javax.swing.JLabel();
        E5 = new javax.swing.JLabel();
        E6 = new javax.swing.JLabel();
        E7 = new javax.swing.JLabel();
        F1 = new javax.swing.JLabel();
        F2 = new javax.swing.JLabel();
        F3 = new javax.swing.JLabel();
        F4 = new javax.swing.JLabel();
        F5 = new javax.swing.JLabel();
        F6 = new javax.swing.JLabel();
        F7 = new javax.swing.JLabel();
        board = new javax.swing.JLabel();
        Player1Red = new javax.swing.JPanel();
        Player1L = new javax.swing.JLabel();
        Player2blue = new javax.swing.JPanel();
        Player2L = new javax.swing.JLabel();
        PuseL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new java.awt.CardLayout());

        GameMainMinu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SinglePlayerMinu.setBackground(new java.awt.Color(144, 147, 207));
        SinglePlayerMinu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Cancel.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        Start.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        Start.setText("Start");
        Start.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });

        Easy.setBackground(new java.awt.Color(144, 147, 207));
        buttonGroup.add(Easy);
        Easy.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        Easy.setForeground(new java.awt.Color(255, 0, 0));
        Easy.setSelected(true);
        Easy.setText("Easy");
        Easy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Easy.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                EasyItemStateChanged(evt);
            }
        });

        Normal.setBackground(new java.awt.Color(144, 147, 207));
        buttonGroup.add(Normal);
        Normal.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        Normal.setText("Normal");
        Normal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Normal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                NormalItemStateChanged(evt);
            }
        });

        Hard.setBackground(new java.awt.Color(144, 147, 207));
        buttonGroup.add(Hard);
        Hard.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        Hard.setText("Hard");
        Hard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Hard.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                HardItemStateChanged(evt);
            }
        });

        DifficultyL.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        DifficultyL.setText("Difficulty");

        javax.swing.GroupLayout SinglePlayerMinuLayout = new javax.swing.GroupLayout(SinglePlayerMinu);
        SinglePlayerMinu.setLayout(SinglePlayerMinuLayout);
        SinglePlayerMinuLayout.setHorizontalGroup(
            SinglePlayerMinuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SinglePlayerMinuLayout.createSequentialGroup()
                .addGroup(SinglePlayerMinuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SinglePlayerMinuLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(SinglePlayerMinuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DifficultyL, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SinglePlayerMinuLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(SinglePlayerMinuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Normal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Easy, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Hard, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(SinglePlayerMinuLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        SinglePlayerMinuLayout.setVerticalGroup(
            SinglePlayerMinuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SinglePlayerMinuLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(DifficultyL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Easy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Normal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hard)
                .addGap(18, 18, 18)
                .addGroup(SinglePlayerMinuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        GameMainMinu.add(SinglePlayerMinu, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 370, 280));

        Help.setBackground(new java.awt.Color(255, 255, 255));
        Help.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        headline.setFont(new java.awt.Font("Bradley Hand ITC", 1, 36)); // NOI18N
        headline.setForeground(new java.awt.Color(255, 0, 0));
        headline.setText("How to Play Connect - 4 Game ");

        line1L.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        line1L.setText("It's a two-player connection board game,in which the players choose a colour and");

        line2L.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        line2L.setText("then take turns dropping coloured discs into a seven-column, six-row vertically");

        line3L.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        line3L.setText("suspended grid. The pieces fall straight down, occupying the lowest available ");

        line4L.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        line4L.setText("space within the column. The objective of the game is to be the first to form a ");

        line5L.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        line5L.setText("horizontal, vertical, or diagonal line of four of one's own discs.");

        helpPicure.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad-AL-Qerem\\Documents\\NetBeansProjects\\Connect4Game\\Images\\2021-07-18 220726.png")); // NOI18N

        DoneB.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        DoneB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad-AL-Qerem\\Documents\\NetBeansProjects\\Connect4Game\\Images\\icons8_checkmark_48px.png")); // NOI18N
        DoneB.setText("Done");
        DoneB.setToolTipText("play connect - 4 with AI using alpha beta algorethem");
        DoneB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DoneB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HelpLayout = new javax.swing.GroupLayout(Help);
        Help.setLayout(HelpLayout);
        HelpLayout.setHorizontalGroup(
            HelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HelpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(line2L, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                    .addComponent(line5L, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(line3L, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(line4L, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(HelpLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(helpPicure)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HelpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(HelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HelpLayout.createSequentialGroup()
                        .addComponent(headline)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HelpLayout.createSequentialGroup()
                        .addComponent(DoneB, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(373, 373, 373))))
            .addGroup(HelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(HelpLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(line1L, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        HelpLayout.setVerticalGroup(
            HelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HelpLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(headline)
                .addGap(53, 53, 53)
                .addComponent(line2L)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line3L)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line4L)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line5L)
                .addGap(18, 18, 18)
                .addComponent(helpPicure)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(DoneB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(HelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(HelpLayout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(line1L)
                    .addContainerGap(376, Short.MAX_VALUE)))
        );

        GameMainMinu.add(Help, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 870, 500));

        Minu.setBackground(new java.awt.Color(157, 196, 255));
        Minu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SinglePlayerB.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        SinglePlayerB.setText("Single Player");
        SinglePlayerB.setToolTipText("play connect - 4 with AI using alpha beta algorethem");
        SinglePlayerB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SinglePlayerB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SinglePlayerBActionPerformed(evt);
            }
        });

        MultiPlayerB.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        MultiPlayerB.setText("Multiplayer");
        MultiPlayerB.setToolTipText("play connect - 4 wiht a frind");
        MultiPlayerB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MultiPlayerB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiPlayerBActionPerformed(evt);
            }
        });

        ExitB.setFont(new java.awt.Font("Bradley Hand ITC", 0, 36)); // NOI18N
        ExitB.setText("Exit");
        ExitB.setToolTipText("Exit connect - 4 Game to disktop");
        ExitB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBActionPerformed(evt);
            }
        });

        HelpP.setBackground(new java.awt.Color(255, 255, 255));
        HelpP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HelpPMousePressed(evt);
            }
        });

        HelpL.setBackground(new java.awt.Color(255, 255, 255));
        HelpL.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        HelpL.setText("Help ?");
        HelpL.setToolTipText("how to play connect 4");
        HelpL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HelpL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HelpLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HelpLMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HelpLMousePressed(evt);
            }
        });

        javax.swing.GroupLayout HelpPLayout = new javax.swing.GroupLayout(HelpP);
        HelpP.setLayout(HelpPLayout);
        HelpPLayout.setHorizontalGroup(
            HelpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HelpPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(HelpL))
        );
        HelpPLayout.setVerticalGroup(
            HelpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HelpPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(HelpL))
        );

        javax.swing.GroupLayout MinuLayout = new javax.swing.GroupLayout(Minu);
        Minu.setLayout(MinuLayout);
        MinuLayout.setHorizontalGroup(
            MinuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MinuLayout.createSequentialGroup()
                .addGroup(MinuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MinuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(HelpP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MinuLayout.createSequentialGroup()
                        .addGroup(MinuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MinuLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(MultiPlayerB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(MinuLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(ExitB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 128, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(MinuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MinuLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(SinglePlayerB, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(213, Short.MAX_VALUE)))
        );

        MinuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ExitB, MultiPlayerB, SinglePlayerB});

        MinuLayout.setVerticalGroup(
            MinuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MinuLayout.createSequentialGroup()
                .addGroup(MinuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MinuLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(MultiPlayerB, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MinuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HelpP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ExitB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(MinuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MinuLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(SinglePlayerB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(222, Short.MAX_VALUE)))
        );

        MinuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ExitB, MultiPlayerB, SinglePlayerB});

        GameMainMinu.add(Minu, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 460, 300));
        GameMainMinu.add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(GameMainMinu, "card2");

        PlayingBoard.setBackground(new java.awt.Color(148, 66, 34));
        PlayingBoard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PlayingAreaP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        input1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        input1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                input1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                input1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout input1Layout = new javax.swing.GroupLayout(input1);
        input1.setLayout(input1Layout);
        input1Layout.setHorizontalGroup(
            input1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        input1Layout.setVerticalGroup(
            input1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        PlayingAreaP.add(input1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        input2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        input2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                input2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                input2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout input2Layout = new javax.swing.GroupLayout(input2);
        input2.setLayout(input2Layout);
        input2Layout.setHorizontalGroup(
            input2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        input2Layout.setVerticalGroup(
            input2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        PlayingAreaP.add(input2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        input3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        input3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                input3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                input3MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout input3Layout = new javax.swing.GroupLayout(input3);
        input3.setLayout(input3Layout);
        input3Layout.setHorizontalGroup(
            input3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        input3Layout.setVerticalGroup(
            input3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        PlayingAreaP.add(input3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        input4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        input4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                input4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                input4MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout input4Layout = new javax.swing.GroupLayout(input4);
        input4.setLayout(input4Layout);
        input4Layout.setHorizontalGroup(
            input4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        input4Layout.setVerticalGroup(
            input4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        PlayingAreaP.add(input4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        input5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        input5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                input5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                input5MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout input5Layout = new javax.swing.GroupLayout(input5);
        input5.setLayout(input5Layout);
        input5Layout.setHorizontalGroup(
            input5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        input5Layout.setVerticalGroup(
            input5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        PlayingAreaP.add(input5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, -1, -1));

        input6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        input6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                input6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                input6MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout input6Layout = new javax.swing.GroupLayout(input6);
        input6.setLayout(input6Layout);
        input6Layout.setHorizontalGroup(
            input6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        input6Layout.setVerticalGroup(
            input6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        PlayingAreaP.add(input6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, -1, -1));

        input7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        input7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                input7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                input7MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout input7Layout = new javax.swing.GroupLayout(input7);
        input7.setLayout(input7Layout);
        input7Layout.setHorizontalGroup(
            input7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        input7Layout.setVerticalGroup(
            input7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        PlayingAreaP.add(input7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, -1, -1));

        TheWinner.setBackground(new java.awt.Color(144, 147, 207));

        PlayerL.setFont(new java.awt.Font("Bradley Hand ITC", 1, 48)); // NOI18N
        PlayerL.setText("Player");

        WinsL.setFont(new java.awt.Font("Bradley Hand ITC", 1, 48)); // NOI18N
        WinsL.setText("WINS");

        EndGameFromWinnerB.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        EndGameFromWinnerB.setText("End Game");
        EndGameFromWinnerB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EndGameFromWinnerB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndGameFromWinnerBActionPerformed(evt);
            }
        });

        NumberOfWinner.setFont(new java.awt.Font("Bradley Hand ITC", 1, 48)); // NOI18N
        NumberOfWinner.setText("1");

        javax.swing.GroupLayout TheWinnerLayout = new javax.swing.GroupLayout(TheWinner);
        TheWinner.setLayout(TheWinnerLayout);
        TheWinnerLayout.setHorizontalGroup(
            TheWinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TheWinnerLayout.createSequentialGroup()
                .addGroup(TheWinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TheWinnerLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(PlayerL, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NumberOfWinner, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(WinsL))
                    .addGroup(TheWinnerLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(EndGameFromWinnerB)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        TheWinnerLayout.setVerticalGroup(
            TheWinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TheWinnerLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(TheWinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumberOfWinner, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlayerL)
                    .addComponent(WinsL))
                .addGap(18, 18, 18)
                .addComponent(EndGameFromWinnerB)
                .addGap(47, 47, 47))
        );

        PlayingAreaP.add(TheWinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 380, 190));

        Drow.setBackground(new java.awt.Color(144, 147, 207));

        WinsL1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 48)); // NOI18N
        WinsL1.setText("Draw");

        EndGameFromWinnerB1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        EndGameFromWinnerB1.setText("End Game");
        EndGameFromWinnerB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EndGameFromWinnerB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndGameFromWinnerB1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DrowLayout = new javax.swing.GroupLayout(Drow);
        Drow.setLayout(DrowLayout);
        DrowLayout.setHorizontalGroup(
            DrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrowLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(DrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EndGameFromWinnerB1)
                    .addComponent(WinsL1))
                .addGap(122, 122, 122))
        );
        DrowLayout.setVerticalGroup(
            DrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrowLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(WinsL1)
                .addGap(18, 18, 18)
                .addComponent(EndGameFromWinnerB1)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        PlayingAreaP.add(Drow, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, -1));

        PuseMinu.setBackground(new java.awt.Color(144, 147, 207));
        PuseMinu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PuseMinu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PuseMinu.setEnabled(false);

        MainMenuL.setFont(new java.awt.Font("Bradley Hand ITC", 1, 36)); // NOI18N
        MainMenuL.setText("Main Menu");

        ContinueB.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        ContinueB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad-AL-Qerem\\Documents\\NetBeansProjects\\Connect4Game\\Images\\icons8_sort_right_26px.png")); // NOI18N
        ContinueB.setText("continue");
        ContinueB.setToolTipText("play connect - 4 wiht a frind");
        ContinueB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ContinueB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueBActionPerformed(evt);
            }
        });

        EndGameFromPuseB.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        EndGameFromPuseB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad-AL-Qerem\\Documents\\NetBeansProjects\\Connect4Game\\Images\\icons8_white_flag_48px.png")); // NOI18N
        EndGameFromPuseB.setText("End Game");
        EndGameFromPuseB.setToolTipText("play connect - 4 wiht a frind");
        EndGameFromPuseB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EndGameFromPuseB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndGameFromPuseBActionPerformed(evt);
            }
        });

        ExitFromPuseB.setFont(new java.awt.Font("Bradley Hand ITC", 0, 36)); // NOI18N
        ExitFromPuseB.setText("Exit");
        ExitFromPuseB.setToolTipText("Exit connect - 4 Game to disktop");
        ExitFromPuseB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitFromPuseB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitFromPuseBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PuseMinuLayout = new javax.swing.GroupLayout(PuseMinu);
        PuseMinu.setLayout(PuseMinuLayout);
        PuseMinuLayout.setHorizontalGroup(
            PuseMinuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PuseMinuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PuseMinuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExitFromPuseB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ContinueB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PuseMinuLayout.createSequentialGroup()
                        .addComponent(MainMenuL, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(PuseMinuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PuseMinuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(EndGameFromPuseB, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PuseMinuLayout.setVerticalGroup(
            PuseMinuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PuseMinuLayout.createSequentialGroup()
                .addComponent(MainMenuL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(ContinueB, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(ExitFromPuseB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PuseMinuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PuseMinuLayout.createSequentialGroup()
                    .addGap(141, 141, 141)
                    .addComponent(EndGameFromPuseB, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(90, Short.MAX_VALUE)))
        );

        PuseMinuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ContinueB, ExitFromPuseB});

        PlayingAreaP.add(PuseMinu, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, -1, -1));
        PlayingAreaP.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 628, 100, 90));
        PlayingAreaP.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 628, 100, 90));
        PlayingAreaP.add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 628, 100, 90));
        PlayingAreaP.add(A4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 628, 100, 90));
        PlayingAreaP.add(A5, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 628, 100, 90));
        PlayingAreaP.add(A6, new org.netbeans.lib.awtextra.AbsoluteConstraints(897, 628, 100, 90));
        PlayingAreaP.add(A7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 628, 100, 90));
        PlayingAreaP.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 527, 100, 90));
        PlayingAreaP.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 528, 100, 90));
        PlayingAreaP.add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 527, 100, 90));
        PlayingAreaP.add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 527, 100, 90));
        PlayingAreaP.add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 527, 100, 90));
        PlayingAreaP.add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(897, 527, 100, 90));
        PlayingAreaP.add(B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1002, 527, 100, 90));
        PlayingAreaP.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 427, 100, 90));
        PlayingAreaP.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 427, 100, 90));
        PlayingAreaP.add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 427, 100, 90));
        PlayingAreaP.add(C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 427, 100, 90));
        PlayingAreaP.add(C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 427, 100, 90));
        PlayingAreaP.add(C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(896, 427, 100, 90));
        PlayingAreaP.add(C7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1002, 427, 100, 90));
        PlayingAreaP.add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 327, 100, 90));
        PlayingAreaP.add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 327, 100, 90));
        PlayingAreaP.add(D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 327, 100, 90));
        PlayingAreaP.add(D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 327, 100, 90));
        PlayingAreaP.add(D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 327, 100, 90));
        PlayingAreaP.add(D6, new org.netbeans.lib.awtextra.AbsoluteConstraints(897, 327, 100, 90));
        PlayingAreaP.add(D7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 327, 100, 90));
        PlayingAreaP.add(E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 227, 100, 90));
        PlayingAreaP.add(E2, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 227, 100, 90));
        PlayingAreaP.add(E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 227, 100, 90));
        PlayingAreaP.add(E4, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 227, 100, 90));
        PlayingAreaP.add(E5, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 227, 100, 90));
        PlayingAreaP.add(E6, new org.netbeans.lib.awtextra.AbsoluteConstraints(897, 227, 100, 90));
        PlayingAreaP.add(E7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1002, 227, 100, 90));
        PlayingAreaP.add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 127, 100, 90));
        PlayingAreaP.add(F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 127, 100, 90));
        PlayingAreaP.add(F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 127, 100, 90));
        PlayingAreaP.add(F4, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 127, 100, 90));
        PlayingAreaP.add(F5, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 127, 100, 90));
        PlayingAreaP.add(F6, new org.netbeans.lib.awtextra.AbsoluteConstraints(897, 127, 100, 90));
        PlayingAreaP.add(F7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1002, 127, 100, 90));

        board.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad-AL-Qerem\\Documents\\NetBeansProjects\\Connect4Game\\Images\\pnghut_connect-four-board-game-rectangle2.png")); // NOI18N
        PlayingAreaP.add(board, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 760, 670));

        Player1Red.setBackground(new java.awt.Color(148, 66, 34));

        Player1L.setFont(new java.awt.Font("Bradley Hand ITC", 1, 36)); // NOI18N
        Player1L.setForeground(new java.awt.Color(255, 255, 255));
        Player1L.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad-AL-Qerem\\Documents\\NetBeansProjects\\Connect4Game\\Images\\red.png")); // NOI18N
        Player1L.setText("Player 1");

        javax.swing.GroupLayout Player1RedLayout = new javax.swing.GroupLayout(Player1Red);
        Player1Red.setLayout(Player1RedLayout);
        Player1RedLayout.setHorizontalGroup(
            Player1RedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Player1RedLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Player1L, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Player1RedLayout.setVerticalGroup(
            Player1RedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Player1RedLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Player1L, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PlayingAreaP.add(Player1Red, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 250, 90));

        Player2blue.setBackground(new java.awt.Color(148, 66, 34));

        Player2L.setFont(new java.awt.Font("Bradley Hand ITC", 1, 36)); // NOI18N
        Player2L.setForeground(new java.awt.Color(255, 255, 255));
        Player2L.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad-AL-Qerem\\Documents\\NetBeansProjects\\Connect4Game\\Images\\blue.png")); // NOI18N
        Player2L.setText("Player 2");

        javax.swing.GroupLayout Player2blueLayout = new javax.swing.GroupLayout(Player2blue);
        Player2blue.setLayout(Player2blueLayout);
        Player2blueLayout.setHorizontalGroup(
            Player2blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player2blueLayout.createSequentialGroup()
                .addComponent(Player2L, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Player2blueLayout.setVerticalGroup(
            Player2blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player2blueLayout.createSequentialGroup()
                .addComponent(Player2L)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PlayingAreaP.add(Player2blue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 130, 250, 90));

        PuseL.setToolTipText("pause the game");
        PuseL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PuseL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PuseLMousePressed(evt);
            }
        });
        PlayingAreaP.add(PuseL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 28, 28));

        PlayingBoard.add(PlayingAreaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 1600, -1));

        getContentPane().add(PlayingBoard, "card3");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void MultiPlayerBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiPlayerBActionPerformed
        ControlSound.RunClip("src\\click.wav");
        ControlSound.setVol(Backsound, 0.2);
        PlayingBoard.setVisible(true);
        GameMainMinu.setVisible(false);
        PuseMinu.setVisible(false);
        TheWinner.setVisible(false);
        Drow.setVisible(false);
        NewGameBoard.setBor(Board.initializeMatrix());
        NewGameBoard.setGend(false);
        NewGameBoard.setTurn(NewGameBoard.getPlayer1());
        Player1L.setForeground(Color.red);
        Player2L.setForeground(Color.white);
        NewGameBoard.setAiPlaying(0);
    }//GEN-LAST:event_MultiPlayerBActionPerformed
    private void HelpLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpLMouseEntered
        if (!(Help.isVisible() || SinglePlayerMinu.isVisible())) {
            HelpL.setForeground(new Color(255, 0, 0));
            HelpL.setBackground(new Color(1.0f, 1.0f, 1.0f, 1.0f));
        }
    }//GEN-LAST:event_HelpLMouseEntered
    private void HelpLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpLMouseExited
        if (!(Help.isVisible() || SinglePlayerMinu.isVisible())) {
            HelpL.setForeground(new Color(0, 0, 0));
            HelpL.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
        }
    }//GEN-LAST:event_HelpLMouseExited
    private void ExitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBActionPerformed
        ControlSound.RunClip("src\\click.wav");
        exit(0);
    }//GEN-LAST:event_ExitBActionPerformed
    private void PuseLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PuseLMousePressed
        PuseMinu.setVisible(true);
    }//GEN-LAST:event_PuseLMousePressed
    private void ExitFromPuseBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitFromPuseBActionPerformed
        ControlSound.RunClip("src\\click.wav");
        exit(0);
    }//GEN-LAST:event_ExitFromPuseBActionPerformed
    private void ContinueBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueBActionPerformed
        ControlSound.RunClip("src\\click.wav");
        PuseMinu.setVisible(false);
    }//GEN-LAST:event_ContinueBActionPerformed
    private void EndGameFromPuseBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndGameFromPuseBActionPerformed
        ControlSound.RunClip("src\\click.wav");
        ControlSound.setVol(Backsound, 0.7);
        PuseMinu.setVisible(false);
        PlayingBoard.setVisible(false);
        GameMainMinu.setVisible(true);
        NewGameBoard.setBor(Board.initializeMatrix());
        Board.PrintBoard(NewGameBoard);
    }//GEN-LAST:event_EndGameFromPuseBActionPerformed
    private void HelpLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpLMousePressed
        Help.setVisible(true);
        ControlSound.RunClip("src\\click.wav");
    }//GEN-LAST:event_HelpLMousePressed
    private void DoneBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneBActionPerformed
        ControlSound.RunClip("src\\click.wav");
        Help.setVisible(false);
        Minu.setVisible(true);
    }//GEN-LAST:event_DoneBActionPerformed
    private void HelpPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpPMousePressed
        Minu.setVisible(false);
    }//GEN-LAST:event_HelpPMousePressed
    private void EndGameFromWinnerBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndGameFromWinnerBActionPerformed
        ControlSound.RunClip("src\\click.wav");
        ControlSound.setVol(Backsound, 0.7);
        PuseMinu.setVisible(false);
        PlayingBoard.setVisible(false);
        GameMainMinu.setVisible(true);
        NewGameBoard.setBor(Board.initializeMatrix());
        Board.PrintBoard(NewGameBoard);
    }//GEN-LAST:event_EndGameFromWinnerBActionPerformed
    private void SinglePlayerBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SinglePlayerBActionPerformed
        ControlSound.RunClip("src\\click.wav");
        SinglePlayerMinu.setVisible(true);
    }//GEN-LAST:event_SinglePlayerBActionPerformed
    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        ControlSound.RunClip("src\\click.wav");
        SinglePlayerMinu.setVisible(false);
    }//GEN-LAST:event_CancelActionPerformed
    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        ControlSound.RunClip("src\\click.wav");
        ControlSound.setVol(Backsound, 0.2);
        if (Easy.isSelected()) {
            NewGameBoard.setDifficulty(2);
        } else if (Normal.isSelected()) {
            NewGameBoard.setDifficulty(4);
        } else {
            NewGameBoard.setDifficulty(7);
        }
        PlayingBoard.setVisible(true);
        GameMainMinu.setVisible(false);
        SinglePlayerMinu.setVisible(false);
        PuseMinu.setVisible(false);
        TheWinner.setVisible(false);
        Drow.setVisible(false);
        PuseMinu.setVisible(false);
        NewGameBoard.setBor(Board.initializeMatrix());
        NewGameBoard.setGend(false);
        Player1L.setForeground(Color.red);
        Player2L.setForeground(Color.white);
        NewGameBoard.setAiPlaying(1);
        NewGameBoard.setTurn(0);
    }//GEN-LAST:event_StartActionPerformed
    private void EasyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_EasyItemStateChanged
        if (Easy.isSelected()) {
            Easy.setForeground(Color.red);
            Normal.setForeground(Color.black);
            Hard.setForeground(Color.black);
        }
    }//GEN-LAST:event_EasyItemStateChanged
    private void NormalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_NormalItemStateChanged
        if (Normal.isSelected()) {
            Easy.setForeground(Color.black);
            Normal.setForeground(Color.red);
            Hard.setForeground(Color.black);
        }
    }//GEN-LAST:event_NormalItemStateChanged
    private void HardItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_HardItemStateChanged
        if (Hard.isSelected()) {
            Easy.setForeground(Color.black);
            Normal.setForeground(Color.black);
            Hard.setForeground(Color.red);
        }
    }//GEN-LAST:event_HardItemStateChanged
    private void EndGameFromWinnerB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndGameFromWinnerB1ActionPerformed
        ControlSound.RunClip("src\\click.wav");
        ControlSound.setVol(Backsound, 0.7);
        PuseMinu.setVisible(false);
        PlayingBoard.setVisible(false);
        GameMainMinu.setVisible(true);
        NewGameBoard.setBor(Board.initializeMatrix());
        Board.PrintBoard(NewGameBoard);
    }//GEN-LAST:event_EndGameFromWinnerB1ActionPerformed
    private void input7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input7MousePressed
        int x = 6;
        ControlBoard.PlayersDrops(x, NewGameBoard,this);
    }//GEN-LAST:event_input7MousePressed
    private void input6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input6MousePressed
        int x = 5;
        ControlBoard.PlayersDrops(x, NewGameBoard,this);
    }//GEN-LAST:event_input6MousePressed
    private void input5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input5MousePressed
        int x = 4;
        ControlBoard.PlayersDrops(x, NewGameBoard,this);
    }//GEN-LAST:event_input5MousePressed
    private void input4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input4MousePressed
        int x = 3;
        ControlBoard.PlayersDrops(x, NewGameBoard,this);
    }//GEN-LAST:event_input4MousePressed
    private void input3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input3MousePressed
        int x = 2;
        ControlBoard.PlayersDrops(x, NewGameBoard,this);
    }//GEN-LAST:event_input3MousePressed
    private void input2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input2MousePressed
        int x = 1;
        ControlBoard.PlayersDrops(x, NewGameBoard,this);
    }//GEN-LAST:event_input2MousePressed
    private void input1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input1MousePressed
        int x = 0;
        ControlBoard.PlayersDrops(x, NewGameBoard,this);
    }//GEN-LAST:event_input1MousePressed
    private void input1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input1MouseExited
        input1.setBackground(brown1);
    }//GEN-LAST:event_input1MouseExited
    private void input1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input1MouseEntered
        if (NewGameBoard.getTurn() == 0) {
            input1.setBackground(Color.red);
        } else {
            input1.setBackground(blue1);
        }
    }//GEN-LAST:event_input1MouseEntered
    private void input1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input1MouseReleased
        if (NewGameBoard.getTurn() == 0) {
            input1.setBackground(Color.red);
        } else {
            input1.setBackground(blue1);
        }
    }//GEN-LAST:event_input1MouseReleased
    private void input2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input2MouseReleased
        if (NewGameBoard.getTurn() == 0) {
            input2.setBackground(Color.red);
        } else {
            input2.setBackground(blue1);
        }
    }//GEN-LAST:event_input2MouseReleased
    private void input3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input3MouseReleased
        if (NewGameBoard.getTurn() == 0) {
            input3.setBackground(Color.red);
        } else {
            input3.setBackground(blue1);
        }
    }//GEN-LAST:event_input3MouseReleased
    private void input4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input4MouseReleased
        if (NewGameBoard.getTurn() == 0) {
            input4.setBackground(Color.red);
        } else {
            input4.setBackground(blue1);
        }
    }//GEN-LAST:event_input4MouseReleased
    private void input5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input5MouseReleased
        if (NewGameBoard.getTurn() == 0) {
            input5.setBackground(Color.red);
        } else {
            input5.setBackground(blue1);
        }
    }//GEN-LAST:event_input5MouseReleased
    private void input6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input6MouseReleased
        if (NewGameBoard.getTurn() == 0) {
            input6.setBackground(Color.red);
        } else {
            input6.setBackground(blue1);
        }
    }//GEN-LAST:event_input6MouseReleased

    private void input7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input7MouseReleased
        if (NewGameBoard.getTurn() == 0) {
            input7.setBackground(Color.red);
        } else {
            input7.setBackground(blue1);
        }
    }//GEN-LAST:event_input7MouseReleased

    private void input2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input2MouseEntered
        if (NewGameBoard.getTurn() == 0) {
            input2.setBackground(Color.red);
        } else {
            input2.setBackground(blue1);
        }
    }//GEN-LAST:event_input2MouseEntered

    private void input3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input3MouseEntered
        if (NewGameBoard.getTurn() == 0) {
            input3.setBackground(Color.red);
        } else {
            input3.setBackground(blue1);
        }
    }//GEN-LAST:event_input3MouseEntered

    private void input4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input4MouseEntered
        if (NewGameBoard.getTurn() == 0) {
            input4.setBackground(Color.red);
        } else {
            input4.setBackground(blue1);
        }
    }//GEN-LAST:event_input4MouseEntered

    private void input5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input5MouseEntered
        if (NewGameBoard.getTurn() == 0) {
            input5.setBackground(Color.red);
        } else {
            input5.setBackground(blue1);
        }
    }//GEN-LAST:event_input5MouseEntered

    private void input6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input6MouseEntered
        if (NewGameBoard.getTurn() == 0) {
            input6.setBackground(Color.red);
        } else {
            input6.setBackground(blue1);
        }
    }//GEN-LAST:event_input6MouseEntered

    private void input7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input7MouseEntered
        if (NewGameBoard.getTurn() == 0) {
            input7.setBackground(Color.red);
        } else {
            input7.setBackground(blue1);
        }
    }//GEN-LAST:event_input7MouseEntered

    private void input2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input2MouseExited
        input2.setBackground(brown1);
    }//GEN-LAST:event_input2MouseExited

    private void input3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input3MouseExited
        input3.setBackground(brown1);
    }//GEN-LAST:event_input3MouseExited

    private void input4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input4MouseExited
        input4.setBackground(brown1);
    }//GEN-LAST:event_input4MouseExited

    private void input5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input5MouseExited
        input5.setBackground(brown1);
    }//GEN-LAST:event_input5MouseExited

    private void input6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input6MouseExited
        input6.setBackground(brown1);
    }//GEN-LAST:event_input6MouseExited
    private void input7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input7MouseExited
        input7.setBackground(brown1);
    }//GEN-LAST:event_input7MouseExited
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel A3;
    private javax.swing.JLabel A4;
    private javax.swing.JLabel A5;
    private javax.swing.JLabel A6;
    private javax.swing.JLabel A7;
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel B3;
    private javax.swing.JLabel B4;
    private javax.swing.JLabel B5;
    private javax.swing.JLabel B6;
    private javax.swing.JLabel B7;
    private javax.swing.JLabel BackGround;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JLabel C4;
    private javax.swing.JLabel C5;
    private javax.swing.JLabel C6;
    private javax.swing.JLabel C7;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton ContinueB;
    private javax.swing.JLabel D1;
    private javax.swing.JLabel D2;
    private javax.swing.JLabel D3;
    private javax.swing.JLabel D4;
    private javax.swing.JLabel D5;
    private javax.swing.JLabel D6;
    private javax.swing.JLabel D7;
    private javax.swing.JLabel DifficultyL;
    private javax.swing.JButton DoneB;
    public javax.swing.JPanel Drow;
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E2;
    private javax.swing.JLabel E3;
    private javax.swing.JLabel E4;
    private javax.swing.JLabel E5;
    private javax.swing.JLabel E6;
    private javax.swing.JLabel E7;
    private javax.swing.JRadioButton Easy;
    private javax.swing.JButton EndGameFromPuseB;
    private javax.swing.JButton EndGameFromWinnerB;
    private javax.swing.JButton EndGameFromWinnerB1;
    private javax.swing.JButton ExitB;
    private javax.swing.JButton ExitFromPuseB;
    private javax.swing.JLabel F1;
    private javax.swing.JLabel F2;
    private javax.swing.JLabel F3;
    private javax.swing.JLabel F4;
    private javax.swing.JLabel F5;
    private javax.swing.JLabel F6;
    private javax.swing.JLabel F7;
    private javax.swing.JPanel GameMainMinu;
    private javax.swing.JRadioButton Hard;
    private javax.swing.JPanel Help;
    private javax.swing.JLabel HelpL;
    private javax.swing.JPanel HelpP;
    private javax.swing.JLabel MainMenuL;
    private javax.swing.JPanel Minu;
    private javax.swing.JButton MultiPlayerB;
    private javax.swing.JRadioButton Normal;
    public javax.swing.JLabel NumberOfWinner;
    public javax.swing.JLabel Player1L;
    private javax.swing.JPanel Player1Red;
    public javax.swing.JLabel Player2L;
    private javax.swing.JPanel Player2blue;
    private javax.swing.JLabel PlayerL;
    private javax.swing.JPanel PlayingAreaP;
    private javax.swing.JPanel PlayingBoard;
    private javax.swing.JLabel PuseL;
    private javax.swing.JPanel PuseMinu;
    private javax.swing.JButton SinglePlayerB;
    private javax.swing.JPanel SinglePlayerMinu;
    private javax.swing.JButton Start;
    public javax.swing.JPanel TheWinner;
    private javax.swing.JLabel WinsL;
    private javax.swing.JLabel WinsL1;
    private javax.swing.JLabel board;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel headline;
    private javax.swing.JLabel helpPicure;
    private javax.swing.JPanel input1;
    private javax.swing.JPanel input2;
    private javax.swing.JPanel input3;
    private javax.swing.JPanel input4;
    private javax.swing.JPanel input5;
    private javax.swing.JPanel input6;
    private javax.swing.JPanel input7;
    private javax.swing.JLabel line1L;
    private javax.swing.JLabel line2L;
    private javax.swing.JLabel line3L;
    private javax.swing.JLabel line4L;
    private javax.swing.JLabel line5L;
    // End of variables declaration//GEN-END:variables
}