class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        // 체력 감소
        // ㄴ체력이 0 이하가 되면 캐릭터 사망 
        // ㄴ사망하면 -1 반환
        // ㄴ공격 당하면 정해진 피해량 만큼 체력 감소
        // ㄴ공격 당하는 순간 기술이 중지되며 체력 회복 못함
        // ㄴ공격 당하는 순간 기술을 다시 사용하며 0으로 시작
        
        // 체력 회복
        // ㄴ최대 체력 이상 회복 안됨
        // ㄴ마지막 공격을 받았을 때까지 사망하지 않고 생존하면 남은 체력 반환
        // ㄴ공격 받지 않는 턴에는 회복
        // ㄴt초 동안 x만큼 회복
        // ㄴt초 연속 회복하면 y만큼 추가 회복
        
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