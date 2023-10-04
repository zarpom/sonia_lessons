package lesson9;

public class BankAccount {
    private final int age;
    private final String name;
    private double karma;


    public BankAccount(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public boolean yourGetChanceToGetMoney() {
        addKarmaForAdult();
        addKarmaForGoodPerson();
        return karma >= 100;
    }

    private void addKarmaForAdult() {
        karma += (isAdult() ? 10 : 0);
    }

    private void addKarmaForGoodPerson() {
        karma += (isGoodPerson() ? 100 : 0);
    }

    private boolean isAdult() {
        return this.age >= 18;
    }

    private boolean isGoodPerson() {
        return this.name.substring(0, 1).equalsIgnoreCase("s");
    }
}
