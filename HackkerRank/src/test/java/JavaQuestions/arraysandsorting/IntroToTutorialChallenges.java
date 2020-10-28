package JavaQuestions.arraysandsorting;
/**
 * Intro to Tutorial Challenges
 * https://www.hackerrank.com/challenges/tutorial-intro
 *
 * Created by Mohsen on 1/13/15.
 */

import java.io.IOException;
import java.util.Scanner;


public class IntroToTutorialChallenges {
    static int t,v;

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner in = new Scanner(System.in);

        v = in.nextInt();

        t = in.nextInt();

        int count =0;

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();

            if(n==v) {
                System.out.println(i);
                break;
            }
        }

    }
}