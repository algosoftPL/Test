package matrixlibrary;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class TestIMatrixImpl {
    private IMatrixImpl iMatrixImpl;

    @Test
    public void testCreateIdentityMatrix() {
        iMatrixImpl = new IMatrixImpl();
        iMatrixImpl.createIdentityMatrix(6);
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
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
