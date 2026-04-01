class SparseMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 0, 0, 3 },
                { 0, 0, 0 },
                { 1, 0, 0 }
        };

        int zero = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == 0)
                    zero++;
            }
        }

        if (zero > (3 * 3) / 2)
            System.out.println("Sparse Matrix");
        else
            System.out.println("Not Sparse Matrix");
    }
}