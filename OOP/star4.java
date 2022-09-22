package OOP;

import java.util.Arrays;

public class star4 {
	public static void main(String[] args) {
		int row = 9;
		int col = 9;
		char[][]matrix = new char[row][col];
		int center = (int) Math.ceil(col / 2.0) - 1;
        for (char[] chars : matrix) {
            Arrays.fill(chars, '.');
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // lines through the center vertically and horizontally
                if (j == center || i == center) {
                    matrix[i][j] = '*';
                }
                // the diagonal line in the upper left quarter and in the lower right quarter
                if (j == i) {
                    matrix[i][j] = '*';
                }
                // the diagonal line in the upper right quarter and in the lower left quarter
                if (j == (matrix.length - 1) - i) {
                    matrix[i][j] = '*';
                }
            }
        }
        for (char[] chars : matrix) {
            StringBuilder line = new StringBuilder();
            for (char aChar : chars) {
                line.append(aChar).append(" ");
            }
            System.out.println(line.toString().trim());
        }
    }

	}

