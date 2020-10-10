package assignment4;

public class Test {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 5, 6, 6, 6};
        assert(KthElement.findKthLargest(arr, 5) == 5);
        assert(KthElement.findKthLargest(arr, 1) == 1);
        assert(KthElement.findKthLargest(arr, 2) == 2);
        System.out.println("test case 1 passed!");
        int[] arr1 = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1};
        assert(KthElement.findKthLargest(arr1, 1) == 1);
        System.out.println("test case 2 passed!");
        int[] arr2 = new int[] {};
        try {
            KthElement.findKthLargest(arr2, 1);
        } catch (Exception e) {
            System.out.println("Error! Input array is empty!");
        }

    }
}
