import java.util.*;
class Solution {
    public Integer[] solution(int[] arr) {
        if(arr.length == 1){
            return new Integer[]{-1};
        } 
        
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            min = min < arr[i] ? min : arr[i];
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != min){
                list.add(arr[i]);
            }
        }
        
        return list.toArray(new Integer[list.size()]);
    }
}