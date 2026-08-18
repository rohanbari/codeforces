package _2026_._08_;

import java.util.Scanner;

public class P_96A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println(solution(input));

        scanner.close();
    }

    private static String solution(String input) {
        if (input.length() < 7) {
            return "NO";
        } else if (input.contains("1111111") || input.contains("0000000")) {
            return "YES";
        }

        return "NO";
    }
}
