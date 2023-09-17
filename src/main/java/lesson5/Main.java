package lesson5;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 33, -5},
                {6, 7, 8, 11},
                {10, 11, -12, 13, 4},
                {14, 15, 16, -16}
        };
        sortBumble2DArray(array);
        sort2DArrayForLastElement(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
    static void sortBumble2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                for (int k = 0; k < array[i].length - 1 - j; k++) {
                    if (array[i][k] > array[i][k + 1]) {
                        int temp = array[i][k];
                        array[i][k] = array[i][k + 1];
                        array[i][k + 1] = temp;
                    }
                }
            }
        }
    }
    private static void sort2DArrayForLastElement(int[][] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i][array[i].length - 1] > array[i + 1][array[i + 1].length - 1]) {
                int[] temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
    }
}