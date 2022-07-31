package lesson_06;

public class Calculator {

    // Method signature

    // Method overloading: Xuất hiện ở Compile Time
    // Method overriding: Xuất hiện ở Run Time

    public int sum(int a, int b){
        return a + b;
    }
    // Varaqrs | Rest Parameters

    public int sum(int a, int b, int... numbers) {
        int arrayTotal = 0;
        for (int number : numbers) {
            arrayTotal = arrayTotal + number;
        }
        return a + b + arrayTotal;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1, 2));
        System.out.println(calculator.sum(1, 2, 3));
        System.out.println(calculator.sum(1, 2, 15, 25, 40));
     }
}
