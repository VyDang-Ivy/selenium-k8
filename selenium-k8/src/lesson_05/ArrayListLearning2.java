package lesson_05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListLearning2 {

    public static void main(String[] args) {

        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(1);
        myArrList.add(4);
        myArrList.add(1);
        myArrList.add(2);
        myArrList.add(3);
        myArrList.add(4);
        myArrList.add(4);
        myArrList.add(4);

        Set<Integer> set = new HashSet<>(myArrList);
        System.out.println(set);
        List<Integer> arrayListWWithSet = new ArrayList<>(set);
        System.out.println(arrayListWWithSet);

        // 3: Exclusive
        List<Integer> first3MinValues = arrayListWWithSet.subList(0,3);
        System.out.println(first3MinValues);

    }
}
