package lesson_04;

import java.security.SecureRandom;

public class FunctionLearning {

    public static void main(String[] args) {

        /*
        * Maintenance: chi phí cao
        * Extendable: thấp
        * Reliable: thấp
        *
        *
         */

        // DRY: Don't Repeat Yourself

        sayHello("Test");
        sayHello("Code");
        sayHello("Demo");

        System.out.println(getRandomNumber(10));
        System.out.println(getRandomNumber(100));

    }

    // Access Modifier

    public static void sayHello(String name){
        System.out.println("Hola!, " + name);
    }

    public static int getRandomNumber(int boundaryNumber){
        int randomNumber = new SecureRandom().nextInt(boundaryNumber) + 10;
        return randomNumber;
    }

    public static void printNumber(){
        for (int number = 0; number < 5; number++) {
            if (number ==3)
                return;
            System.out.println(number);

        }

        System.out.println("End Of Program!");
    }

}
