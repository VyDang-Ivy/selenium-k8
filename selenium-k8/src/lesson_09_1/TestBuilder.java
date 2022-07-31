package lesson_09_1;

import java.util.ArrayList;
import java.util.List;
import static lesson_09_1.HouseWithBuilder.Builder;

public class TestBuilder {

    // Design Pattern | Design Ideas: Models (template) || 23 - 24 types
    // Builder Design Pattern | Phải dùng Innerclass để create
    public static void main(String[] args) {

        // builder is a Builder object, it's also a variable but ít type is Builder (Reference data - User-defined class)
        Builder builder = new Builder();

        // Method chaining | Optional
        HouseWithBuilder house1 = builder
                .setColor("Blue")
                .setMainDoors(2)
                .setWindows(4)
                .build();

        System.out.println(builder);

        List<HouseWithBuilder> houseWithBuilderList = new ArrayList<>();
        houseWithBuilderList.add(house1); // Immutable
    }
}
