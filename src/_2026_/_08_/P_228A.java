package _2026_._08_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P_228A {
    public static void main(String[] args) throws IOException {
        FastScanner scanner = new FastScanner();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            set.add(scanner.nextInt());
        }

        System.out.println(4 - set.size());
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
