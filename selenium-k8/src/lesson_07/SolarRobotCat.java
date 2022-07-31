package lesson_07;

// Inheritance | Sub-class, child class, concrete class

public class SolarRobotCat extends RobotCat {

    @Override
    public String charge(){
        return super.charge().concat("with solar energy!");
    }


}
