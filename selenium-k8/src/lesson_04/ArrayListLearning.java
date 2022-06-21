package lesson_04;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning {

    public static void main(String[] args) {
        // ArrayList implements interface List
        // Raw type

        List<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(2);
        myList.add(0, 3);

        for (int index = 0; index < myList.size(); index++) {
            if (myList.get(index) % 2 != 0){
                myList.set(index, myList.get(index) +1);
            }

        }

        //Enhance for

        for (int number : myList) {
            System.out.println(number);

        }
    }
}
