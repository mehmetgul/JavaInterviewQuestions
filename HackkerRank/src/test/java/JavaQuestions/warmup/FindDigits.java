package JavaQuestions.warmup;
/**
 * Find Digits
 * https://www.hackerrank.com/challenges/find-digits
 *
 * Created by Mohsen on 12/31/14.
 */

import java.util.Scanner;

public class FindDigits {

    static int count;
    static int[] numbers;


    static int solveMeFirst(int number) {
        int result = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;

            if (digit != 0 && number % digit == 0)
                result++;

            temp = temp / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        count = in.nextInt();
        numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = in.nextInt();
        }

        for (int i = 0; i < count; i++) {
            System.out.println(solveMeFirst(numbers[i]));
        }

    }
}




