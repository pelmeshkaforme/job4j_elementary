package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] data, int row) {
        boolean rsl = true;
        for (int i = row; i <= row; i++) {
            for (int j = 0; j < data[row].length; j++) {
                if (data[row][j] != 'X') {
                    rsl = false;
                    break;
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        char[][] data = {
                {' ', 'X', ' '},
                {'X', 'X', 'X'},
                {'X', ' ', ' '}
        };
        int row = 0;
        System.out.println(monoHorizontal(data, row));
    }
}
