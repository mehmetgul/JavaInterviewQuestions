package JavaQuestions.warmup;
/**
 * Flipping bits
 * https://www.hackerrank.com/challenges/flipping-bits
 *
 * Created by Mohsen on 1/10/15.
 */

import java.io.IOException;
import java.util.Scanner;

public class FlippingBits {
    static int t;
    static long[] results;

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner in = new Scanner(System.in);

        t = in.nextInt();

        results = new long[t];

        for (int i = 0; i < t; i++) {
            long n = in.nextLong();

            results[i] = flipBits(n);


        }
        for (int i = 0; i < t; i++) {
            System.out.println(results[i]);
        }
    }

    private static long flipBits(long n) {
        long mask = 0xffffffffl;
        long result = n ^ mask;
        return result;
    }


}
