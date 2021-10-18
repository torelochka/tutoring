package ru.itis;

import java.util.Scanner;

public class Task2New {

    public static void main(String[] args) {
        int[][] board = new int[8][8];
        printResult(board);

        Scanner src = new Scanner(System.in);

        int n = src.nextInt();

        int row;
        int column;
        int type;

        int[][] fields = new int[n][3];

        for (int i = 0; i < n; i++) {
            row = src.nextInt();
            column = src.nextInt();
            type = src.nextInt();

            fields[i][0] = row;
            fields[i][1] = column;
            fields[i][2] = type;

            board[row][column] = type;
        }

        for (int i = 0; i < n; i++) {
            fillBoard(fields[i][0], fields[i][1], fields[i][2], board);
        }

        int m = src.nextInt();
        String res = "";

        for (int i = 0; i < m; i++) {
            row = src.nextInt();
            column = src.nextInt();

            res += (board[row][column] != 0 ? "YES" : "NO") + "\n";
        }

        System.out.println(res);

        printResult(board);
    }

    private static void printResult(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillBoard(int row, int column, int type, int[][] board) {
        if (type == 2) {
            moveRook(row, column, board);
        } else if (type == 3) {
            moveBishop(row, column, board);
        } else if (type == 4) {
            moveHorse(row, column, board);
        }
    }

    private static void moveHorse(int row, int column, int[][] board) {
        // ход вверх
        if (row - 2 >= 0 ) {
            // ход влево
            if (column - 1 >= 0 && board[row - 2][column - 1] == 0) {
               board[row - 2][column - 1] = 1;
            }
            // ход вправо
            if (column + 1 < board.length && board[row - 2][column + 1] == 0) {
                board[row - 2][column + 1] = 1;
            }
        }
        // ход вниз
        if (row + 2 < board.length) {
            // ход влево
            if (column - 1 >= 0 && board[row + 2][column - 1] == 0) {
                board[row + 2][column - 1] = 1;
            }
            // ход вправо
            if (column + 1 < board.length && board[row + 2][column + 1] == 0) {
                board[row + 2][column + 1] = 1;
            }
        }
        // ход влево
        if (column - 2 >= 0) {
            // ход вверх
            if (row - 1 >= 0 && board[row - 1][column - 2] == 0) {
                board[row - 1][column - 2] = 1;
            }
            // ход вниз
            if (row + 1 < board.length && board[row + 1][column - 2] == 0) {
                board[row + 1][column - 2] = 1;
            }
        }
        // ход вправо
        if (column + 2 < board.length) {
            // ход вверх
            if (row - 1 >= 0 && board[row - 1][column + 2] == 0) {
                board[row - 1][column + 2] = 1;
            }
            // ход вниз
            if (row + 1 < board.length && board[row + 1][column + 2] == 0) {
                board[row + 1][column + 2] = 1;
            }
        }
    }

    private static void moveBishop(int row, int column, int[][] board) {
        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] > 1) {
                break;
            }
            board[i][j] = 1;
        }
        for (int i = row - 1, j = column + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] > 1) {
                break;
            }
            board[i][j] = 1;
        }
        for (int i = row + 1, j = column - 1; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] > 1) {
                break;
            }
            board[i][j] = 1;
        }
        for (int i = row + 1, j = column + 1; i < board.length && j < board.length; i++, j++) {
            if (board[i][j] > 1) {
                break;
            }
            board[i][j] = 1;
        }
    }

    private static void moveRook(int row, int column, int[][] board) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][column] > 1) {
                break;
            }
            board[i][column] = 1;
        }
        for (int i = row + 1; i < board.length; i++) {
            if (board[i][column] > 1) {
                break;
            }
            board[i][column] = 1;
        }
        for (int j = column - 1; j >= 0; j--) {
            if (board[row][j] > 1) {
                break;
            }
            board[row][j] = 1;
        }
        for (int j = column + 1; j < board.length; j++) {
            if (board[row][j] > 1) {
                break;
            }
            board[row][j] = 1;
        }
    }
}
