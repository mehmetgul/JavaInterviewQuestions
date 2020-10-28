package JavaQuestions.warmup;
/**
 * The Love-Letter Mystery
 * https://www.hackerrank.com/challenges/the-love-letter-mystery
 *
 * Created by Mohsen on 12/31/14.
 */

import java.util.Scanner;

public class TheLoveLetterMystery {

    static int count;
    static String[] strings;


    static int solveMeFirst(String input) {
        int result = 0;

        int len = input.length();
        int half = len / 2;

        char[] chars = input.toCharArray();

        for (int i = 0; i < half; i++) {
            if (chars[i] != chars[len - i - 1]) {
                //while (chars[i] != chars[len - i - 1]) {
                //chars[len - i - 1] = (char) (chars[len - i - 1] - 1);
                result += Math.abs(chars[i] - chars[len - i - 1]);
            }
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
