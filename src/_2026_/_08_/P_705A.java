package _2026_._08_;

import java.util.Scanner;

public class P_705A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        boolean isHate = true;

        while (N-- > 0) {
            result.append("I");
            result.append(isHate ? " hate " : " love ");
            isHate = !isHate;

            if (N > 0) {
                result.append("that ");
            } else if (N == 0) {
                result.append("it");
            }
        }

        System.out.println(result.toString());

        scanner.close();
    }
}
