package JavaQuestions.arraysandsorting;
/**
 * Insertion Sort - Part 1
 * https://www.hackerrank.com/challenges/insertionsort1
 *
 * Created by Mohsen on 1/13/15.
 */

import java.io.IOException;
import java.util.Scanner;


public class InsertionSortPart1 {
    static int t;

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner in = new Scanner(System.in);

        t = in.nextInt();
        int[] array = new int[t];

        for (int i = 0; i < t; i++) {
            array[i] = in.nextInt();
        }

        int len = array.length;
        int n = array[len - 1];

        int i;
        for (i = len - 1; i > 0 && array[i - 1] > n; i--) {
            array[i] = array[i - 1];
            printArray(array);
        }
        array[i] = n;
        printArray(array);

    }

    private static void printArray(int[] array) {
        for (int i = 0; i < t; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
