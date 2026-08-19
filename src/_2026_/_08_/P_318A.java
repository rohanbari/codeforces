package _2026_._08_;

import java.util.Scanner;

public class P_318A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();

        System.out.println(solution(n, k));
        scanner.close();
    }

    private static long solution(long n, long k) {
        long oddCount = (n + 1) / 2; // number of odd elements

        if (k <= oddCount) {
            return 2 * k - 1; // k-th odd
        } else {
            return 2 * (k - oddCount); // (k - oddCount)-th even
        }
    }
}