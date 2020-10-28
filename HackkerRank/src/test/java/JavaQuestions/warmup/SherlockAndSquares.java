package JavaQuestions.warmup;
/**
 * Sherlock and Squares
 * https://www.hackerrank.com/challenges/sherlock-and-squares
 *
 * Created by Mohsen on 1/2/15.
 */

import java.io.IOException;
import java.util.Scanner;


public class SherlockAndSquares {
    static int t;
    static int[] results;
//    static ArrayList<Integer> squares;
//    static int max = 1;

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner in = new Scanner(System.in);

        t = in.nextInt();

        results = new int[t];
//        squares = new ArrayList<Integer>();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

//            int result = 0;

//            completeSquares(b);

//            for (int j = a; j <= b; j++) {
//                if (Math.sqrt(j) % 1 == 0)
//                    result++;
//            }

//            for (int j = a; j <= b; j++) {
//                if (squares.contains(j))
//                    result++;
//            }

            int result = (int) Math.sqrt(b) - (int) Math.sqrt(a);
            if (Math.sqrt(a) % 1 == 0)// || Math.sqrt(a) % 1 == 0)
                result++;


            results[i] = result;
        }

        for (int i = 0; i < t; i++) {
            System.out.println(String.valueOf(results[i]));
        }
    }

//    private static void completeSquares(int b) {
//        if (max < b) {
//            int lastSquare = max;
//
//            while (b > lastSquare) {
//                squares.add(lastSquare * lastSquare);
//                lastSquare++;
//            }
//
//            max=b;
//        }
//    }
}