class Solution {
    public int solution(String s) {
        int answer = 0;
        String result = "";
        String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        String str ="";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(ch>='0' && ch<='9') {
                result+=ch;
            }
            else{
                str+=ch;
            }
        
            if(str.length()>=3){
                    for(int j=0;j<arr.length;j++){
                        if(str.equals(arr[j])){ 
                            result+=Integer.toString(j);
                            str="";
                            break;
                        }
                    }
        }
        }
        
        answer = Integer.parseInt(result);
        return answer;
        
    }
}