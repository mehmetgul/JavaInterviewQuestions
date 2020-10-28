package JavaQuestions.warmup;
/**
 * Alternating Characters
 * https://www.hackerrank.com/challenges/alternating-characters
 *
 */

import java.util.Scanner;

public class AlternatingCharacters {

    static int count;
    static String[] strings;


    static int solveMeFirst(String input) {
        int result = 0;
        char last = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (last == input.charAt(i))
                result++;
            else
                last = input.charAt(i);
        }

        return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        count = in.nextInt();
        strings = new String[count];

        for (int i = 0; i < count; i++) {
            strings[i] = in.next();
        }


        for (int i = 0; i < count; i++) {
            System.out.println(solveMeFirst(strings[i]));
        }

    }
}
