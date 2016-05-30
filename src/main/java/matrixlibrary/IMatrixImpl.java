package matrixlibrary;

public class IMatrixImpl implements IMatrix {
    public IMatrixImpl(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void createIdentityMatrix(int size) {
        matrix =new int [size][size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;i++){
                if(i==j)matrix[i][j]=1;
                else matrix[i][j]=0;
            }
        }
    }

    public double determinant() throws InvalidDimensionException {
        if(height!=width)throw new InvalidDimensionException();

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
    int [][] matrix;
}
