package matrixlibrary;

public interface IMatrixMath {
    /** Tworzy macierz odwrotną o ile to możliwe */
    public IMatrix	InverseMatrix(IMatrix m1);

    /** Dodawanie macierzy, zwracamy uwage na poprawność rozmiaru macierzy */
    public IMatrix	MatrixAddition(IMatrix m1, IMatrix m2);

    /** Mnożenie dwóch macierzy, zwracamy uwagę na zgodność rozmiarów */
    public IMatrix	MatrixMultiplication(IMatrix m1, IMatrix m2);

    /** Odejmowanie macierzy, zwracamy uwage na poprawność rozmiaru macierzy */
    public IMatrix	MatrixSubtracting(IMatrix m1, IMatrix m2);

    /** Zwraca macierz transponowaną */
    public IMatrix	MatrixTransposition(IMatrix m1);

    /** Mnożenie macierzy przez skalar */
    public IMatrix	ScalarMultiplication(IMatrix m1, double scalar);
}
