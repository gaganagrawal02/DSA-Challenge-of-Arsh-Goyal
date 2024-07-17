package Arrays;

public class containerwithmostwater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            // Calculate the current area
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            // Update the maximum area if the current area is greater
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to the shorter line towards the center
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
    public static void main(String[] args) {
        containerwithmostwater solution = new containerwithmostwater();

        // Example 1
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max Area: " + solution.maxArea(height1));
    }
}
