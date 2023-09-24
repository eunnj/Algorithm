class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        boolean answer = true;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0) + 1);
            // System.out.println("arr[i]: "+arr[i]+" map.getOrDefault(arr[i]) "+map.get(arr[i]));
        }
        
        HashSet<Integer> set = new HashSet<>();
        for(int i:map.keySet()){
            if(!set.add(map.get(i))){
                return false;
            }
        }
        
        return answer;
    }
}
