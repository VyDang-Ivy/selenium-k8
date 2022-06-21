package lesson_03;

public class ForLoopLearning {

    public static void main(String[] args) {
        //requireRounds: 10
        // total: 0

        final int MAX_NUM = 10;
        //Infinitive loop

        byte number = 0;

        for (; number < MAX_NUM; ) {
            System.out.println(number);
            number++;

        }
    }
}
