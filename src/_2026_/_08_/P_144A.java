package _2026_._08_;

import java.util.Arrays;
import java.util.Scanner;

public class P_144A {
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
        System.out.println(Arrays.toString(nums));

        scanner.close();
    }

    private static int stepsToSort(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    count++;
                }
            }
        }

        return count;
    }
}
