package _2026_._09_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_1878C {
    public static void main(String[] args) throws IOException {
        FastScanner scanner = new FastScanner();
        int N = scanner.nextInt();

        while (N-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            long x = scanner.nextLong();

            System.out.println(solve(n, k, x) ? "YES" : "NO");
        }
    }

    private static boolean solve(long n, long k, long x) {
        // Setting the feasible boundary
        long minSum = k * (k + 1) / 2;
        long maxSum = k * n - k * (k - 1) / 2;

        // Checking feasibility
        if (x < minSum || x > maxSum) {
            return false;
        }

        return true;
    }

    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public FastScanner() {
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

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}