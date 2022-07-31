package lesson_09_1;

public class HouseWithBuilder {
    private String color = "Blue";
    private int mainDoors = 1;
    private int windows = 4;
    private String topRoofColor = "Red";

    protected HouseWithBuilder(Builder builder){
        this.color = builder.color;
        this.mainDoors = builder.mainDoors;
        this.windows = builder.windows;
        this.topRoofColor = builder.topRoofColor;
    }

    // READ-ONLY
    public String getColor() {
        return color;
    }

    public int getMainDoors() {
        return mainDoors;
    }

    public int getWindows() {
        return windows;
    }

    public String getTopRoofColor() {
        return topRoofColor;
    }

    @Override
    public String toString() {
        return "HouseWithBuilder{" +
                "color='" + color + '\'' +
                ", mainDoors=" + mainDoors +
                ", windows=" + windows +
                ", topRoofColor='" + topRoofColor + '\'' +
                '}';
    }

    // Inner Class
    public static class Builder {
        private String color = "Blue";
        private int mainDoors = 1;
        private int windows = 4;
        private String topRoofColor = "Red";

        // WRITE ONLY

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMainDoors(int mainDoors) {
            this.mainDoors = mainDoors;
            return this;
        }

        public Builder setWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public Builder setTopRoofColor(String topRoofColor) {
            this.topRoofColor = topRoofColor;
            return this;

        }

        public HouseWithBuilder build(){
            return new HouseWithBuilder(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "color='" + color + '\'' +
                    ", mainDoors=" + mainDoors +
                    ", windows=" + windows +
                    ", topRoofColor='" + topRoofColor + '\'' +
                    '}';
        }
    }
}
