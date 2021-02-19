package homework5;

public class HomeWork5 {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        float[] arr = new float[SIZE];

        calcArrayFirst(arr);
        calcArraySecond(arr);
    }

    public static void calcArrayFirst(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long startTimeCalc = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long endTimeCalc = System.currentTimeMillis();
        System.out.println("Время вычисления массива по первому варианту составляет: " + (endTimeCalc - startTimeCalc) + " мс.");
    }

    public static void calcArraySecond(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long startTimeCalc = System.currentTimeMillis();
        float[] array1 = new float[HALF];
        float[] array2 = new float[HALF];

        System.arraycopy(arr, 0, array1, 0, HALF);
        System.arraycopy(arr, HALF, array2, 0, HALF);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < array1.length; i++) {
                array1[i] = (float) (array1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < array2.length; i++) {
                array2[i] = (float) (array2[i] * Math.sin(0.2f + (i + HALF) / 5) * Math.cos(0.2f + (i + HALF) / 5) * Math.cos(0.4f + (i + HALF) / 2));
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(array1, 0, arr, 0, HALF);
        System.arraycopy(array2, 0, arr, HALF, HALF);
        long endTimeCalc = System.currentTimeMillis();
        System.out.println("Время вычисления массива по воторому варианту составляет: " + (endTimeCalc - startTimeCalc) + " мс.");
    }
}
