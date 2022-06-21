package lesson_08;

import java.security.SecureRandom;

public class Dog extends Animal {

    public int speed(){
        int randomSpeed = new SecureRandom().nextInt(60);
        return randomSpeed;

    }
}
