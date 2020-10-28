package JavaQuestions.warmup;
/**
 * ACM ICPC Team
 * https://www.hackerrank.com/challenges/acm-icpc-team
 */

import java.io.IOException;
import java.util.Scanner;


public class ACMICPCTeam {
    static int n, m;

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();
        boolean[][] numbers = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String line = in.next();
            for (int j = 0; j < m; j++)
                numbers[i][j] = line.charAt(j) == '1';
        }

        countGroups(numbers);
    }

    private static void countGroups(boolean[][] numbers) {
        int max = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int tempMax = 0;
                for (int k = 0; k < numbers[i].length; k++)
                    tempMax += numbers[i][k] || numbers[j][k] ? 1 : 0;

                if (tempMax > max) {
                    max = tempMax;
                    count = 1;
                } else if (tempMax == max)
                    count++;
            }

        }

        System.out.println(max);
        System.out.println(count);
    }
}