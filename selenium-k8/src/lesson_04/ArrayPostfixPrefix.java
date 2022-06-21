package lesson_04;

public class ArrayPostfixPrefix {

    public static void main(String[] args) {

        int arrayLength = 5;
        int[] myIntArr = new int[arrayLength];

        for (int index = 0; index < arrayLength;) {
            myIntArr[index++] = index;
 //           myIntArr[index] = index + 1;
        }

        for (int value : myIntArr) {
            System.out.println(value);
        }
    }
}
