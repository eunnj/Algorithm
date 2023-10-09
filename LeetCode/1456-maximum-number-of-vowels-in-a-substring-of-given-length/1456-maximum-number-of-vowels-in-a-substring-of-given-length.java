class Solution {
    public int maxVowels(String s, int k) {
        int cnt = 0;
        int max = 0;
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') cnt++;
        }
        
        max=cnt;
        for(int i=k;i<s.length();i++){
            char c1 = s.charAt(i-k);
            if(c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u') cnt--;
            
            char c2 = s.charAt(i);
            if(c2=='a' || c2=='e' || c2=='i' || c2=='o' || c2=='u') cnt++;
            
            max = Math.max(max,cnt);
        }

        return max;
    }
}
