package test;

import matrixlibrary.IMatrix;
import matrixlibrary.IMatrixImpl;
import matrixlibrary.IMatrixMath;
import matrixlibrary.IMatrixMathImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by koden on 30/05/2016.
 */
public class IMatrixMathImplTest {
    IMatrix m1,m2;
    IMatrixMath math;

    @Before
    public void setUp() throws Exception {
        math = new IMatrixMathImpl();
        m1 = new IMatrixImpl(1,1);
        m1.setMatrixValues(new double[][]
                {{1,2,3,4},
                {2,3,4,5},
                {3,4,5,6},
                {4,5,6,7}});
        m2 = new IMatrixImpl(1,1);
        m2.setMatrixValues(new double[][]{
                {9,8,7,6},
                {8,7,6,5},
                {7,6,5,4},
                {6,5,4,3}});

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testMatrixAddition() throws Exception {
        IMatrix m3 = math.matrixAddition(m1,m2);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                assertEquals(m3.getMatrixValue(i,j),10,1e-12);
            }
        }
    }

    @Test
    public void testMatrixSubtracting() throws Exception {
        double[][] expectedResults = new double[][]{{-8, -6, -4, -2}, {-6, -4, -2, 0}, {-4, -2, 0, 2}, {-2, 0, 2, 4}};
    }

    @Test
    public void testScalarMultiplication() throws Exception {

    }
}