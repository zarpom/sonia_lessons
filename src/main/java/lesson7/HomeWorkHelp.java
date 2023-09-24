package lesson7;

public class HomeWorkHelp {

    public static void main(String[] args) {
        //{5, 3, 9, 2, 7}
        // length = 5
        // 5 / 2 = 2.5 = 2
        // 0 1 2 3 4
        // length = 6
        //
        //
        int[] array = {5, 3, 23, 9, 7, 2};
        //1 варіант + - але ще треба подумать
//
//        int middleNum = 0;
//        int middleIndex = array.length / 2;
//
//        if (array.length % 2 == 0) {
//            middleNum = Math.min(array[middleIndex - 1], array[middleIndex]);
//        } else {
//            middleNum = array[middleIndex];
//        }
//
//
//        System.out.println(middleNum);
        System.out.println(middleNumber(array));

    }

    //2 варіант + - нормас
//    public static int middleNumber(int[] numbers) {
//        int middleIndex = numbers.length / 2;
//
//        if (numbers.length % 2 == 0) {
//            return Math.min(numbers[middleIndex - 1], numbers[middleIndex]);
//        }
//        return numbers[middleIndex];
//    }

    public static int middleNumber(int[] numbers) {

        return numbers.length % 2 == 0 ? Math.min(numbers[numbers.length / 2 - 1], numbers[numbers.length / 2]) : numbers[numbers.length / 2];
    }
}
