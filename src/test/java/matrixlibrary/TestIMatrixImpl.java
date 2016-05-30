package matrixlibrary;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

import junit.framework.Assert;
import org.junit.Test;

public class TestIMatrixImpl {
    private IMatrixImpl iMatrixImpl;
    private int MATRIX_WIDTH;
    private int MATRIX_HEIGHT;

    @Test(expected = IllegalArgumentException.class)
    public void createIdentityMatrixShouldThrowIllegalArgumentExceptionAtZero() {
        iMatrixImpl = new IMatrixImpl();
        iMatrixImpl.createIdentityMatrix(0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void createIdentityMatrixShouldThrowIllegalArgumentExceptionAtNegative() {
        iMatrixImpl = new IMatrixImpl();
        iMatrixImpl.createIdentityMatrix(-1);
    }
    @Test
    public void createIdentityMatrixGeneratesAProperIdentityMatrix() {
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
        MATRIX_WIDTH = MATRIX_HEIGHT = 3;
        iMatrixImpl = new IMatrixImpl(MATRIX_WIDTH, MATRIX_HEIGHT);
        double[][] data;

        data = new double[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        iMatrixImpl.setMatrixValues(data);
        try {
            assertEquals(iMatrixImpl.determinant(), 0);
        } catch (InvalidDimensionException e) {
            fail("determinant threw up");
        }

        data = new double[][] {{1, 2, 3}, {5, 1, 2}, {1, 3, 4}};
        iMatrixImpl.setMatrixValues(data);
        try {
            assertEquals(iMatrixImpl.determinant(), 4);
        } catch (InvalidDimensionException e) {
            fail("determinant threw up");
        }
    }

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
    @Test
    public void testGetWidth() {

    }
    @Test
    public void testGetHeight() {

    }

}
