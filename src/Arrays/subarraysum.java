package Arrays;
import java.util.*;
public class subarraysum {
    public int subarraySum(int[] nums, int k) {
        // Initialize the map to store the cumulative sum frequencies
        Map<Integer, Integer> sumCountMap = new HashMap<>();
        // Add the base case: a sum of 0 has one count
        sumCountMap.put(0, 1);

        int currentSum = 0;
        int count = 0;

        // Iterate through the array
        for (int num : nums) {
            // Update the cumulative sum
            currentSum += num;

            // Check if there is a subarray (ending at the current index) which sums to k
            if (sumCountMap.containsKey(currentSum - k)) {
                count += sumCountMap.get(currentSum - k);
            }

            // Update the map with the current cumulative sum count
            sumCountMap.put(currentSum, sumCountMap.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {
        subarraysum solution = new subarraysum();

        // Test case 1
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        System.out.println(solution.subarraySum(nums1, k1)); // Output: 2

        // Test case 2
        int[] nums2 = {1, 2, 3};
        int k2 = 3;
        System.out.println(solution.subarraySum(nums2, k2)); // Output: 2
    }
}
