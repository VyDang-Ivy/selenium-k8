package lesson_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class WhileLoopLearning {

    public static void main(String[] args) {

        boolean isContinuing = true;

        while (isContinuing){
            printMenu();
            int option = getUserOption();

            if (option == 0){
                isContinuing = false;
            } else if (option == 1){
                System.out.println("Your random number is: " + new SecureRandom().nextInt(1000));

            } else {
                System.out.println(" Wrong input data");
            }
        }

        System.out.println("See you again !");
    }

    public static void printMenu() {
        System.out.println("=====Game Menu=====");
        System.out.println("1. Generate a random number (less than 1000)");
        System.out.println("0. Exit!");
    }
    public static int getUserOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select option: ");
        return scanner.nextInt();
    }

}
