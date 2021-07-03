package org.janardhan.leet;

public class LongestContinousIncreasingSubsequence {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 4, 7};
        System.out.println(findLengthOfLCIS(arr));
    }

    public static int findLengthOfLCIS(int[] nums) {
        int res = 1;
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                dp[i] = dp[i - 1] + 1;
                res = Math.max(res, dp[i]);
            }


        }
        return res;
    }
}
