package _2026_._08_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_1742A {
    public static void main(String[] args) throws IOException {
        FastScanner scanner = new FastScanner();
        int N = scanner.nextInt();

        while (N > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            boolean c1 = a == (b + c);
            boolean c2 = b == (a + c);
            boolean c3 = c == (a + b);

            System.out.println((c1 || c2 || c3) ? "YES" : "NO");
            N--;
        }
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
