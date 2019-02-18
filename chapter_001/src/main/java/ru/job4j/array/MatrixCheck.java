package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        int arrlength =data.length;
        for (int i = 0; i <= arrlength - 2; i++) {
            if (data[0][0] != data[i + 1][i + 1] ||
                    data[arrlength - 1][0] != data[arrlength - 2 - i][i + 1]) {
                return false;
            }
        }
        return true;
    }
}
