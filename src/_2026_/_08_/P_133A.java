package _2026_._08_;

import java.util.Scanner;

public class P_133A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(solution(input));

        scanner.close();
    }

    private static String solution(String input) {
        for (char c : input.toCharArray()) {
            if ("HQ9".contains(String.valueOf(c))) {
                return "YES";
            }
        }

        return "NO";
    }
}
