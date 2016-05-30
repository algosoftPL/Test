package matrixlibrary;

public class IMatrixImpl implements IMatrix {

    public void createIdentityMatrix(int size) {
        if (size < 0) {
            throw new IllegalArgumentException();
        }
        this.data = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    data[i][j] = 1.0;
                } else {
                    data[i][j] = 0.0;
                }
            }
        }
    }

    public double determinant() {
        return 0;
    }

    public double getMatrixValue(int row, int column) {
        return data[row][column];
    }
    public void setMatrixValue(int row, int column, double value) {

    }
    public void setMatrixValues(double[][] values) {

    }

    public String toString() {
        return null;
    }

    public IMatrixImpl() {

    }

    public IMatrixImpl(int width, int height) {
        this.width = width;
        this.height = height;
        this.data = new double[width][height];
    }

    private double[][] data;
    private int width;
    private int height;
}
