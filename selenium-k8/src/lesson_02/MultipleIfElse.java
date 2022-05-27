package lesson_02;

import java.util.Scanner;

public class MultipleIfElse {

    public static void main(String[] args) {
        // <18 || 18 - 55 || >55

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your age: ");
        int clientAge = scanner.nextInt();

        // Nested if..else
        if (clientAge < 18) {
            System.out.println("Khong ban");
            if(clientAge <= 14)
                System.out.println("Calling 911!!");

        } else if (clientAge <= 55) {
            System.out.println("Unlimited");
        } else {
            System.out.println("Ban 2 chai");
        }
    }
}