package _2026_._08_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_785A {
    public static void main(String[] args) throws IOException {
        FastScanner scanner = new FastScanner();
        int N = scanner.nextInt();
        int total = 0;
        while (N-- > 0) {
            total += countFaces(scanner.next());
        }

        System.out.println(total);
    }

    private static int countFaces(String next) {
        if (next.equals("Tetrahedron")) {
            return 4;
        } else if (next.equals("Cube")) {
            return 6;
        } else if (next.equals("Octahedron")) {
            return 8;
        } else if (next.equals("Dodecahedron")) {
            return 12;
        } else if (next.equals("Icosahedron")) {
            return 20;
        }

        return 0;
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
