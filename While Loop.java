public class Pointer {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int i = 0;
        while (i < nums.length) {
            int j = i + 1;
            while (j < nums.length) {
                System.out.println(nums[i] + " " + nums[j]);
                j++;
            }

            i++;
        }
    }
}
