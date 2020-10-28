package JavaQuestions.arraysandsorting;
/**
 * Insertion Sort - Part 2
 * https://www.hackerrank.com/challenges/insertionsort2
 *
 * Created by Mohsen on 1/14/15.
 */

import java.io.IOException;
import java.util.Scanner;


public class InsertionSortPart2 {
    static int t;

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner in = new Scanner(System.in);

        t = in.nextInt();
        int[] array = new int[t];

        for (int i = 0; i < t; i++) {
            array[i] = in.nextInt();
        }

        int len = array.length;


        for (int i = 1; i < len; i++) {
            int n = array[i];

            int j;
            for (j = i - 1; j >= 0 && array[j] > n; j--)
                array[j + 1] = array[j];
            array[j + 1] = n;

            printArray(array);
        }

    }

    private static void printArray(int[] array) {
        for (int i = 0; i < t; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
