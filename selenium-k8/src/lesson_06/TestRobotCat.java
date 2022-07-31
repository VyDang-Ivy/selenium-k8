package lesson_06;

public class TestRobotCat {

    public static void main(String[] args) {
        RobotCat kitty = new RobotCat("Kitty");
        kitty.greetings();

        kitty.setName("MeoMeo");
        kitty.greetings();
    }
}
