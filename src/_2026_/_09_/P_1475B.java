package _2026_._09_;

import java.util.Scanner;

public class P_1475B {
    private static boolean solve(int n) {
        return n / 2020 >= n % 2020;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            boolean res = solve(n);

            System.out.println(res ? "YES" : "NO");
        }

        scanner.close();
    }
}
