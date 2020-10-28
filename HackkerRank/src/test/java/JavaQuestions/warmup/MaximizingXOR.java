package JavaQuestions.warmup;
/**
 * Maximizing XOR
 * https://www.hackerrank.com/challenges/maximizing-xor
 *
 * Created by Mohsen on 12/31/14.
 */

import java.util.Scanner;

public class MaximizingXOR {

    static int L, R;

    static int maxXor(int l, int r) {

        int max = 0;

        for (int i = l; i <= r; i++) {
            for (int j = i; j <= r; j++) {
                if ((i ^ j) > max)
                    max = i ^ j;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());

        int _r;
        _r = Integer.parseInt(in.nextLine());

        res = maxXor(_l, _r);
        System.out.println(res);

    }


}
