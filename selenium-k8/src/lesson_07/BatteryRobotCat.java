package lesson_07;

// Inheritance | Sub-class, child class, concrete class

public class BatteryRobotCat extends RobotCat {

    @Override
    public String charge() {
        return super.charge() + "with battery";
    }
}
