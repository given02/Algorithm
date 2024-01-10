import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        int[] left = {3, 0};
        int[] right = {3, 2};
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < numbers.length; i++){
            int num = numbers[i];
            int row = num == 0 ? 3 : num / 3;
            int col = num == 0 ? 1 : (num - 1) % 3;
            if(num == 1 || num == 4 || num == 7){
                sb.append("L");
                left[0] = row;
                left[1] = col;
            } else if(num == 3 || num == 6 || num == 9){
                sb.append("R");
                right[0] = row - 1;
                right[1] = col;
            } else {
                int leftcnt = Math.abs(row - left[0]) + Math.abs(col - left[1]);
                int rightcnt = Math.abs(row - right[0]) + Math.abs(col - right[1]);
                if(leftcnt < rightcnt){
                    sb.append("L");
                    left[0] = row;
                    left[1] = col;
                } else if(leftcnt > rightcnt){
                    sb.append("R");
                    right[0] = row;
                    right[1] = col;
                } else if(hand.equals("left")){
                    sb.append("L");
                    left[0] = row;
                    left[1] = col;
                } else {
                    sb.append("R");
                    right[0] = row;
                    right[1] = col;
                }
            }
        }
        
        return sb.toString();
    }
}