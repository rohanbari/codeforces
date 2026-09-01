package _2026_._09_;

import java.util.Arrays;
import java.util.Scanner;

public class P_34B {
    private static int solution(int[] values, int n, int m) {
        Arrays.sort(values);
        int sum = 0;
        for (int i = 0; i < m && i < n; i++) {
            if (values[i] < 0) {
                sum += -values[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        scanner.close();

        int res = solution(values, n, m);
        System.out.println(res);
    }
}
