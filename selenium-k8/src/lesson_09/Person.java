package lesson_09;

// Builder Design Pattern

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age can't be negative number!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
