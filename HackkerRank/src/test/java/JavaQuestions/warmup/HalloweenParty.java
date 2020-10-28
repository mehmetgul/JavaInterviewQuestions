package JavaQuestions.warmup;
/**
 * Halloween party
 * https://www.hackerrank.com/challenges/halloween-party
 *
 * Created by Mohsen on 1/2/15.
 */

import java.io.IOException;
import java.util.Scanner;


public class HalloweenParty {
    static int t;
    static long[] results;

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner in = new Scanner(System.in);

        t = in.nextInt();

        results = new long[t];

        for (int i = 0; i < t; i++) {
            long k = in.nextLong();

            long result;

            if (k % 2 == 0)
                result = (k / 2) * (k / 2);
            else
                result = (k / 2) * (k / 2 + 1);

            results[i] = result;
        }

        for (int i = 0; i < t; i++) {
            System.out.println(String.valueOf(results[i]));
        }
    }
}