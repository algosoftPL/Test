package matrixlibrary;

/**
 * Created by phoe on 30.05.16.
 */
public interface IMatrix {
    void CreateIdentityMatrix(int size);
    double Determinant();
    double GetMatrixValue(int row, int column);
    void setMatrixValue(int row, int column, double value);
    void setMatrixValues(double[][] values);
    String ToString();
}
