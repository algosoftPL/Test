package matrixlibrary;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class TestIMatrixImpl {
    private IMatrixImpl iMatrixImpl;
    private int MATRIX_WIDTH;
    private int MATRIX_HEIGHT;

    @Test
    public void testCreateIdentityMatrix() {
        MATRIX_WIDTH = MATRIX_HEIGHT = 6;
        iMatrixImpl = new IMatrixImpl();
        iMatrixImpl.createIdentityMatrix(MATRIX_WIDTH);
        for (int i = 0; i < MATRIX_WIDTH; i++) {
            for (int j = 0; j < MATRIX_HEIGHT; j++) {
                if (i == j) {
                    assertEquals(iMatrixImpl.getMatrixValue(i, j), 1.0);
                } else {
                    assertEquals(iMatrixImpl.getMatrixValue(i, j), 0.0);
                }
            }
        }
    }
    @Test
    public void testDeterminant() {
        MATRIX_WIDTH = MATRIX_HEIGHT = 6;
        iMatrixImpl = new IMatrixImpl(6, 6);}
    @Test
    public void testGetMatrixValue() {
        iMatrixImpl = new IMatrixImpl(6, 6);}
    @Test
    public void testSetMatrixValue() {
        iMatrixImpl = new IMatrixImpl(6, 6);}
    @Test
    public void testSetMatrixValues() {
        iMatrixImpl = new IMatrixImpl(6, 6);}
    @Test
    public void testToString() {
        iMatrixImpl = new IMatrixImpl(6, 6);}

}
