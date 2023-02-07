class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        // int score = 0;
        int idx=-1;
        int score[] = new int[4];
        int x = 0;
        
        for(int i=0;i<dartResult.length();i++){
            char ch = dartResult.charAt(i);
            
            if(ch=='S'||ch=='D'||ch=='T'||ch=='*'||ch=='#'){
                if(ch=='S'||ch=='D'||ch=='T'){
                    int n = Integer.parseInt(dartResult.substring(idx+1,i));
                    
                    if(ch=='S'){
                        if(i==1||i==2){
                            score[x]+=Math.pow(n,1);
                        }else{
                            score[x]+=Math.pow(n,1);
                        }
                    }else if(ch=='D'){
                        score[x]+=Math.pow(n,2);
                    }else{
                        score[x]+=Math.pow(n,3);
                    }
                    idx=i;
                    
                   
                }else{
                    if(ch=='*'){
                        score[x]*=2;
                        if(x>=1) score[x-1]*=2;
                    }else{
                        score[x]*=(-1);
                    }
                    idx++;
                }
                
                //System.out.println("score="+score+" answer="+answer);
            }
            else { // 숫자일 때
                answer+=score[x];
                
                // System.out.println("score="+score+" answer="+answer);
                if(x<3) x++;
                continue;
            }
            
            // if(i==dartResult.length()-1){
            //     answer+=score;
            // }
        }
       // System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score[3]);
        answer=score[1]+score[2]+score[3];
        return answer;
    }
}