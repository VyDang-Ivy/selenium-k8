package lesson_02;

import java.util.Scanner;

public class IfElseStatement {

    public static void main(String[] args) {

        final int expected_Time = 7;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input arrival time: ");
        int arrivalTime = scanner.nextInt();

        // == != > < >= <= Comparison operators
        boolean isHeOnTime = (arrivalTime == expected_Time);
        System.out.println("Dat xe ra");
        System.out.println("Chay toi quan");


        // isHeonTme is a expression that can return a boolean value
//        if(isHeOnTime){
//            System.out.println("Let's talk!");
//        }else{
//            System.out.println("Write a letter!");
//        }

        String msg = isHeOnTime ? "Let's talk!" : "Write a letter";

        System.out.println(msg);

        System.out.println("Dat xe ra");
        System.out.println("Chay ve nha");

        // Ternary operator | | Toan tu ba ngoi
    }
}
