package matrixlibrary;

public class IMatrixImpl implements IMatrix {
    public IMatrixImpl(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void createIdentityMatrix(int size) {
        matrix =new double [size][size];
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
        return matrix[row][column];
    }
    public void setMatrixValue(int row, int column, double value) {
        matrix[row][column]=value;

    }
    public void setMatrixValues(double[][] values) {
        matrix = new double[values.length][values[0].length];
        for(int i=0;i<values.length;i++){
            for(int j=0;j<values[i].length;i++){
                matrix[i][j]=values[i][j];
            }
        }
        width=values.length;
        height= values[0].length;
    }

    public String toString() {
        StringBuilder build = new StringBuilder();
        return  null;
    }

    private int width;
    private int height;
    double [][] matrix;
}
