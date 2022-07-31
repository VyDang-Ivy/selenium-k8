package lesson_12;

public interface IswinAble {

    void doSth();

    static void doAnotherThing(){

    }

    default void swim(){
        System.out.println("Swin!");
    }


}
