package _2026_._08_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_136A {
    public static void main(String[] args) throws IOException {
        FastScanner scanner = new FastScanner();
        int N = scanner.nextInt();
        int[] p = new int[N + 1];
        int[] gifts = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            p[i] = scanner.nextInt();
            gifts[p[i]] = i;
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(gifts[i] + " ");
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
