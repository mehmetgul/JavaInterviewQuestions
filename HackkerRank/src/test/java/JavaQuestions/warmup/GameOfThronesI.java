package JavaQuestions.warmup;
/**
 * Game of Thrones - I
 * https://www.hackerrank.com/challenges/game-of-thrones
 *
 * Created by Mohsen on 1/1/15.
 */

import java.io.IOException;
import java.util.Scanner;

public class GameOfThronesI {

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();

        String ans = "NO";

        if (isPalindrome(inputString))
            ans = "YES";

        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        System.out.println(ans);
        myScan.close();
    }

    private static boolean isPalindrome(String inputString) {
        Boolean hasEven = false;
        while (inputString.length() > 0) {
            char c = inputString.charAt(0);
            String tempString = inputString.replaceAll(String.valueOf(c), "");
            int count = inputString.length() - tempString.length();

            if (count % 2 != 0)
                if (hasEven)
                    return false;
                else
                    hasEven = true;

            inputString = tempString;
        }

        return true;
    }


}