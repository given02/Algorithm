class Solution {
    
    public static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        
        DFS(numbers, target, 0, 0);
        
        return answer;
    }
    
    public void DFS(int[] numbers, int target, int sum, int idx){
        if(idx == numbers.length && sum == target){
            answer++;
            return;
        }
        
        if(idx >= numbers.length){
            return;
        }
        
        DFS(numbers, target, sum + numbers[idx], idx+1);
        DFS(numbers, target, sum - numbers[idx], idx+1);
        
    }
    
}