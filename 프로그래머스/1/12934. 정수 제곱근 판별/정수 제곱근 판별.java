import java.lang.Math;

class Solution {
    public long solution(long n) {
        if(Math.sqrt(n) % Math.floor(Math.sqrt(n)) == 0) {
            long answer = (long) (Math.sqrt(n) + 1);
            return answer * answer;
        } else return -1;
    }
}