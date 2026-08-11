class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length, i = 0, j = n - 1;
        int[] k = new int[n];

        for (int r = n - 1; r >= 0; r--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j]))
                k[r] = nums[i] * nums[i++];
            else
                k[r] = nums[j] * nums[j--];
        }
        return k;
    }
}
