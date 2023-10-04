package lesson8;

public class TelegramPart1 {
    String n1;
    String n2;
    String n3;
    int age;

    public TelegramPart1(String n1, int age, String n2, String n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.age = age;
    }

    public TelegramPart1() {
    }

    public static void main(String[] args) {
        Object telegramPart1 = new TelegramPart1("123", 1, "df", "1");
        System.out.println(telegramPart1);
        TelegramPart1 t1 = new TelegramPart1();
        t1.age = 1;
        System.out.println(t1);
//        Object object = new Object();
    }

    @Override
    public String toString() {
        return "TelegramPart1{" +
                "n1='" + n1 + '\'' +
                ", n2='" + n2 + '\'' +
                ", n3='" + n3 + '\'' +
                ", age=" + age +
                '}';
    }
}
