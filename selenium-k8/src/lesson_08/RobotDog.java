package lesson_08;

public class RobotDog {

    // SHARED
    public static int dogID = 0;

    private String name;

    public void increaseDogID(){
        dogID++;

    }
    public int getDogID() {

        return dogID;
    }

    public static void doSth(){
        doAnotherThing();
    }

    public static void doAnotherThing(){

    }
}
