package homework2;

public class MyArrayDataException extends RuntimeException {
    private int i;
    private int j;

    public MyArrayDataException(int i, int j) {
        System.out.println("Значение в ячейке [" + i + "] [" + j + "] невозможно преобразовать в число.");
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
