import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        int width = 0;
        int height = 0;
        
        for(int i = 3; i <= Math.sqrt(sum); i++){ // 가로 세로 길이는 최소 3이상
            if(sum % i == 0) {
                width = sum / i;
                height = i;
                
                if ((width-2) * (height-2) == yellow) { // 양쪽, 위아래 각각 한칸씩 총 두칸을 빼면 yellow 갯수가 나온다
                    return new int[] {width, height};
                }
            }
        }
        
        return new int[] {width, height};
    }
}