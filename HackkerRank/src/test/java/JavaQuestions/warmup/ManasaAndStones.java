package JavaQuestions.warmup;
/**
 * Manasa and Stones
 * https://www.hackerrank.com/challenges/manasa-and-stones
 *
 * Created by Mohsen on 1/2/15.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ManasaAndStones {
    static int t;

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner in = new Scanner(System.in);

        t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();

            ArrayList<Integer> result = new ArrayList<Integer>();

            if (n == 1) {
                result.add(0);
            } else {
                for (int j = 0; j < n; j++) {
                    int r = a * j + b * (n - 1 - j);
                    if (!result.contains(r))
                        result.add(r);
                }
                Collections.sort(result);
            }

            System.out.println(result.toString().replace("[", "").replace("]", "").replace(",", ""));

        }

    }
}