class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String str="";
        String before = "";
        
        for(int i=0;i<babbling.length;i++){
            str = babbling[i];
            System.out.println("처음 : "+str);
            before="";
            while(true){
                if(str.startsWith("aya")){
                    if(before=="aya") break;
                    str = str.substring(3,str.length());
                    before = "aya";
                    System.out.println(str);
                }
                else if(str.startsWith("ye")){
                    if(before=="ye") break;
                    str =str.substring(2,str.length());
                    before = "ye";
                    System.out.println(str);
                }
                else if(str.startsWith("woo")){
                    if(before=="woo") break;
                    str = str.substring(3,str.length());
                    before = "woo";
                    System.out.println(str);
                }
                else if(str.startsWith("ma")){
                    if(before=="ma") break;
                    str = str.substring(2,str.length());
                    before = "ma";
                    System.out.println(str);
                }
                else break;
            }
            if(str.length()==0) {
                answer ++;
                System.out.println("answer + 1: "+babbling[i]);
            }
            
        }
        
        return answer;
    }
}