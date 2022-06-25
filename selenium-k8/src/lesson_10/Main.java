package lesson_10;

public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse();
        Tiger tiger = new Tiger();
        Dog dog = new Dog();

        int horse_speed = horse.speed();
        int tiger_speed = tiger.speed();
        int dog_speed = dog.speed();

        int max = horse_speed;
        String winner = "Horse";

        if (tiger_speed > max) {
            max = tiger_speed;
            winner = "Tiger";
        }

        if (dog_speed > max) {
            max = dog_speed;
            winner = "Dog";
        }

        System.out.println("Winner is " + winner + ", with speed: " + max);
    }
}
