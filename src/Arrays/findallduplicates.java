package Arrays;
import java.util.*;
public class findallduplicates {

        public static List<Integer> findDuplicates(int[] nums) {
            List<Integer> result = new ArrayList<>();

            for (int i = 0; i < nums.length; i++) {
                int index = Math.abs(nums[i]) - 1;
                if (nums[index] < 0) {
                    result.add(Math.abs(nums[i]));
                } else {
                    nums[index] = -nums[index];
                }
            }

            return result;
        }
        public static void main(String[] args) {
            int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
            List<Integer> duplicates = findDuplicates(nums);
            System.out.println("The integers that appear twice are: " + duplicates);
        }
    }

