package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board[row].length; index++) {
            char num = 'X';
            if (board[index].equals(num)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = false;
        char num = 'X';
        for (int index = 0; index < board.length; index++) {
            if (board[index][column] == num) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
               rsl[index] = board[index][index];
          }
        return rsl;
    }
}