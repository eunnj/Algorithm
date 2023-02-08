class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int zero_cnt =0;
        
        for(int i=0;i<lottos.length;i++){
            int n = lottos[i];
            if(n==0) {
                zero_cnt++;
                continue;
            }else{
                 for(int j=0;j<win_nums.length;j++){
                if(win_nums[j]==n) {
                    cnt++;
                    break;
                    }
                }
            }
           
        }
        
        int min_score = cnt;
        int max_score = cnt+zero_cnt;
        
        switch(max_score){
            case 1 : answer[0]=6; break;
            case 2 : answer[0]=5; break;
            case 3 : answer[0]=4; break;
            case 4 : answer[0]=3; break;
            case 5 : answer[0]=2; break;
            case 6 : answer[0]=1; break;
            default : answer[0]=6; break; // 0개
        }
        
        switch(min_score){
            case 1 : answer[1]=6; break;
            case 2 : answer[1]=5; break;
            case 3 : answer[1]=4; break;
            case 4 : answer[1]=3; break;
            case 5 : answer[1]=2; break;
            case 6 : answer[1]=1; break;
            default : answer[1]=6; break; // 0개
        }
        
         
        System.out.println(zero_cnt+"/"+cnt);
        
        return answer;
    }
}