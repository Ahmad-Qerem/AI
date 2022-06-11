package Game;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class Board {
    private  int crand = 2;
    private static final int player2 = 1;
    private static int AiPlaying = 0;
    private static final int AI = 1;
    private static final int player1 = 0;
    private int rand = 0;
    private int Difficulty = 2;
    private int turn = 0;
    private boolean gend = false;
    private int[][] bor = new int[6][7];
    static JLabel [][]Lables=new JLabel[6][7];
    private int row;
    ControlBoard control =new ControlBoard();
    public Board() {
       bor=initializeMatrix();
    }
    public  int getCrand() {
        return crand;
    }
    public  void setCrand(int crand) {
        this.crand = crand;
    }
    public static int getAiPlaying() {
        return AiPlaying;
    }
    public  void setAiPlaying(int AiPlaying) {
        Board.AiPlaying = AiPlaying;
    }
    public int getRand() {
        return rand;
    }
    public int getAI() {
        return AI;
    }
    public  void setRand(int rand) {
        this.rand = rand;
    }
    public int getDifficulty() {
        return Difficulty;
    }
    public int getPlayer1() {
        return player1;
    }
    public void setDifficulty(int Difficulty) {
        this.Difficulty = Difficulty;
    }
    public int getTurn() {
        return turn;
    }
    public void setTurn(int turn) {
        this.turn = turn;
    }
    public boolean isGend() {
        return gend;
    }
    public void setGend(boolean gend) {
        this.gend = gend;
    }
    public int[][] getBor() {
        return bor;
    }
    public void setBor(int[][] bor) {
        this.bor = bor;
    }
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public static int[][] initializeMatrix() {
        int rows = 6;
        int column = 7;
        int[][] arr = new int[rows][column];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = -1;
            }
        }
        return arr;
    }
    static void showColor(int bord, JLabel L) {
        switch (bord) {
            case -1 ->
                L.setIcon(null);
            case 0 ->
                L.setIcon(new ImageIcon("..\\Images\\red.png"));
            case 1 ->
                L.setIcon(new ImageIcon("..\\Images\\blue.png"));
            default -> {
            }
        }
    }
    public static void PrintBoard(Board bord) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                showColor(bord.getBor()[i][j], Lables[i][j]);
            }
        }
    }
    public static void ConnectLabelsOnBoardWithMatrix(JLabel... lables) {
        int k = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <7; j++) {
                Lables[i][j] = lables[k];
                k = k + 1;
            }
        }
    }

}