package pract4.pract4_1;

public class task4 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(2,2);
        matrix.matrix = new double[][]{new double[]{3,4}, new double[]{2,1}};
        matrix.multiplyMatrixOnMatrix(new double[][]{new double[]{1,5}, new double[]{3,7}});
        matrix.print();
       // matrix.multiplyMatrixOnMatrix();
    }
}
class Matrix{
    int rows;
    int columns;
    double[][] matrix;
    Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        matrix = new double[rows][columns];
    }
    public void matrixSum(double[][] secondMatrix){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] += secondMatrix[i][j];
            }
        }
    }
    public void multiplyMatrixOnValue(double value){

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] *= value;
            }
        }
    }
    public void print(){
        for (double[] arr:matrix) {
            for (double d:arr) {
                System.out.printf("%.1f ", d);
            }
            System.out.println();
        }
    }
    public void multiplyMatrixOnMatrix(double[][] secondMatrix){
        double[][] result = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < columns; k++) {
                    result[i][j] += matrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        matrix = result;
    }
}
