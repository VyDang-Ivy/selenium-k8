package lesson_09_1;

public class House {
    private String color = "Blue";
    private int mainDoors = 1;
    private int windows = 4;
    private String topRoofColor = "Red";

    public void setColor(String color) {
        this.color = color;
    }

    public void setMainDoors(int mainDoors) {
        this.mainDoors = mainDoors;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setTopRoofColor(String topRoofColor) {
        this.topRoofColor = topRoofColor;
    }

    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", mainDoors=" + mainDoors +
                ", topRoofColor='" + topRoofColor + '\'' +
                '}';
    }

    public static void main(String[] args) {
        House house1 = new House();
        house1.setColor("Black");
        house1.setMainDoors(2);

        System.out.println(house1);

        // Immutable Object | READ-ONLY
        // Builder Design Pattern
    }
}
