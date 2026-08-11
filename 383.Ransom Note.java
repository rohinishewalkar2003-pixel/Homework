class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashSet<Character> set = new HashSet<>();

        for (char c : magazine.toCharArray())
            set.add(c);

        for (char c : ransomNote.toCharArray())
            if (!set.contains(c))
                return false;

        return true;
    }
}
