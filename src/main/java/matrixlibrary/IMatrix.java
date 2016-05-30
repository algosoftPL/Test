package matrixlibrary;

public interface IMatrix {
    /** Generuje macierz jednostkową o podarnym rozmiarze */
    public void CreateIdentityMatrix(int size);

    /** Oblicza wartość wyznacznika dla kwadratowej macierzy, w przypadku innej mamy wyjątek */
    public double Determinant();

    /** Zwraca wartość pola w macierzy */
    public double GetMatrixValue(int row, int column);

    /** Ustala wartość pojedyńczej komórki */
    public void setMatrixValue(int row, int column, double value);

    /** Ustala zawartość macierzy na podstawie tablicy */
    public void setMatrixValues(double[][] values);

    /** Reprezentacja w formie String macierzy, powinna utrzymywać konwencję wierszy i kolumn */
    public String ToString();
}
