package lesson_06;

public class RobotCat {

    // OOP: Lập trình hướng đối tượng

    private String name;

    // Constructor

    public RobotCat(){
        String name = "Den Thui";
        System.out.println(name);
    }

    public RobotCat(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void greetings(){
        System.out.println("Hello, my name is ".concat(this.name));
    }
}
