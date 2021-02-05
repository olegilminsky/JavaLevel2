package homework2;

public class HomeWork2 {
    public static void main(String[] args) {
        String[][] strArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},
        };

        try {
            System.out.println(sumArrayElements(strArray));
        } catch (MyArraySizeException e) {

        } catch (MyArrayDataException e) {

        }

    }

    public static int sumArrayElements(String[][] strArray) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (strArray.length != 4) {
            throw new MyArraySizeException("Размер массива не соответствует заданным требованиям (4х4)");
        }
        for (int i = 0; i < strArray.length; i++) {
            if (strArray.length != 4) {
                throw new MyArraySizeException("Размер массива не соответствует заданным требованиям (4х4)");
            }
            for (int j = 0; j < strArray[i].length; j++) {
                if (strArray[i].length != 4) {
                    throw new MyArraySizeException("Размер массива не соответствует заданным требованиям (4х4)");
                } else if (!strArray[i][j].matches("[0-9]+")) {
                    throw new MyArrayDataException(i, j);
                } else {
                    sum += Integer.parseInt(strArray[i][j]);
                }
            }
        }
        return sum;
    }
}
