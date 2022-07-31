package lesson_05;

import java.util.Arrays;

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

        // Immutable - Lesson 6

        String badWordsContainer = "bad, very bad, something else, bad!!";
        String filteredStr = badWordsContainer.replace("bad", "b**");
        System.out.println(filteredStr);

        // Trim
        System.out.println(badWordsContainer.trim());

        // subString, indexOf, split

        String url = "https://google.com";
        System.out.println(url.substring(0, 5));
        System.out.println(url.substring(8, url.length()));

        System.out.println(url.indexOf("o"));
        System.out.println(url.contains("https"));

        String[] splitStr = url.split("://");
        System.out.println(Arrays.toString(splitStr));

        // RegularExpression | Regex

        String cookingTimeStr = "105mins";
        String cookingTimeNumStr = cookingTimeStr.replaceAll("[^0-9]", "");
        System.out.println(cookingTimeNumStr);

        int cookingTimeNum = Integer.valueOf(cookingTimeNumStr);
        System.out.println("My cooking Time: " + (cookingTimeNum + 1));

        for (int index = 0; index < 5; index++) {
            System.out.println("Element " + (index + 1));
        }

        // Pattern, Matcher

        // Concat | Concatenation
        String s1 = "Hello, ";
        String s2 = "Goodbye, ";
        System.out.println(s1.concat(s2).concat("!"));

        // StringBuilder


    }
}
