package matrixlibrary;

public class IMatrixMathImpl implements IMatrixMath {
    public IMatrix inverseMatrix(IMatrix m1) {
        try {
            if (Math.abs(m1.determinant())>1e-12)
                return null;
        } catch (InvalidDimensionException e) {
            return null;
        }

        //todo actually finish
        return null;

    }

    public IMatrix matrixAddition(IMatrix m1, IMatrix m2) throws InvalidDimensionException {
        if(m1.getHeight()!=m2.getHeight() || m1.getWidth()!=m2.getWidth())
            throw new InvalidDimensionException();
        double[][] m3 = new double[m1.getWidth()][m1.getHeight()];
        for (int i = 0; i < m1.getWidth(); i++) {
            for (int j = 0; j < m1.getHeight(); j++) {
                m3[i][j] = m1.getMatrixValue(i,j) + m2.getMatrixValue(i,j);
            }
        }
        IMatrix result = new IMatrixImpl();
        result.setMatrixValues(m3);
        return result;
    }

    public IMatrix matrixMultiplication(IMatrix m1, IMatrix m2) {
        return null;
    }

    public IMatrix matrixSubtracting(IMatrix m1, IMatrix m2) throws InvalidDimensionException {
        if(m1.getHeight()!=m2.getHeight() || m1.getWidth()!=m2.getWidth())
            throw new InvalidDimensionException();
        double[][] m3 = new double[m1.getWidth()][m1.getHeight()];
        for (int i = 0; i < m1.getWidth(); i++) {
            for (int j = 0; j < m1.getHeight(); j++) {
                m3[i][j] = m1.getMatrixValue(i,j) - m2.getMatrixValue(i,j);
            }
        }
        IMatrix result = new IMatrixImpl();
        result.setMatrixValues(m3);
        return result;
    }

    public IMatrix matrixTransposition(IMatrix m1) {
        return null;
    }

    public IMatrix scalarMultiplication(IMatrix m1, double scalar) {
        double[][] m3 = new double[m1.getWidth()][m1.getHeight()];
        for (int i = 0; i < m1.getWidth(); i++) {
            for (int j = 0; j < m1.getHeight(); j++) {
                m3[i][j] = m1.getMatrixValue(i,j)*scalar;
            }
        }
        return new IMatrixImpl(m3);
    }
}
