package _2026_._09_;

import java.util.Scanner;

public class P_1883B {
    private static String solution(int n, int k, String str) {
        int[] freq = new int[26];
        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }

        int odds = 0;
        for (int i = 0; i < freq.length; i++) {
            odds += freq[i] % 2;
        }

        return (odds - 1 <= k && n > k) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            String str = scanner.next().trim().substring(0, n);
            System.out.println(solution(n, k, str));
        }

        scanner.close();
    }
}
