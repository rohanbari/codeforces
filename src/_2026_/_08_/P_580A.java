package _2026_._08_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_580A {
    public static void main(String[] args) throws IOException {
        FastScanner scanner = new FastScanner();

        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        System.out.println(solution(values));
    }

    private static int solution(int[] values) {
        int maxLen = 1;
        int curLen = 1;
        for (int i = 1; i < values.length; i++) {
            if (values[i - 1] > values[i]) {
                curLen = 1;
            } else {
                curLen++;
            }

            maxLen = Math.max(maxLen, curLen);
        }

        return maxLen;
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
