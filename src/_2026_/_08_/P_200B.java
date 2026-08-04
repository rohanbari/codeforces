package _2026_._08_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_200B {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += Double.parseDouble(tokenizer.nextToken());
        }

        double result = sum / n;
        System.out.printf("%.12f\n", result);

        reader.close();
    }
}
