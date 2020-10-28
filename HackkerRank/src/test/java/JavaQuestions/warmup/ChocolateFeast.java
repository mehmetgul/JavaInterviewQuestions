package JavaQuestions.warmup;
/**
 * Chocolate Feast
 * https://www.hackerrank.com/challenges/chocolate-feast
 *
 * Created by Mohsen on 1/2/15.
 */

import java.io.IOException;
import java.util.Scanner;


public class ChocolateFeast {
    static int t;
    static int[] results;

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner in = new Scanner(System.in);

        t = in.nextInt();

        results = new int[t];

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();

            int chocolates = n / c;

            int wrapper = chocolates / m;
            int remains = chocolates % m;
            chocolates += wrapper;
            do {
                int newRemains = (remains + wrapper) % m;
                wrapper = (remains + wrapper) / m;
                remains = newRemains;
                chocolates += wrapper;
            } while ((remains + wrapper) / m > 0);

            results[i] = chocolates;
        }

        for (int i = 0; i < t; i++) {
            System.out.println(String.valueOf(results[i]));
        }
    }
}