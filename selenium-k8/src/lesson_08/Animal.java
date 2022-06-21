package lesson_08;

import java.security.SecureRandom;

public class Animal {

    public int speed(){
        int randomSpeed = new SecureRandom().nextInt(50);
        return randomSpeed;
    }
}
