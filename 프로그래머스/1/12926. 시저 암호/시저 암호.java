class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(c == ' '){
                sb.append(" ");
            } else if(c + n > 122 || (c + n > 90 && c <= 90)) {
                sb.append((char)(c + n + '0' - '0' - 26));
            } else {
                sb.append((char)(c + n + '0' - '0'));
            }
        }
        
        return sb.toString();
    }
}