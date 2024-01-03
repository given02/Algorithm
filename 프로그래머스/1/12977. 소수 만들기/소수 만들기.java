import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    list.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        
        for(Integer item : list){
            int check = 0;
            for(int i = 2; i < item; i++){
                if(item % i == 0){
                    check = 1;
                }
            }
            if(check == 0){
                answer++;
            }
        }
        
        return answer;
    }
}