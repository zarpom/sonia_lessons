package lesson4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 9, 1, 2, -2, 22, 33, -4, 100, -12, 2, 44, -23, 44, 22};
        int count = 0;

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                count++;
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
                if (!isSorted) {
                    break;
                }
            }

        }
        System.out.println("фінальний массив:" + Arrays.toString(array));
        System.out.println("count=" + count);


        int count2 = 0;
        int[] array2 = {5, 9, 1, 2, -2, 22, 33, -4, 100, -12, 2, 44, -23, 44, 22};
        //i-> 0   [5], 9, 1, 2
        //i-> 1   5, [9], 1, 2 => 5, 1, 9, 2
        //i-> 2   5, 1, [9], 2 => 5, 1, 2, 9

        //Соня навпаки відсортувать хоче
        //двумірний массив


        for (int i = 0; i < array2.length - 1; i++) {
            for (int j = 0; j < array2.length - 1 - i; j++) {

                if (array2[j] < array2[j + 1]) {
                    int temp = array2[j];
                    array2[j] = array2[j + 1];
                    array2[j + 1] = temp;
                }
                count2++;
            }
        }
        System.out.println("count2=" + count2);
        System.out.println("фінальний массив:" + Arrays.toString(array));
    }
}