package lesson_05;

public class StringLearning {

    public static void main(String[] args) {

        // Literal declaration
 //       String myName1 = "Dii";
 //       String myName2 = "Dii";

        // String Object declaration
 //       String myName3 = new String("Dii");

 //       System.out.println("myName1 == myName2: " + (myName1.equals(myName2)));
 //       System.out.println("myName1 == myName3: " + (myName1.equals(myName3)));

 //       String myPassword = "123myPassword";
 //       char[] myCharacters = myPassword.toCharArray();
 //       int totalDigits = 0;
 //       int totalLowersCase = 0;
 //       int totalUpperCase = 0;

 //       for (char character : myCharacters) {
 //           if (Character.isDigit(character)){
 //               totalDigits++;
 //           }
 //          if (Character.isLowerCase(character)){
 //               totalLowersCase++;
 //           }
 //           if (Character.isUpperCase(character)){
 //               totalUpperCase++;
 //           }
 //       }

 //       if (totalDigits > 0 && totalLowersCase > 0 && totalUpperCase > 0){
 //           System.out.println("You are all set");
 //       } else {
 //           System.out.println("Password format is incorrect");
 //       }

        // Immutable

        String badWordsContainer = "bad, very bad, something else, bad!!";
        String filteredStr = badWordsContainer.replace("bad", "b**");
        System.out.println(filteredStr);

        // Trim
        System.out.println(badWordsContainer.trim());

        // subString, indexOf, split
        String url = "https://google.com";
        System.out.println(url.substring(0, 5));
        System.out.println(url.substring(8, url.length()));

    }
}
