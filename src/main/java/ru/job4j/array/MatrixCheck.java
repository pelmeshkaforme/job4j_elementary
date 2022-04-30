package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] data, int row) {
        boolean rsl = true;
        for (int i = row; i <= row; i++) {
            for (int j = 0; j < data[row].length; j++) {
                if (data[i][j] != 'X') {
                    rsl = false;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean monoVertical(char[][] data, int cell) {
        boolean rsl = true;
        for (int i = 0; i < data.length; i++) {
            for (int j = cell; j <= cell; j++) {
                if (data[i][j] != 'X') {
                    rsl = false;
                    break;
                }
            }
        }
        return rsl;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (j == i) {
                    rsl[i] = board[i][j];
                    break;
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        char[][] data = {
                {'X', 'X', ' '},
                {'X', 'X', 'X'},
                {'X', ' ', 'R'}
        };
        int row = 1;
        int cell = 0;
        System.out.println(monoHorizontal(data, row));
        System.out.println(monoVertical(data, cell));
        System.out.println();
        char[] rsl = extractDiagonal(data);
        for (int i = 0; i < rsl.length; i++) {
                System.out.println(rsl[i]);
        }
    }
}
