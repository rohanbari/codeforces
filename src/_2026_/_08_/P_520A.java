package _2026_._08_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_520A {
    public static void main(String[] args) throws IOException {
        FastScanner scanner = new FastScanner();
        scanner.nextInt();
        String line = scanner.next();

        boolean[] seen = new boolean[26];
        for (char c : line.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                seen[c - 'a'] = true;
            }
        }

        for (boolean present : seen) {
            if (!present) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

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
