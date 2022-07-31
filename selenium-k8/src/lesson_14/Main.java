package lesson_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("======= Book Management Program (CRUD)============");

        String[] menuItems = new String[] {
            "1. New book",
            "2. Find a book(ISBN)",
            "3. Update a book",
            "4. Delete a book",
            "5. Print the book list",
            "0. Exit"
        };

        for (String item : menuItems) {
            System.out.println(item);
        }

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        System.out.println("You entered string " + s);

    }

}
