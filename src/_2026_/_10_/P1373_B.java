package _2026_._10_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1373_B {
    private static boolean solve(String s) {
        int c0 = 0;
        int c1 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                c0++;
            } else if (s.charAt(i) == '1') {
                c1++;
            }
        }

        int min = Math.min(c0, c1);
        return min % 2 == 1;
    }

    public static void main(String[] args) throws IOException {
        FastScanner scanner = new FastScanner();
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
            boolean res = solve(s);
            System.out.println(res ? "DA" : "NET");
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
