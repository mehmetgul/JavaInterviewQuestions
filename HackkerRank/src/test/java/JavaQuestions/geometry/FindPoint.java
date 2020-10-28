package JavaQuestions.geometry;
/**
 * Find Point
 * https://www.hackerrank.com/challenges/find-point
 *
 * Created by Mohsen on 1/13/15.
 */

import java.io.IOException;
import java.util.Scanner;


public class FindPoint {
    static int t;

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner in = new Scanner(System.in);

        t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();

            int x3 = 2 * x2 - x1;
            int y3 = 2 * y2 - y1;

            System.out.println(x3 + " " + y3);
        }
    }
}
