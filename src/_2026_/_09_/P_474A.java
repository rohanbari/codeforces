package _2026_._09_;

import java.util.Scanner;

public class P_474A {
    private static String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";

    private static String solve(char dir, String input) {
        StringBuilder sb = new StringBuilder();
        int shift = (dir == 'R') ? -1 : 1;

        for (char c : input.toCharArray()) {
            int idx = keyboard.indexOf(c);
            sb.append(keyboard.charAt(idx + shift));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char dir = scanner.nextLine().charAt(0);
        String input = scanner.nextLine();

        String result = solve(dir, input);
        System.out.println(result);

        scanner.close();
    }
}
