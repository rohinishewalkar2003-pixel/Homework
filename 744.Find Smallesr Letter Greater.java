 class Solution {
    public char nextGreatestLetter(char[] let, char target) {
        int l = 0, r = let.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (let[mid] <= target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return let[l % let.length];
    }
}
