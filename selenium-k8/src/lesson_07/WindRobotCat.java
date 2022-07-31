package lesson_07;

// Inheritance | Sub-class, child class, concrete class

public class WindRobotCat extends RobotCat {

    @Override
    public String charge(){
        return super.charge().concat("with wind energy!");
    }


}
