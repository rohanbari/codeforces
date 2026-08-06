package _2026_._08_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_344A {
    public static void main(String[] args) throws IOException {
        FastScanner scanner = new FastScanner();
        int n = scanner.nextInt();
        String prev = scanner.next();
        int groups = 1;

        for (int i = 1; i < n; i++) {
            String curr = scanner.next();
            if (!curr.equals(prev)) {
                groups++;
            }

            prev = curr;
        }

        System.out.println(groups);
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
