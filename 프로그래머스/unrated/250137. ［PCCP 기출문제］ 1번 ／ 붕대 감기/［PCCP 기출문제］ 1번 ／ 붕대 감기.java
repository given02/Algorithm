class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int currentTime = 1;
        int bandageTime = 1;
        int attackCnt = 0;
        
        while(currentTime <= attacks[attacks.length - 1][0]){
            if(attackCnt < attacks.length && currentTime == attacks[attackCnt][0]){
                answer -= attacks[attackCnt++][1];
                if(answer <= 0) return -1;
                bandageTime = 0;
            } else {
                bandageTime++;
                if(bandageTime == bandage[0]){
                    answer = Math.min(answer+bandage[1]+bandage[2], health);
                    bandageTime = 0;
                } else {
                    answer = Math.min(answer+bandage[1], health);
                }
            }
            currentTime++;
        }
        
        return answer;
    }
}