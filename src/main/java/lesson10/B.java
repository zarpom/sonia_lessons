package lesson10;


import lesson9.A;

public class B extends A {
    private double a;

    public B(int age, String name) {
        super(age, name);
        this.a = a;
    }


    public B(double a) {
        this.a = a;
    }


    public B() {
    }

    void hi() {
        System.out.println("hi B");
    }
}