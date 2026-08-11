package _2026_._08_;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P_443A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Use a HashSet to store unique letters
        Set<Character> letters = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                letters.add(ch);
            }
        }

        System.out.println(letters.size());
        scanner.close();
    }
}
