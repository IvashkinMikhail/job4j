package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        for (int k = 0; k <= data.length - 2; k++) {
            if (data[0][0] != data[k + 1][k + 1]) {
                return false;
            }
        }
        for (int i = data.length - 1; i > 0; i--) {
            if (data[data.length - 1][0] != data[i - 1][data.length - 1 - i + 1]) {
                return false;
            }
        }

        return true;

    }
}
