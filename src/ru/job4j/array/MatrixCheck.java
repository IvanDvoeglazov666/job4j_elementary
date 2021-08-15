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
}