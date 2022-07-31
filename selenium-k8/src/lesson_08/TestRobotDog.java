package lesson_08;

public class TestRobotDog {

    public static void main(String[] args) {
        RobotDog kem = new RobotDog();
        kem.increaseDogID();
        RobotDog luly = new RobotDog();
        luly.increaseDogID();

        System.out.println(kem.getDogID());
        System.out.println(luly.getDogID());


        RobotDog.doSth();
    }
}
