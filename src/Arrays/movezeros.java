package Arrays;

public class movezeros {
    public static void zero(int nums[]) {
        int nonZeroIndex = 0; // Pointer for placing non-zero elements

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap the non-zero element with the element at nonZeroIndex
                int temp = nums[nonZeroIndex];
                nums[nonZeroIndex] = nums[i];
                nums[i] = temp;

                // Move the nonZeroIndex forward
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        movezeros solution = new movezeros();


        int[] nums1 = {0, 1, 0, 3, 12};
        solution.zero(nums1);
        System.out.print("Result: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
