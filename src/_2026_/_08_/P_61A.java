package _2026_._08_;

import java.util.Scanner;

public class P_61A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num1.length(); i++) {
            char c1 = num1.charAt(i);
            char c2 = num2.charAt(i);

            sb.append((c1 != c2) ? "1" : "0");
        }

        System.out.println(sb.toString());

        scanner.close();
    }
}
