package lesson2;

public class ForLesson {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {// умова поки цикл працює і крок
           if(i % 5 == 0 || i % 31 == 0){
               System.out.println("ПИВО!" + i);
           }
        }
//        System.out.println(15 % 3 == 0);//
    }
}
