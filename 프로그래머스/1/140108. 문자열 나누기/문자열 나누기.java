class Solution {
    public int solution(String s) {
        int answer = 0;
        int cntA = 0;
        int cntB = 0;
        char x = s.charAt(0);
        for(char c : s.toCharArray()){
            if(cntA == cntB){
                answer++;
                cntA = 0;
                cntB = 0;
            }
            
            if(cntA == 0 && cntB == 0){
                x = c;
            }
            
            if(c == x){
                cntA++;
            } else {
                cntB++;
            }
        }
        
        return answer;
    }
}