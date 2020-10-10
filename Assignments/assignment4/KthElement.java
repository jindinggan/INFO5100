package assignment4;

public class KthElement {
    public static int findKthLargest(int[] nums, int k) {
        if (nums.length == 0) {
            throw new NullPointerException("invalid input!");
        }
        return quickSelect(nums, 0, nums.length - 1, k);
    }

    private static int quickSelect(int[] nums, int low, int high, int k) {
        int pivot = low;

        for (int j = low; j < high; j++) {
            if (nums[j] <= nums[high]) {
                swap(nums, pivot++, j);
            }
        }
        swap(nums, pivot, high);
        int count = high - pivot + 1;

        if (count == k) {
            return nums[pivot];
        }

        if (count > k) {
            return quickSelect(nums, pivot + 1, high, k);
        }

        return quickSelect(nums, low, pivot - 1, k - count);
    }

    private static void swap(int[] nums, int pivot, int high) {
        int temp = nums[pivot];
        nums[pivot] = nums[high];
        nums[high] = temp;
    }

}
