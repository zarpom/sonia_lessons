package lesson9;

import lesson10.B;

public class Main {
    public static void main(String[] args) {
        A a = new A(26, "Vitalii");
        B b = new B();
//        System.out.println(a.name);
//        System.out.println(b.name);
        a.hi();
//        b.hi();

        System.out.println(a);
        String name = a.getName();
        System.out.println(name);

        BankAccount bank = new BankAccount(26, "Sofia");

        System.out.println(bank.yourGetChanceToGetMoney());

    }
}
//private
//default
//protected
//public





