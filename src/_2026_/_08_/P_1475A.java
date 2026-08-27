package _2026_._08_;

import java.util.Scanner;

public class P_1475A {
    public static void main(String[] args) {
        long[] values = getInput();
        for (int i = 0; i < values.length; i++) {
            boolean res = isDivisible(values[i]);
            System.out.println(res ? "YES" : "NO");
        }
    }

    private static boolean isDivisible(long num) {
        for (long i = 3; i < (long) Math.sqrt(num); i += 2) {
            if (i % 2 == 1 && num % i == 0) {
                return true;
            }
        }

        return false;
    }

    private static long[] getInput() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long[] values = new long[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextLong();
        }

        scanner.close();
        return values;
    }
}
