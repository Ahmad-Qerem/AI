package Game;
import java.awt.Color;
import GUI_Package.GUI_Frame_MainMenu;
import static java.lang.Integer.max;
import static java.lang.Integer.min;
import java.util.Random;
public class ControlBoard {
    static Random R = new Random();
    ControlSound CS = new ControlSound();
    public ControlBoard() {
    }
    /*public static LinkedList<int[][]> GetSuccessors(Board bord, int player) {
        LinkedList<int[][]> children = new LinkedList<int[][]>();
        for (int col = 0; col < 7; col++) {
            if (validMove(bord, col) && !terminal(bord)) {
                Board child = new Board();
                copyِArray(child.getBor(), bord.getBor());
                int nextRow = nextRow(child.getBor(), col);
                drop(child.getBor(), nextRow, col, player);
                children.add(child.getBor());
            }
        }
        return children;
    }*/
    public static boolean validMove(Board board, int col) {
        return board.getBor()[5][col] == -1;
    }
    public static void drop(int[][] board, int row, int col, int piece) {
        board[row][col] = piece;
    }
    public static int score_pos(int[][] board, int piece) {
        int score = 0;
        int[] rarray;
        rarray = new int[7];
        int[] wind;
        wind = new int[4];
        int[] carray;
        carray = new int[7];
        //horizen
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                rarray[j] = board[i][j];
            }
            for (int k = 0; k < 4; k++) {
                wind[0] = rarray[k];
                wind[1] = rarray[k + 1];
                wind[2] = rarray[k + 2];
                wind[3] = rarray[k + 3];
                if (count(wind, piece) == 4) {
                    score += 100;
                } else if ((count(wind, 0) == 3) && count(wind, -1) == 1) {
                    score -= 80;
                } else if (count(wind, piece) == 3 && count(wind, -1) == 1) {
                    score += 10;
                } else if (count(wind, piece) == 2 && count(wind, -1) == 2) {
                    score += 5;
                }
            }
        }
        //vertic
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                carray[j] = board[j][i];
            }
            for (int k = 0; k < 4; k++) {
                wind[0] = carray[k];
                wind[1] = carray[k + 1];
                wind[2] = carray[k + 2];
                wind[3] = carray[k + 3];
                if (count(wind, piece) == 4) {
                    score += 100;
                } else if ((count(wind, 0) == 3) && count(wind, -1) == 1) {
                    score -= 80;
                } else if (count(wind, piece) == 3 && count(wind, -1) == 1) {
                    score += 10;
                } else if (count(wind, piece) == 2 && count(wind, -1) == 2) {
                    score += 5;
                }
            }
        }
        //pos slope
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    wind[k] = board[i + k][j + k];
                    if (count(wind, piece) == 4) {
                        score += 100;
                    } else if ((count(wind, 0) == 3) && count(wind, -1) == 1) {
                        score -= 80;
                    } else if (count(wind, piece) == 3 && count(wind, -1) == 1) {
                        score += 10;
                    } else if (count(wind, piece) == 2 && count(wind, -1) == 2) {
                        score += 5;
                    }
                }
            }
        }
        //neg slope
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    wind[k] = board[i - k + 3][j + k];
                    if (count(wind, piece) == 4) {
                        score += 100;
                    } else if ((count(wind, 0) == 3) && count(wind, -1) == 1) {
                        score -= 80;
                    } else if (count(wind, piece) == 3 && count(wind, -1) == 1) {
                        score += 10;
                    } else if (count(wind, piece) == 2 && count(wind, -1) == 2) {
                        score += 5;
                    }
                }
            }
        }
        return score;
    }
    public static boolean terminal(Board board) {
        return win(board, 0) || win(board, 1);
    }
    public static boolean win(Board board, int piece) {
        boolean c = false;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                if ((board.getBor()[j][i] == piece) && (board.getBor()[j][i + 1] == piece) && (board.getBor()[j][i + 2] == piece) && (board.getBor()[j][i + 3] == piece)) {
                    c = true;
                    break;
                }
            }
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                if ((board.getBor()[j][i] == piece) && (board.getBor()[j + 1][i] == piece) && (board.getBor()[j + 2][i] == piece) && (board.getBor()[j + 3][i] == piece)) {
                    c = true;
                    break;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if ((board.getBor()[j][i] == piece) && (board.getBor()[j + 1][i + 1] == piece) && (board.getBor()[j + 2][i + 2] == piece) && (board.getBor()[j + 3][i + 3] == piece)) {
                    c = true;
                    break;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j < 6; j++) {
                if ((board.getBor()[j][i] == piece) && (board.getBor()[j - 1][i + 1] == piece) && (board.getBor()[j - 2][i + 2] == piece) && (board.getBor()[j - 3][i + 3] == piece)) {
                    c = true;
                    break;
                }
            }
        }
        return c;
    }
    static int count(int[] array, int num) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                count++;
            }
        }
        return count;
    }
    public static void copyِArray(int[][] old, int[][] current) {
        for (int i = 0; i < old.length; i++) {
            for (int j = 0; j < old[i].length; j++) {
                old[i][j] = current[i][j];
            }
        }
    }
    public static int nextRow(int[][] board, int col) {
        int r = 3;
        for (int i = 0; i < 6; i++) {
            if (board[i][col] == -1) {
                r = i;
                break;
            }
        }
        return r;
    }
    public static boolean chackDraw(Board bor) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (bor.getBor()[i][j] == -1) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void PlayersDrops(int x, Board bord, GUI_Frame_MainMenu GUI) {
        if (!bord.isGend()) {
            if (Board.getAiPlaying() != 1) {
                InputMove(x, bord, GUI);
            } else {
                InputMoveVsAI(x, bord, GUI);
            }
        }
    }
    private static void InputMove(int x, Board bord, GUI_Frame_MainMenu GUI) {
        if (bord.getTurn() == 0) {
            if (validMove(bord, x)) {
                bord.setRow(nextRow(bord.getBor(), x));
                drop(bord.getBor(), bord.getRow(), x, 0);
                Board.PrintBoard(bord);
                ControlSound.RunClip("src\\drop.wav");
                if (win(bord, 0)) {
                    GUI.NumberOfWinner.setText("1");
                    GUI.TheWinner.setVisible(true);
                    ControlSound.RunClip("src\\win.wav");
                    bord.setGend(true);
                } else if (chackDraw(bord)) {
                    GUI.Drow.setVisible(true);
                    bord.setGend(true);
                } else {
                    bord.setTurn((bord.getTurn() + 1) % 2);
                    GUI.Player1L.setForeground(Color.white);
                    GUI.Player2L.setForeground(Color.red);
                }
            }
        } else if (bord.getTurn() == 1) {
            if (validMove(bord, x)) {
                bord.setRow(nextRow(bord.getBor(), x));
                drop(bord.getBor(), bord.getRow(), x, 1);
                Board.PrintBoard(bord);
                ControlSound.RunClip("src\\drop.wav");
                if (win(bord, 1)) {
                    GUI.NumberOfWinner.setText("2");
                    GUI.TheWinner.setVisible(true);
                    ControlSound.RunClip("src\\win.wav");
                    bord.setGend(true);
                } else if (chackDraw(bord)) {
                    GUI.Drow.setVisible(true);
                    bord.setGend(true);
                } else {
                    bord.setTurn((bord.getTurn() + 1) % 2);
                    GUI.Player1L.setForeground(Color.red);
                    GUI.Player2L.setForeground(Color.white);
                }
            }
        }
    }
    public static int AIMove(Board board) {
        int moveAI = R.nextInt(7);
        switch (board.getDifficulty()) {
            case 2 -> {
                if (board.getRand() == 2) {
                    board.setRand(0);
                    return alphaBeta(board, 4, -9999999, 9999999, true)[0];
                } else {
                    while (true) {
                        if (validMove(board, moveAI)) {
                            board.setRand(board.getRand() + 1);
                            return moveAI;
                        }
                        moveAI = R.nextInt(7);
                    }

                }
            }
            case 4 -> {
               /* if (board.getRand() == 1) {
                    while (true) {
                        if (validMove(board, moveAI)) {
                            return moveAI;
                        }
                        moveAI =R.nextInt(6);
                    }
                } else {
                    board.setRand((board.getRand() + 1) % 2);*/
                    return alphaBeta(board, 3, -9999999, 9999999, true)[0];
               // }
            }
            default -> {
                return alphaBeta(board, 8, -9999999, 9999999, true)[0];
            }
        }
    }
    private static void InputMoveVsAI(int x, Board board, GUI_Frame_MainMenu GUI) {
        for (int i = 0; i < 2; i++) {
            Board.PrintBoard(board);
            if (board.getTurn() == 0) {
                if (validMove(board, x)) {
                    board.setRow(nextRow(board.getBor(), x));
                    drop(board.getBor(), board.getRow(), x, 0);
                    Board.PrintBoard(board);
                    ControlSound.RunClip("src\\drop.wav");
                    Board.PrintBoard(board);
                    if (win(board, 0)) {
                        GUI.NumberOfWinner.setText("1");
                        GUI.TheWinner.setVisible(true);
                        ControlSound.RunClip("src\\win.wav");
                        board.setGend(true);
                        break;
                    } else if (chackDraw(board)) {
                        GUI.Drow.setVisible(true);
                        board.setGend(true);
                        break;
                    } else {
                        board.setTurn((board.getTurn() + 1) % 2);
                        GUI.Player2L.setForeground(Color.red);
                        GUI.Player1L.setForeground(Color.white);
                    }
                }
            } else if (board.getTurn() == 1) {
                int colo = AIMove(board);
                        //alphaBeta(board,board.getDifficulty(), -9999999, 9999999, true)[0];
                System.out.println(colo);
                if (validMove(board, colo)) {
                    board.setRow(nextRow(board.getBor(), colo));
                    drop(board.getBor(), board.getRow(),colo,1);
                    Board.PrintBoard(board);
                    ControlSound.RunClip("src\\drop.wav");
                    if (win(board, 1)) {
                        GUI.NumberOfWinner.setText("2");
                        GUI.TheWinner.setVisible(true);
                        ControlSound.RunClip("src\\win.wav");
                        board.setGend(true);
                    } else if (chackDraw(board)) {
                        GUI.Drow.setVisible(true);
                        board.setGend(true);
                    } else {
                        board.setTurn((board.getTurn() + 1) % 2);
                        GUI.Player1L.setForeground(Color.red);
                        GUI.Player2L.setForeground(Color.white);
                    }
                }
            }
        }
    }
    public static int[] alphaBeta(Board board, int depth, int alpha, int beta, boolean maximizingPlayer) {
        boolean term = ControlBoard.terminal(board);
        if (depth == 1 || term) {
            if (term) {
                int[] v;
                v = new int[2];
                if (ControlBoard.win(board, 1)) {
                    v[0] = 0;
                    v[1] = 1000000;
                    return v;
                } else if (ControlBoard.win(board, 0)) {
                    v[0] = 0;
                    v[1] = -1000000;
                    return v;
                } else {
                    v[0] = 0;
                    v[1] = 0;
                    return v;
                }
            } else {
                int[] v;
                v = new int[2];
                v[0] = 0;
                v[1] = ControlBoard.score_pos(board.getBor(), 1);
                return v;
            }
        }
        if (maximizingPlayer) {
            int[] v;
            v = new int[2];
            int value = -999999;
            int col = 3;
            for (int i = 0; i < 7; i++) {
                Board child = new Board();
                if (ControlBoard.validMove(board, i)) {
                    ControlBoard.copyِArray(child.getBor(), board.getBor());
                    int nextRow = ControlBoard.nextRow(child.getBor(), i);
                    ControlBoard.drop(child.getBor(), nextRow, i, 1);
                } else {
                    continue;
                }
                int nscore = alphaBeta(child, depth - 1, alpha, beta, false)[1];
                if (nscore > value) {
                    value = nscore;
                    col = i;
                }
                alpha = max(alpha, value);
                if (alpha >= beta) {
                    break;
                }
            }
            v[0] = col;
            v[1] = value;
            return v;
        } else {
            int[] v;
            v = new int[2];
            int value = 999999;
            int col = 3;
            for (int i = 0; i < 7; i++) {
                Board child = new Board();
                if (ControlBoard.validMove(board, i)) {
                    ControlBoard.copyِArray(child.getBor(), board.getBor());
                    int nextRow = ControlBoard.nextRow(child.getBor(), i);
                    ControlBoard.drop(child.getBor(), nextRow, i, 0);
                } else {
                    continue;
                }
                int nscore = alphaBeta(child, depth - 1, alpha, beta, true)[1];
                if (nscore < value) {
                    value = nscore;
                    col = i;
                }
                alpha = min(beta, value);
                if (alpha >= beta) {
                    break;
                }
            }
            v[0] = col;
            v[1] = value;
            return v;
        }
    }
}