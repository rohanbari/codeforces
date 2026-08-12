package _2026_._08_;

import java.util.Scanner;

public class P_996A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        int[] bills = new int[] { 100, 20, 10, 5, 1 };

        int count = 0;
        for (int i = 0; i < 5; i++) {
            count += money / bills[i];
            money %= bills[i];
        }

        System.out.println(count);
        scanner.close();
    }
}
