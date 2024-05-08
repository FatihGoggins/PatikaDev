package Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] transpose = new  int[column][row];

        for (int r = 0; r < column; r++) {
            for (int c = 0; c < row; c++) {
                transpose[r][c] = matrix[c][r];
                System.out.print(transpose[r][c] + "  ");
            }
            System.out.println("");
        }

    }
}
