package lesson_08;

import java.security.SecureRandom;

public class Horse extends Animal {

    public int speed(){
        int randomSpeed = new SecureRandom().nextInt(75);
        return randomSpeed;
    }
}
