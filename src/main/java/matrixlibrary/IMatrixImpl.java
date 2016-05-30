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

    public double determinant() throws InvalidDimensionException {
        if(height!=width)throw new InvalidDimensionException();
        return 0;
    }

    public double getMatrixValue(int row, int column) {
        return data[row][column];
    }
    public void setMatrixValue(int row, int column, double value) {
        data[row][column]=value;

    }
    public void setMatrixValues(double[][] values) {
        data = new double[values.length][values[0].length];
        for(int i=0;i<values.length;i++){
            for(int j=0;j<values[i].length;i++){
                data[i][j]=values[i][j];
            }
        }
        width=values.length;
        height= values[0].length;
    }

    public String toString() {
        StringBuilder build = new StringBuilder();
        return  null;
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
