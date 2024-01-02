class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(s.indexOf(c) == i){
                answer[i] = -1;
            } else {
                answer[i] = i - s.substring(0, i).lastIndexOf(c);
            }
        }
        
        return answer;
    }
}