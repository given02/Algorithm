class Solution {
    public String solution(int a, int b) {
        String[] dayStr = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int totalDays = 0;
        for(int i = 0; i < a; i ++){
            totalDays += i == a - 1 ? b : days[i];
        }
        
        return dayStr[(totalDays - 1) % 7];
    }
}