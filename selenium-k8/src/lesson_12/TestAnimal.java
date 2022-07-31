package lesson_12;

import java.util.Arrays;
import java.util.List;

public class TestAnimal {

    void findAnimalWinner(List<lesson_12.Animal> AnimalList){

        int maxSpeed = AnimalList.get(0).performanceRun();
        String winnerAnimal = AnimalList.get(0).getName();
        for (lesson_12.Animal animal : AnimalList) {
            if (animal.performFly()) {
                System.out.printf("%s cannot run because it has wings\n", animal.getName());
            } else if (animal.performanceRun() > maxSpeed) {
                maxSpeed = animal.performanceRun();
                winnerAnimal = animal.getName();
            }
        }
        System.out.println("Winner animal is " + winnerAnimal);
        System.out.printf("Maximum speed is %d Km/h", maxSpeed);
    }

    public static void main(String[] args) {

//        new TestAnimal().findAnimalWinner(Arrays.asList(new lab_12.Tiger(),new lab_12.Horse(),new lab_12.Dog(),new Eagle(),new Falcon()));

        lesson_12.Animal tiger = new lesson_12.Tiger();
        lesson_12.Animal horse = new lesson_12.Horse();
        lesson_12.Animal dog = new lesson_12.Dog();
        lesson_12.Animal eagle = new lesson_12.Eagle();
        lesson_12.Animal falcon = new lesson_12.Falcon();

        new TestAnimal().findAnimalWinner(Arrays.asList(tiger,horse,dog,eagle,falcon));

    }
}