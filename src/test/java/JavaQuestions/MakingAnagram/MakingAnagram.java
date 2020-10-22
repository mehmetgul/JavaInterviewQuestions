package JavaQuestions.MakingAnagram;

import java.util.Scanner;

public class MakingAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String firstString = scanner.nextLine();

        System.out.println("Enter second string");
        String secondString = scanner.nextLine();

        char[] smallerArray = getSmallerArray(firstString, secondString);
        char[] largerArray = getLargerArray(firstString, secondString);


        for (int i = 0; i < smallerArray.length; i++){
            char charFromSmallerArray = smallerArray[i];
            for (int j  = 0; j < largerArray.length; j++){
                if (charFromSmallerArray == largerArray[j]){
                    smallerArray[i] = '0';
                    largerArray[j] = '0';
                    break;
                }
            }
        }

        int totalNumberOfCharToBeDeleted = getTotalNonZeroChars(smallerArray, largerArray);

        System.out.println(totalNumberOfCharToBeDeleted);



    }


    public static char[] getSmallerArray(String firstString, String secondString){
        int string1Size = firstString.length();
        int string2Size = secondString.length();
        if(string1Size > string2Size){
            return secondString.toCharArray();
        }else{
            return firstString.toCharArray();
        }
    }

    public static char[] getLargerArray(String firstString, String secondString){
        int string1Size = firstString.length();
        int string2Size = secondString.length();
        if(string2Size >= string1Size){
            return secondString.toCharArray();
        }else{
            return firstString.toCharArray();
        }
    }

    public static int getTotalNonZeroChars(char[] array1, char[] array2){
        //to count total delete
        int count = 0;
        for (char letter : array1) {
            count = (letter != '0') ? ++count : count;
        }

        for (char letter : array2) {
            count = (letter != '0') ? ++count : count;
        }

        return count;
    }

}
