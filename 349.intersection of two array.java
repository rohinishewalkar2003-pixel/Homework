class Solution {
    public int[] intersection(int[] a, int[] b) {
        Set<Integer> s = new HashSet<>();
        Set<Integer> r = new HashSet<>();
        
         for (int x : a) {
            s.add(x);
        }
     
         for (int x : b) {
            if (s.contains(x)) {
                r.add(x);
            }
        }
        
        int[] result = new int[r.size()];
        int index = 0;
        for (int num : r) {
            result[index] = num;
            index++;
        }
        
        return result;
    }
}
