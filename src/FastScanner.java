
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

    long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    String nextLine() throws IOException {
        return reader.readLine();
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return a / gcd((int) a, (int) b) * b;
    }

    static long modPow(long base, long exp, long mod) {
        long res = 1;
        while (exp > 0) {
            if ((exp & 1) == 1)
                res = (res * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return res;
    }
}
