class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String[] answer = new String[goal.length];
        int idx1 = 0, idx2 = 0;
        
        for(int i = 0; i < goal.length; i++){
            if(cards1.length > idx1 && goal[i].equals(cards1[idx1])){
                answer[i] = cards1[idx1++];
            } else if(cards2.length > idx2 && goal[i].equals(cards2[idx2])){
                answer[i] = cards2[idx2++];
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}