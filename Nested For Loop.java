public class Pointer {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.println(nums[i] + " " + nums[j]);
            }
        }
    }
} 


