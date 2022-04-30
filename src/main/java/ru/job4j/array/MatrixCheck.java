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

    public static void main(String[] args) {
        char[][] data = {
                {'X', 'X', ' '},
                {'X', 'X', 'X'},
                {'X', ' ', ' '}
        };
        int row = 1;
        int cell = 0;
        System.out.println(monoHorizontal(data, row));
        System.out.println(monoVertical(data, cell));
    }
}
