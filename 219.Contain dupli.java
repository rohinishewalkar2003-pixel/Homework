 class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int j) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= j)
                return true;
            map.put(nums[i], i);
        }
        return false;
    }
}
