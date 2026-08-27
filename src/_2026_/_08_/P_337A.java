package _2026_._08_;

import java.util.Arrays;
import java.util.Scanner;

public class P_337A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] puzzles = new int[m];
        for (int i = 0; i < m; i++) {
            puzzles[i] = scanner.nextInt();
        }

        scanner.close();

        Arrays.sort(puzzles);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= m - n; i++) {
            int diff = puzzles[i + n - 1] - puzzles[i];
            minDiff = Math.min(minDiff, diff);
        }

        System.out.println(minDiff);
    }
}
