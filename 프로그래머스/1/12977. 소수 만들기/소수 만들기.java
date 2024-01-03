class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    int check = 0;
                    for(int l = 2; l < sum; l++){
                        if(sum % l == 0){
                            check = 1;
                        }
                    }
                    if(check == 0){
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}