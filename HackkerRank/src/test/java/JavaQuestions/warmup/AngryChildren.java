package JavaQuestions.warmup;
/**
 * Angry Children
 * https://www.hackerrank.com/challenges/angry-children
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AngryChildren {

    static BufferedReader in = new BufferedReader(new InputStreamReader(
            System.in));
    static StringBuilder out = new StringBuilder();

    public static void main(String[] args) throws NumberFormatException, IOException {
        int numPackets = Integer.parseInt(in.readLine());
        int numKids = Integer.parseInt(in.readLine());
        int[] packets = new int[numPackets];

        for (int i = 0; i < numPackets; i++) {
            packets[i] = Integer.parseInt(in.readLine());
        }

        int unfairness = Integer.MAX_VALUE;

        Arrays.sort(packets);

        unfairness = packets[numPackets - 1] - packets[0];

        for (int i = 0; i < (numPackets - numKids - 1); i++) {
            int compareUnfair = packets[i + numKids - 1] - packets[i];
            if (unfairness > (compareUnfair)) {
                unfairness = compareUnfair;
            }
        }

        System.out.println(unfairness);
    }


}