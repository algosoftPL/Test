package matrixlibrary;

import org.junit.Before;
import org.junit.Test;

public class TestIMatrixImpl {
    private IMatrixImpl iMatrixImpl;

    @Test
    public void testCreateIdentityMatrix() {
        iMatrixImpl = new IMatrixImpl(6, 6);
        iMatrixImpl.createIdentityMatrix(6);
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
