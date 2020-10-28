package JavaQuestions.warmup;
/**
 * Sherlock and GCD
 * https://www.hackerrank.com/challenges/sherlock-and-gcd
 *
 * Created by Mohsen on 1/2/15.
 */

import java.io.IOException;
import java.util.Scanner;


public class SherlockAndGCD {
    static int t;
    static boolean[] results;

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner in = new Scanner(System.in);

        t = in.nextInt();

        results = new boolean[t];

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();

            int[] members = new int[n];

            for (int j = 0; j < n; j++) {
                members[j] = in.nextInt();
            }

            results[i] = checkGDC(members, n);
        }

        for (int i = 0; i < t; i++) {
            System.out.println(results[i] ? "YES" : "NO");
        }
    }

    private static boolean checkGDC(int[] A, int n) {
        if (n < 2) {
            return false;
        } else {
            int currentGcd = A[0];
            for (int i = 1; currentGcd > 1 && i < n; ++i) {
                currentGcd = isGCD(currentGcd, A[i]);
            }
            return currentGcd < 2;
        }
    }

    private static int isGCD(int a, int b) {
        while (b != 0) {
            int c = b;
            b = a % b;
            a = c;
        }
        return a;
    }

}
