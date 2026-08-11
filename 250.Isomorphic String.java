 class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> used = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i), b = t.charAt(i);

            if (map.containsKey(a) && map.get(a) != b)
                return false;

            if (!map.containsKey(a) && used.contains(b))
                return false;

            map.put(a, b);
            used.add(b);
        }

        return true;
    }
}
