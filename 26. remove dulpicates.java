class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> newset = new HashSet<>();
        int k = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (newset.contains(nums[i])) {
            } else {
                newset.add(nums[i]);
                nums[k] = nums[i];
                k = k + 1;
                count = count +1;
            }
        }
        return count;
    }
}
