class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int L = 10;
        int R = 12;
        
        for(int i=0;i<numbers.length;i++){
            int num = numbers[i];
            
            if(num == 1 || num == 4 || num == 7){ // 왼손
                answer+="L";
                L=num;
            }else if(num == 3 || num == 6 || num == 9){ // 오른손
                answer+="R";
                R=num;
            }else{
                if(num==0) num=11;
                
                int ldiff =  (Math.abs(num - L) / 3) + (Math.abs(num - L) % 3);
                int rdiff =  (Math.abs(num - R) / 3) + (Math.abs(num - R) % 3);
                
                if(ldiff<rdiff){
                    answer+="L";
                    L=num;
                }else if(ldiff>rdiff){
                    answer+="R";
                    R=num;
                }else{
                    if(hand.equals("right")){
                        answer+="R";
                        R=num;
                    }
                    else{
                        answer+="L";
                        L=num;
                    }
                }
            }
        }
        
        return answer;
    }
}