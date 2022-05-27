package lesson_02;

public class BitWiseOperator {

    public static void main(String[] args) {

        // Evaluate
 //       if(method01() || method02()){
 //           System.out.println("\t Inside the Function");
 //       }
        System.out.println(4 | 5);

        System.out.println(4 & 5);
    }
    private static boolean method01(){
        System.out.println("method01");
        return true;
    }
    private static boolean method02(){
        System.out.println("method02");
        return false;
    }
}
