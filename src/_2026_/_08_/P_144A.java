package _2026_._08_;

import java.util.Scanner;

public class P_144A {
    private static int stepsToSort(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int maxIdx = 0;
        int minIdx = 0;

        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxIdx = i;
            }

            if (min >= nums[i]) {
                min = nums[i];
                minIdx = i;
            }
        }

        int moves = maxIdx + (nums.length - 1 - minIdx);
        if (minIdx < maxIdx) {
            moves--;
        }

        return moves;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline
        String[] strNums = scanner.nextLine().split(" ");

        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(strNums[i]);
        }

        int steps = stepsToSort(nums);
        System.out.println(steps);

        scanner.close();
    }
}
