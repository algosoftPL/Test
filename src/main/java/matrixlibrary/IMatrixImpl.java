package matrixlibrary;

public class IMatrixImpl implements IMatrix {

    public void createIdentityMatrix(int size) {

    }

    public double determinant() {
        return 0;
    }

    public double getMatrixValue(int row, int column) {
        return 0;
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
