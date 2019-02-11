package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        int dl=data.length;
        for (int k = 0; k <= dl - 2; k++) {
            if (data[0][0] != data[k + 1][k + 1] ||
                    data[dl - 1][0] != data[dl - 2 - k][k + 1]) {
                return false;
            }
        }
        return true;
    }
}
