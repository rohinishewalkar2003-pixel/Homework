 class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int n : nums)
            xor ^= n;
        int bit = xor & -xor;
        int r = 0, s = 0;
        for (int n : nums) {
            if ((n & bit) == 0)
                r ^= n;
            else
                s ^= n;
        }
        return new int[]{r, s};
    }
}
