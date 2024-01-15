class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int num = n+1;
        while(answer == 0){
            int a = Integer.bitCount(n);
            int b = Integer.bitCount(num);
            if(a == b) answer = num;
            num++;
        }
        
        return answer;
    }
}