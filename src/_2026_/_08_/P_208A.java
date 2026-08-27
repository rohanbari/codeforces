package _2026_._08_;

import java.util.Scanner;

public class P_208A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        System.out.println(solution(input));
    }

    private static String solution(String input) {
        input = input.replaceAll("WUB", " ").replaceAll(" +", " ").trim();
        return input;
    }
}
