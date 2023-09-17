package lesson1;

public class Main {
    public static void main(String[] args) {

        byte b1 = 20;

        byte b2 = (byte) (b1 + 100 + 50 + 100);
        int i = Integer.MAX_VALUE + Integer.MAX_VALUE;
//
        byte b = (byte) (10000000024l);// 127 + 1 = -128 + 1 = 127
        int i1 = 100000000;
        System.out.println(b);
    }
}