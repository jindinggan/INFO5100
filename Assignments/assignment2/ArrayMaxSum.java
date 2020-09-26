package assignment2;

public class ArrayMaxSum {
    /**
     * Given an integer array nums, find the contiguous subarray (containing at least one number)
     * which has the largest sum and outprint its sum.
     *
     * Example 1:
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     *
     * Example 2:
     * Input: nums = [1]
     * Output: 1
     */
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            maxSum = Math.max(maxSum, sum);
            sum = Math.max(0, sum);
        }
        System.out.println("The max sum of the given array is " + maxSum);
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        ArrayMaxSum test = new ArrayMaxSum();
        test.maxSubArray(arr);
    }
}
