package lesson_09;

public class Animal {
    private String name;
    private Boolean flyable;

    public Animal(String name, Boolean flyable) {
        this.name = name;
        this.flyable = flyable;
    }

    @Override
    public String toString() {
        return "Animal{ name: " + name + ", flyable: " + flyable + " }";
    }

    public static class Builder {
        private String name;
        private Boolean flyable;

        public Builder withWings(Boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Animal build() {
            return new Animal(this.name, this.flyable);
        }
    }
}
