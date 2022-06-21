package lesson_08;

import java.util.ArrayList;

public class Main {

    public static int calculateSalary(ArrayList<Employee> employees) {
        int result = 0;

        for (Employee employee : employees) {
            result = result + employee.salary();
        }

        return result;
    }

    public static void main(String[] args) {
        FullTimeEmployee fe1 = new FullTimeEmployee();
        FullTimeEmployee fe2 = new FullTimeEmployee();
        FullTimeEmployee fe3 = new FullTimeEmployee();

        ContractEmployee ce1 = new ContractEmployee();
        ContractEmployee ce2 = new ContractEmployee();

        ArrayList<Employee> employees = new ArrayList<Employee>();

        employees.add(fe1);
        employees.add(fe2);
        employees.add(fe3);
        employees.add(ce1);
        employees.add(ce2);

        int total = calculateSalary(employees);

        System.out.println(total);

        //

        Horse horse = new Horse();
        Tiger tiger = new Tiger();
        Dog dog = new Dog();

        int horsespeed = horse.speed();
        int tigerspeed = tiger.speed();
        int dogspeed = dog.speed();

        System.out.println(horsespeed);
        System.out.println(tigerspeed);
        System.out.println(dogspeed);

        if (horsespeed > tigerspeed && horsespeed > dogspeed) {
            System.out.println("Winner is Horse, with speed: " + horsespeed);
        }else if (tigerspeed > horsespeed && tigerspeed > dogspeed){
            System.out.println("Winner is Tiger, with speed: " + tigerspeed);
        }else {
            System.out.println("Winner is Dog, with speed: " + dogspeed);
        }

    }
}
