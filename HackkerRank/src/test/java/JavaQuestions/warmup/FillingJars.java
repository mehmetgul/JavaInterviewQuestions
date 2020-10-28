package JavaQuestions.warmup;
/**
 * Filling Jars
 * https://www.hackerrank.com/challenges/filling-jars
 *
 * Created by Mohsen on 1/1/15.
 */

import java.io.IOException;
import java.util.Scanner;


public class FillingJars {
    static int n, m;
//    static int[] jars;

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

//        jars = new int[n];

        long sum = 0;

        for (int i = 0; i < m; i++) {
            long a = in.nextInt();
            long b = in.nextInt();
            long k = in.nextInt();

            /*
            for (int j = a; j <= b; j++) {
//                jars[j - 1] += k;
                sum += k;
            }
            */

            sum += k * (Math.abs(b - a) + 1);
        }

        long average = sum / n;

        System.out.printf(String.valueOf(average));
    }
}