class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int len1 = word1.length();
        int len2 = word2.length();
        
        for(char ch : word1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        
        for(char ch : word2.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        
        for(char ch : word1.toCharArray()){
                if(!map2.containsKey(ch)) return false;
         
        }
        
        int[] Array1 = map1.values().stream().mapToInt(Integer::intValue).sorted().toArray();
        int[] Array2 = map2.values().stream().mapToInt(Integer::intValue).sorted().toArray();

        return Arrays.equals(Array1, Array2);
    
    }
}