package Arrays;

public class subarray {
    public int subarraysDivByK(int[] nums, int k) {
        // Array to store the frequency of prefix sum remainders
        int[] remainderCount = new int[k];
        // Initialize the count for remainder 0 with 1 to handle the case when the prefix sum itself is divisible by k
        remainderCount[0] = 1;

        int count = 0;
        int prefixSum = 0;

        for (int num : nums) {
            // Update the prefix sum
            prefixSum += num;
            // Calculate the remainder of the prefix sum with k
            int remainder = ((prefixSum % k) + k) % k; // This handles negative remainders properly

            // Add the count of subarrays found with the same remainder
            count += remainderCount[remainder];

            // Increment the count of the current remainder
            remainderCount[remainder]++;
        }

        return count;
    }
    public static void main(String[] args) {
        subarray solution = new subarray();

        int[] nums1 = {4, 5, 0, -2, -3, 1};
        int k1 = 5;
        System.out.println(solution.subarraysDivByK(nums1, k1));
    }
}
