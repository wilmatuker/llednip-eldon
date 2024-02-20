class twoDArray {
    public static void main(String[] args) {
        double[][] matrix = {{5, 7.458, -43, 2.34, -328.67, 9.876, -23},{-4.56, 34, -729.32, 0.87, 23, -0.1, 9.38}};

        absol(matrix);

        for(int r = 0; r < 2; r++) {
            for(int c = 0; c < 7; c++) {
                System.out.println(matrix[r][c]);
            }
        }
    }
    
    public static void absol(double[][] array) {
        for(int r = 0; r < 2; r++) {
            for(int c = 0; c < 7; c++) {
                array[r][c] = Math.abs(array[r][c]);
            }
        }
    }
}