package matrixlibrary;

public class IMatrixImpl implements IMatrix {
    public IMatrixImpl(int width, int height) {
        this.width = width;
        this.height = height;
    }

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

    private int width;
    private int height;
}
