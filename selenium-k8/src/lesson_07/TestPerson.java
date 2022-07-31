package lesson_07;

import java.util.ArrayList;
import java.util.List;

public class TestPerson {

    public static void main(String[] args) {
        Person cat = new Person("Cat", 7);

        List<Person> personList = new ArrayList<>();
        personList.add(cat);
        personList.add(cat);

        System.out.println(personList);

        personList.get(1).setName("Den");
    }
}
