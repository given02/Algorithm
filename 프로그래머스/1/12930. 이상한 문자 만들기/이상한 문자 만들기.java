class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            
            if(cnt % 2 == 0){
                sb.append(Character.toUpperCase(s.charAt(i)));
            } else {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
            
            if(s.charAt(i) == ' '){
                cnt = 0;
            } else {
                cnt++;
            }
            
        }
        
        return sb.toString();
    }
}