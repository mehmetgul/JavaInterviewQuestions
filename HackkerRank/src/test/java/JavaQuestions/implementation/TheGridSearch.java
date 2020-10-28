package JavaQuestions.implementation;

import java.util.Scanner;

/**
 * Created by Mohsen on 12/03/16.
 */
public class TheGridSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String G[] = null;
        String P[] = null;

        for (int a0 = 0; a0 < t; a0++) {
            int R = in.nextInt();
            int C = in.nextInt();
            G = new String[R];
            for (int G_i = 0; G_i < R; G_i++) {
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            P = new String[r];
            for (int P_i = 0; P_i < r; P_i++) {
                P[P_i] = in.next();
            }

            String result = "NO";

            for (int i = 0; i <= G.length - P.length; i++) {
                int index = G[i].indexOf(P[0]);
                if (index >= 0) {
                    boolean isOkay = true;
                    for (int j = 0; j < P.length; j++) {
                        if (G[i + j].indexOf(P[j]) == index) {
                            continue;
                        } else {
                            isOkay = false;
                            break;
                        }
                    }
                    if (isOkay) {
                        result = "YES";
                        break;
                    }
                }
            }

            System.out.println(result);
        }

    }
}
