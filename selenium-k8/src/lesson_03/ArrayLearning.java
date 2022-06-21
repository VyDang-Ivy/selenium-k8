package lesson_03;

public class ArrayLearning {

    public static void main(String[] args) {

        int arrayLength = 5;
        int[] myIntArray = new int[arrayLength];

        for (int index = 0; index < arrayLength; index++) {
            myIntArray[index] = index + 1;
 //           myIntArray[index] = index++;

            // c = ++a + b++;

            /*
            * 0(new) || 0 || 2 || 0 || 4
            *
            * */

    }

        for (int index = 0; index < myIntArray.length; index++) {
            System.out.printf("Element at the index %d has value %d\n", index, myIntArray[index]);
            
        }

        System.out.println("============");

            // Enhanced for
        for (int elementValue : myIntArray) {
            System.out.println(elementValue);
            
        }

    }
}

