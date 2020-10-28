package JavaQuestions.implementation;

import java.io.IOException;
import java.util.Scanner;

/**
 * Cavity Map
 * https://www.hackerrank.com/challenges/cavity-map
 * <p/>
 * Created by Mohsen on 1/12/15.
 */

public class CavityMap {
    static int t;

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner in = new Scanner(System.in);

        t = in.nextInt();
        int[][] array = new int[t][t];

        for (int i = 0; i < t; i++) {
            String line = in.next();
            char[] c = line.toCharArray();
            for (int j = 0; j < t; j++) {
                array[i][j] = c[j] - '0';
            }
        }

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (i != 0 && j != 0 && i != t - 1 && j != t - 1) {
                    boolean left = array[i][j] > array[i][j - 1];
                    boolean right = array[i][j] > array[i][j + 1];
                    boolean top = array[i][j] > array[i - 1][j];
                    boolean bottom = array[i][j] > array[i + 1][j];
                    if (left && right && top && bottom)
                        System.out.printf("x");
                    else
                        System.out.printf(array[i][j] + "");
                } else {
                    System.out.printf(array[i][j] + "");
                }
            }
            System.out.println();
        }
    }
}
