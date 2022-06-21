package lesson_08;

import java.security.SecureRandom;

public class Tiger extends Animal {

    public int speed(){
        int randomSpeed = new SecureRandom().nextInt(100);
        return randomSpeed;

    }
}
