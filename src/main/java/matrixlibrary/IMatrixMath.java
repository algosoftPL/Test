package matrixlibrary;

public interface IMatrixMath {
    /** Tworzy macierz odwrotną o ile to możliwe */
    public IMatrix	inverseMatrix(IMatrix m1);

    /** Dodawanie macierzy, zwracamy uwage na poprawność rozmiaru macierzy */
    public IMatrix	matrixAddition(IMatrix m1, IMatrix m2);

    /** Mnożenie dwóch macierzy, zwracamy uwagę na zgodność rozmiarów */
    public IMatrix	matrixMultiplication(IMatrix m1, IMatrix m2);

    /** Odejmowanie macierzy, zwracamy uwage na poprawność rozmiaru macierzy */
    public IMatrix	matrixSubtracting(IMatrix m1, IMatrix m2);

    /** Zwraca macierz transponowaną */
    public IMatrix	matrixTransposition(IMatrix m1);

    /** Mnożenie macierzy przez skalar */
    public IMatrix	scalarMultiplication(IMatrix m1, double scalar);
}
