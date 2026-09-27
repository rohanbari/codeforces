package _2026_._09_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class FastScanner {
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

public class P_1807D {
    private static void solve(int[] array, int[][] queries) {
        final int N = array.length;

        long[] prefix = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            prefix[i] = prefix[i - 1] + array[i - 1];
        }

        long totalSum = prefix[N];

        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            int k = query[2];

            long segmentSum = prefix[r] - prefix[l - 1];
            long newSum = totalSum - segmentSum + (r - l + 1L) * k;
            System.out.println((newSum % 2 == 1) ? "YES" : "NO");
        }
    }

    public static void main(String[] args) throws IOException {
        FastScanner scanner = new FastScanner();
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int q = scanner.nextInt();
            int[] array = new int[n];
            int[][] queries = new int[q][3];

            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            for (int i = 0; i < q; i++) {
                queries[i][0] = scanner.nextInt();
                queries[i][1] = scanner.nextInt();
                queries[i][2] = scanner.nextInt();
            }

            solve(array, queries);
        }
    }
}
