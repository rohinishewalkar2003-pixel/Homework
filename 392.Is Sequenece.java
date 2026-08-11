class Solution {
    public boolean isSubsequence(String a, String b) {
        int i = 0;
        for (int j = 0; j < b.length(); j++) {
            if (i < a.length() && a.charAt(i) == b.charAt(j))
                i++;
        }
        return i == a.length();
    }
}

