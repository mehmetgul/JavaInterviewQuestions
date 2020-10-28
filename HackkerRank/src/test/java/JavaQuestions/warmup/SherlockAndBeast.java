package JavaQuestions.warmup;
/**
 * Sherlock and The Beast
 * https://www.hackerrank.com/challenges/sherlock-and-the-beast
 *
 * Created by Mohsen on 1/11/15.
 */

import java.io.IOException;
import java.util.Scanner;


public class SherlockAndBeast {
    static int t;

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner in = new Scanner(System.in);

        t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();

            int m3 = n / 3;
            int r3 = n % 3;

            int m5 = r3 / 5;
            int r5 = r3 % 5;
            while (r5 != 0 && m3 > 0) {
                r3 += 3;
                m3--;

                m5 = r3 / 5;
                r5 = r3 % 5;
            }

            if (r5 != 0) {
                System.out.print("-1");
            } else {
                for (int j = 0; j < m3; j++) {
                    System.out.print("555");
                }

                for (int j = 0; j < m5; j++) {
                    System.out.print("33333");
                }
            }

            System.out.println();

        }
    }
}