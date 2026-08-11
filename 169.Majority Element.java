class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, r = 0;
        for (int n : nums) {
            if (count == 0)
                r = n;
            count += (n == r) ? 1 : -1;
        }
        return r;
    }
}
