package lesson_08;

public class Cho {

    protected static String name = "Cho";

    public void sayHello(){
        System.out.println("Hello, my name is ".concat(name));
    }

    public static void doSth(){
        System.out.println("Hello, my name is ".concat(name));
    }
}
