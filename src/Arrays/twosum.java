package Arrays;

public class twosum {
    public static int[] Sum(int[] nums, int target) {
        // Iterate through the array with two loops
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of nums[i] and nums[j] equals the target
                if (nums[i] + nums[j] == target) {
                    // Return the indices if the sum matches the target
                    return new int[] { i, j };
                }
            }
        }
        // If no solution is found, throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
        twosum solution = new twosum();
        // Example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.Sum(nums1, target1);
        System.out.println("Indices: [" + result1[0] + ", " + result1[1] + "]");
    }
}
