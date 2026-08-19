package _2026_._08_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_160A {
    public static void main(String[] args) throws IOException {
        FastScanner scanner = new FastScanner();

        final int N = scanner.nextInt();
        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = scanner.nextInt();
        }

        System.out.println(solution(coins));
    }

    private static int solution(int[] coins) {
        int totalSum = 0;
        int[] freq = new int[101];

        for (int coin : coins) {
            totalSum += coin;
            freq[coin]++;
        }

        int grabbedSum = 0;
        int count = 0;

        for (int i = 100; i >= 1; i--) {
            while (freq[i] > 0) {
                grabbedSum += i;
                count++;
                freq[i]--;

                if (grabbedSum > totalSum - grabbedSum) {
                    return count;
                }
            }
        }

        return count;
    }

    static class FastScanner {
        BufferedReader reader;
        StringTokenizer tokenizer;

        FastScanner() {
            reader = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}
