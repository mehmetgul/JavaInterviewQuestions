package JavaQuestions.warmup;
/**
 * Is Fibo
 * https://www.hackerrank.com/challenges/is-fibo
 *
 * Created by Mohsen on 12/31/14.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class IsFibo {

    static int count;
    static long[] numbers;

    static ArrayList<Long> fibo;

    static FIBO solveFibo(long number) {
        if (fibo.get(fibo.size() - 1) < number)
            updateFibo(number);

        if (fibo.contains(number))
            return FIBO.IsFibo;
        else
            return FIBO.IsNotFibo;
    }

    private static void updateFibo(long number) {
        int last = fibo.size() - 1;
        long lastNumber = fibo.get(last);

        do {
            lastNumber = fibo.get(last) + fibo.get(last - 1);
            fibo.add(lastNumber);
            last++;
        } while (lastNumber < number);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        count = in.nextInt();
        numbers = new long[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = in.nextLong();
        }

        fibo = new ArrayList<Long>();
        fibo.add(0l);
        fibo.add(1l);


        for (int i = 0; i < count; i++) {
            System.out.println(solveFibo(numbers[i]));
        }

    }

    enum FIBO {
        IsFibo,
        IsNotFibo
    }
}
