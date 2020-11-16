package assignment8;

import java.util.*;



/**
 * I put some codes I wrote in ticTacToe.java file which can give some tips I think.
 * You can just delete codes or functions I wrote if you come up with some other methods to finish the requirements.
 */

public class TicTacToe {

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe!");
        Scanner console = new Scanner(System.in);
        System.out.println("Do you want to play the game? Enter 'y' to continue");
        Random random = new Random();
        String answer = console.nextLine();
        if (answer.equals("y")) {
            String[] board = new String[]{" ", " ", " ", " ", " ", " ", " ", " ", " "};
            printGameBoard(board);
            System.out.println("You will be playing against CPU, your move will be 'X' and CPU's move will be 'O'");
            while (true) {
                // player's turn
                if (winCheck(board)) {
                    System.out.println("CPU won, sorry :(");
                    break;
                }
                System.out.println("It is your turn!");
                System.out.println("Enter your placement (1-9): ");
                int playerPos = console.nextInt();
                while (inValidInput(playerPos)) {
                    System.out.println("Invalid position, please choose between 1-9: ");
                    playerPos = console.nextInt();
                }
                if (!positionTaken(playerPos, board)) {
                    placePiece(board, playerPos, "player");
                } else {
                    while (positionTaken(playerPos, board)) {
                        System.out.println("This position is already taken, please select another position: ");
                        playerPos = console.nextInt();
                    }
                    placePiece(board, playerPos, "player");
                }
                System.out.println("Your Move: ");
                printGameBoard(board);
                if (checkDraw(board)) {
                    System.out.println("It's draw! Game Over..");
                    break;
                }

                // cpu's turn
                if (winCheck(board)) {
                    System.out.println("You won, congrats!");
                    break;
                }
                int cpuMove = random.nextInt(9) + 1;
                while (positionTaken(cpuMove, board)) {
                    cpuMove = random.nextInt(9) + 1;
                }
                placePiece(board, cpuMove, "cpu");
                System.out.println("CPU's Move: ");
                printGameBoard(board);
            }
        } else {
            System.out.println("Bye bye!");
            return;
        }



    }

    private static boolean checkDraw(String[] board) {
        boolean draw = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i].equals(" ")) {
                draw = false;
            }
        }
        return !winCheck(board) && draw;
    }

    private static boolean positionTaken(int playerPos, String[] board) {
        return !board[playerPos - 1].equals(" ");
    }

    private static boolean inValidInput(int playerPos) {
        return playerPos > 9 || playerPos < 1;
    }


    private static boolean winCheck(String[] board) {
        return ((board[0].equals(board[1]) && board[1].equals(board[2]) && !board[0].equals(" ")) ||
                (board[3].equals(board[4]) && board[4].equals(board[5]) && !board[3].equals(" ")) ||
                (board[6].equals(board[7]) && board[7].equals(board[8]) && !board[6].equals(" ")) ||
                (board[0].equals(board[3]) && board[3].equals(board[6]) && !board[0].equals(" ")) ||
                (board[1].equals(board[4]) && board[4].equals(board[7]) && !board[1].equals(" ")) ||
                (board[2].equals(board[5]) && board[5].equals(board[8]) && !board[2].equals(" ")) ||
                (board[0].equals(board[4]) && board[4].equals(board[8]) && !board[0].equals(" ")) ||
                (board[2].equals(board[4]) && board[4].equals(board[6]) && !board[2].equals(" ")));
    }


    public static void printGameBoard(String[] board) {
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
    }

    public static void placePiece(String[] gameBoard, int pos, String user) {

        char symbol = ' ';
        if (user.equals("player")) {
            symbol = 'X';
            gameBoard[pos - 1] = symbol + "";
        } else if (user.equals("cpu")) {
            symbol = 'O';
            gameBoard[pos - 1] = symbol + "";
        }

        // write your code here

    }

    public static String checkWinner() {
        return "a";
    }

}