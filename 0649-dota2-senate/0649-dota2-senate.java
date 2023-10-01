class Solution {
    public String predictPartyVictory(String senate) {
        String ans = "";
        Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();
        int n = senate.length();
        
        
        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='R') r.offer(i);
            else d.offer(i);
        }
    
        while(!r.isEmpty() && !d.isEmpty()){
            int n1 = r.poll();
            int n2 = d.poll();
            
            if(n1<n2){
                r.add(n1+n);
            }else{
                d.add(n2+n);
            }
            
        }
        
        return r.isEmpty() ? "Dire" : "Radiant";
    }
}