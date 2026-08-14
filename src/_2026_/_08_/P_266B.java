package _2026_._08_;

import java.util.Scanner;

public class P_266B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of children
        int t = sc.nextInt(); // number of seconds
        String s = sc.next(); // initial queue
        char[] queue = s.toCharArray();

        for (int time = 0; time < t; time++) {
            for (int i = 0; i < n - 1; i++) {
                if (queue[i] == 'B' && queue[i + 1] == 'G') {
                    queue[i] = 'G';
                    queue[i + 1] = 'B';
                    i++;
                }
            }
        }

        System.out.println(new String(queue));
        sc.close();
    }
}
