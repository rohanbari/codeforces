package _2026_._09_;

import java.util.Scanner;

public class P_313A {
    private static int solution(int n) {
        if (n >= 0) {
            return n;
        }

        int option1 = n / 10;
        int option2 = (n / 100) * 10 + (n % 10);

        return Math.max(option1, option2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solution(n));

        scanner.close();
    }
}
