package lesson_10;

public class Contractor extends Employee{
    @Override
    public int getSalary() {
        return 30000;
    }

    @Override
    public int getSupportMoney() {
        return 0;
    }
}
