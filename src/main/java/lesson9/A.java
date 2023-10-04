package lesson9;

public class A {
     private int age;
     private String name;

    public A() {

    }

    public A(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public double getAge() {
        return (double) age - 1;
    }

    public String getName() {
        return name;
    }

    void hi() {
        System.out.println("hi A");
    }

    @Override
    public String toString() {
        return "class A:" + age + " name " + name;
    }
}