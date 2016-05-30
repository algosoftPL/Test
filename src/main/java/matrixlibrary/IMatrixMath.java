package matrixlibrary;

public interface IMatrixMath {
    /** Tworzy macierz odwrotną o ile to możliwe */
    IMatrix	InverseMatrix(IMatrix m1);

    /** Dodawanie macierzy, zwracamy uwage na poprawność rozmiaru macierzy */
    IMatrix	MatrixAddition(IMatrix m1, IMatrix m2);

    /** Mnożenie dwóch macierzy, zwracamy uwagę na zgodność rozmiarów */
    IMatrix	MatrixMultiplication(IMatrix m1, IMatrix m2);

    /** Odejmowanie macierzy, zwracamy uwage na poprawność rozmiaru macierzy */
    IMatrix	MatrixSubtracting(IMatrix m1, IMatrix m2);

    /** Zwraca macierz transponowaną */
    IMatrix	MatrixTransposition(IMatrix m1);

    /** Mnożenie macierzy przez skalar */
    IMatrix	ScalarMultiplication(IMatrix m1, double scalar);
}
