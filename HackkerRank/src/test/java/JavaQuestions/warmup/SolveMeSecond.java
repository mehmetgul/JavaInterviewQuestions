package JavaQuestions.warmup;
/**
 * Solve me second
 * https://www.hackerrank.com/challenges/solve-me-second
 *
 * Created by Mohsen on 1/12/15.
 */

import java.util.Scanner;

public class SolveMeSecond {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        int sum;
        int _a, _b;
        t = in.nextInt();
        for (int i = 0; i < t; i++) {
            _a = in.nextInt();
            _b = in.nextInt();
            sum = add(_a, _b);
            System.out.println(sum);
        }
    }
}
