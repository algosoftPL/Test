package matrixlibrary;

public interface IMatrix {
    /** Generuje macierz jednostkową o podarnym rozmiarze */
    void CreateIdentityMatrix(int size);

    /** Oblicza wartość wyznacznika dla kwadratowej macierzy, w przypadku innej mamy wyjątek */
    double Determinant();

    /** Zwraca wartość pola w macierzy */
    double GetMatrixValue(int row, int column);

    /** Ustala wartość pojedyńczej komórki */
    void setMatrixValue(int row, int column, double value);

    /** Ustala zawartość macierzy na podstawie tablicy */
    void setMatrixValues(double[][] values);

    /** Reprezentacja w formie String macierzy, powinna utrzymywać konwencję wierszy i kolumn */
    String ToString();
}
