class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ret = new ArrayList<>();
        int max=candies[0];
        for(int i=1;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        
        for(int i=0;i<candies.length;i++){
            int n = candies[i]+extraCandies;
            if(n>=max) {
                ret.add(true);
            }else ret.add(false);
        }
          
        return ret;
    }
}