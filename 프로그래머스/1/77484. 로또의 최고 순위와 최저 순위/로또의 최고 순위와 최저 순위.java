import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : win_nums){
            set.add(num);
        }
        
        int hit = 0;
        int invisible = 0;
        for(int num : lottos){
            if(num == 0)
                invisible++;
            else if(set.contains(num))
                hit++;
        }
        
        return new int[]{Math.min(7 - hit - invisible, 6), Math.min(7 - hit, 6)};
    }
}