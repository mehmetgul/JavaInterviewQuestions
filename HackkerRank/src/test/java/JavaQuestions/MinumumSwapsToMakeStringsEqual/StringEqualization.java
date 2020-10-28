package JavaQuestions.MinumumSwapsToMakeStringsEqual;

import java.util.Arrays;

public class StringEqualization {

    public static void main(String[] args) {
    /*
    1. take first string as original, second as comparison
    2. split strings into char arrays
    3. check first restrictions: not equal strings, strings with odd number of x and y
    4. make comparison one by one each letters
    5. If char is equal to the corresponding index, check the nearsest one.
     */

        String firstString = "yy";
        String secondString  = "xx";


        //to analyze char of the strings
        char[] firstStringArray = getCharsAsArray(firstString);
        char[] secondStringArray = getCharsAsArray(secondString);

        //to count step
        int counter = 0;

        //length of the strings
        int length = firstString.length();

        //check odd occurance of x and y
        if (checkOddOccuranceOfXY(firstString, secondString)) {
            System.out.println("-1");
            return;
        }

        //check length of strings
        if (firstString.length() != secondString.length()) {
            System.out.println("-1");
            return;
        }

        //check if string is empty
        if(firstString.isEmpty() || secondString.isEmpty()) {
            System.out.println("-1");
            return;
        }

        for (int i = 0; i < length; i++) {

            if (firstStringArray[i] == secondStringArray[i]) {
                continue;
            }
            int afterIndexSearch = i + 1;

            while(i < (length - 1)) {

                int searchedLetterIndex = getFirstAfterCertainIndex(firstStringArray, afterIndexSearch, firstStringArray[i]);

                if (searchedLetterIndex == -1) {
                    break;
                }else if(firstStringArray[searchedLetterIndex] == secondStringArray[searchedLetterIndex]) {
                    afterIndexSearch++;
                    continue;
                }else {
                    swap(firstStringArray, secondStringArray, searchedLetterIndex, i);
                    counter++;
                    break;
                }
            }
        }

        //at the end if the arrays don't become equal, it means that two more required!! :))
        //like "xy" and "yx" ---> we have to go two more steps.
        if (!Arrays.equals(firstStringArray, secondStringArray)) {
            counter = counter + 2;
        }

        System.out.println(counter);
        System.out.println(firstStringArray);
        System.out.println(secondStringArray);

    }

    public static int getFirstAfterCertainIndex(char[] array, int startindex, char searchedLetter) {
        for (int i = startindex; i < array.length; i++) {
            if (array[i] == searchedLetter) {
                return i;
            }
        }

        return -1;
    }

    public static int getOccuranceOfX(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            counter = (str.charAt(i) == 'x') ? ++counter : counter;
        }
        return counter;
    }

    public static int getOccuranceOfY(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            counter = (str.charAt(i) == 'y') ? ++counter : counter;
        }
        return counter;
    }

    public static boolean checkOddOccuranceOfXY(String firstString, String secondString) {
        String bothString = firstString + secondString;
        int countX = getOccuranceOfX(bothString);
        int countY = getOccuranceOfY(bothString);
        if ((countX % 2 == 1) || (countY % 2 == 1)) {
            return true;
        }
        return false;
    }

    public static void swap(char[] firstArray, char[] secondArray, int indexOfFristString, int indexOfSecondString) {
        char temp = firstArray[indexOfFristString];
        firstArray[indexOfFristString] = secondArray[indexOfSecondString];
        secondArray[indexOfSecondString] = temp;
    }

    public static char[] getCharsAsArray(String str) {
        final int length = str.length();

        char[] chrArray = new char[length];

        for (int i = 0; i < str.length(); i++) {
            chrArray[i] = str.charAt(i);
        }
        return chrArray;
    }



}