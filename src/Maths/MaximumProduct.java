package Maths;
import  java.util.*;
public class MaximumProduct {
    public static int maximumProduct(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        int n = nums.length;

        // Product of the three largest numbers
        int max1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Product of the two smallest numbers and the largest number
        int max2 = nums[0] * nums[1] * nums[n - 1];

        // Return the maximum of the two products
        return Math.max(max1, max2);
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println("Maximum product of [1, 2, 3]: " + maximumProduct(nums));

    }
}
