package lesson_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {

    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(911, "Police");
        emergencyList.put(115, "Hospital");
        emergencyList.put(117, "Others");
        emergencyList.put(110, "Others");

        for (Integer key : emergencyList.keySet()) {
            if (emergencyList.get(key).equals("Others")){
                emergencyList.replace(key, "Something else!");
            }

            // emergencyList.replace(key, "Something else!");
        }

        // ConcurrentModificationException

        for (int key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));

        }
    }
}
