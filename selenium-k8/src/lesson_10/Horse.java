package lesson_10;

import java.security.SecureRandom;

public class Horse extends Animal {
    @Override
    public int speed() {
        return new SecureRandom().nextInt(75);
    }
}
