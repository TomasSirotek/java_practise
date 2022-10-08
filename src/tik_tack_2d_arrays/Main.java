package tik_tack_2d_arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Player 1, enter name = ? ");
        String player1 = in.nextLine();

        System.out.println("Player 2, enter name = ? ");
        String player2 = in.nextLine();

        // 3x3 tik tac toe => 2D array
        // - empty space
        // x player 0
        // o player 1
        char[][]  board = new char[3][3];

        // fill board with empty spaces
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board.length; c++) {
                board[r][c] = '-';
            }
        }

        // keep track of whos turn it is

        boolean isPlayer1 = true;

        char symbol = ' ';
        if(isPlayer1){
            symbol = 'X';
        }else {
            symbol = 'O';
        }

        // print players turn

        if(isPlayer1){
            System.out.println(player1 + "'s Turn");
        }else {
            System.out.println(player2 + "'s Turn(o)");
        }

        // rows and cols
        int row = 0;
        int col = 0;

        while (true){
        // Get row and col from user
        System.out.println("Enter row (0,1,2)");
         row = in.nextInt();

        System.out.println("Enter col (0,1,2)");
         col = in.nextInt();

        // check if row and col are valid
        if(row < 0 || col < 0 || row > 2 || col > 2){
            System.out.println("Row and col are out of bounds");
        }else if(board[row][col] != '-'){
            System.out.println("Already taken");
        } else {
            // row and col are valid
            break;
        }
        }

        // setting the position to the board to the player's symbol
        board[row][col] = symbol;
        drawBoard(board);

    }

    // draw the board
    private static void drawBoard(char[][] board){
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board.length; c++) {
                System.out.print(board[r][c]);
            }
            System.out.println();
        }
    }

    public static char hasWon(char[][] board){
        return 's';
    }

}
