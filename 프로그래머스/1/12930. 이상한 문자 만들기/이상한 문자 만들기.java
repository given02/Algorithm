class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        
        for(char c : s.toCharArray()){
            sb.append(cnt % 2 == 0 ? Character.toUpperCase(c) : Character.toLowerCase(c));
            cnt = c == ' ' ? 0 : cnt + 1;
        }
        
        return sb.toString();
    }
}