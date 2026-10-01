package _2026_._09_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_1624B {
    private static boolean solve(int a, int b, int c) {
        int reqA = 2 * b - c;
        if (reqA > 0 && reqA % a == 0) {
            return true;
        }

        int reqB = (a + c) / 2;
        if ((a + c) % 2 == 0 && reqB % b == 0) {
            return true;
        }

        int reqC = 2 * b - a;
        if (reqC > 0 && reqC % c == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        FastScanner scanner = new FastScanner();
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            boolean res = solve(a, b, c);
            System.out.println(res ? "YES" : "NO");
        }
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
    }
}
