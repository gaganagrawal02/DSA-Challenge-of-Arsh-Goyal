package Arrays;

public class sortcolor {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0: // Red
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                case 1: // White
                    mid++;
                    break;
                case 2: // Blue
                    swap(nums, mid, high);
                    high--;
                    break;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        sortcolor solution = new sortcolor();

        // Example 1
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums1);
        System.out.print("Sorted array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        // Output: 0 0 1 1 2 2

        System.out.println();
    }
}
