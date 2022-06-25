package lesson_09;

public class Main {
    public static void main(String[] args) {
        Animal tiger = new Animal.Builder().setName("Tiger").withWings(false).build();
        Animal falcon = new Animal.Builder().setName("Falcon").withWings(true).build();
        Animal eagle = new Animal.Builder().setName("Eagle").withWings(true).build();
        Animal snake = new Animal.Builder().setName("Snake").withWings(false).build();

        System.out.println(tiger.toString());
        System.out.println(falcon.toString());
        System.out.println(eagle.toString());
        System.out.println(snake.toString());
    }
}
