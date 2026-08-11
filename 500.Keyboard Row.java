class Solution {
    public String[] findWords(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : "qwertyuiop".toCharArray()) map.put(c, 1);
        for (char c : "asdfghjkl".toCharArray()) map.put(c, 2);
        for (char c : "zxcvbnm".toCharArray()) map.put(c, 3);

        List<String> ans = new ArrayList<>();

        for (String word : words) {
            int row = map.get(Character.toLowerCase(word.charAt(0))); 
            boolean same = true;

            for (char c : word.toLowerCase().toCharArray()) {
                if (map.get(c) != row) {    
                    same = false;
                    break;
                }
            }
            if (same) ans.add(word);
        }

        return ans.toArray(new String[0]);
    }
}
