package JavaQuestions.warmup;
/**
 * Utopian Tree
 * https://www.hackerrank.com/challenges/utopian-tree
 *
 * Created by Mohsen on 12/31/14.
 */

import java.util.Scanner;

public class UtopianTree {

    static int count;
    static long[] numbers;


    static int solveMeFirst(long number) {
        int result = 1;
        for (int i = 0; i < number / 2; i++) {
            result = result * 2 + 1;
        }
        if (number % 2 != 0)
            result = result * 2;

        return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        count = in.nextInt();
        numbers = new long[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = in.nextLong();
        }

        for (int i = 0; i < count; i++) {
            System.out.println(solveMeFirst(numbers[i]));
        }

    }
}
