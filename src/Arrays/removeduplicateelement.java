package Arrays;

public class removeduplicateelement {
    public static int duplicate(int nums[]) {
        if (nums.length == 0) {
            return 0;
        }
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(duplicate(nums));
    }
}
