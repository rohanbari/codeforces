package _2026_._09_;

import java.util.Arrays;
import java.util.Scanner;

public class P_1850D {
    private static int solution(int[] values, int k) {
        Arrays.sort(values);

        int maxLen = 1;
        int curLen = 1;

        for (int i = 1; i < values.length; i++) {
            if (values[i] - values[i - 1] <= k) {
                curLen++;
            } else {
                curLen = 1;
            }

            maxLen = Math.max(maxLen, curLen);
        }

        return values.length - maxLen;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] sols = new int[t];

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] values = new int[n];
            for (int j = 0; j < n; j++) {
                values[j] = scanner.nextInt();
            }

            sols[i] = solution(values, k);
        }

        for (int i = 0; i < t; i++) {
            System.out.println(sols[i]);
        }

        scanner.close();
    }
}
