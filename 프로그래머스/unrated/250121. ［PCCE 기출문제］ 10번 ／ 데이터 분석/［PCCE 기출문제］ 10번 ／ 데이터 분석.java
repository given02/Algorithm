import java.util.*;
class Solution {
    public ArrayList<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        int extNum = convertNum(ext);
        int sortNum = convertNum(sort_by);
        ArrayList<int[]> list = new ArrayList<>();
        
        for(int i = 0; i < data.length; i++){
            if(data[i][extNum] < val_ext){
                list.add(data[i]);
            }
        }
        
        Collections.sort(list, new Comparator<int[]>(){
            public int compare(int[] arr1, int[] arr2){
                return Integer.compare(arr1[sortNum], arr2[sortNum]);
            }
        });
        
        return list;
    }
    
    public int convertNum(String str){
        switch(str){
            case "code":
                return 0;
            case "date":
                return 1;
            case "maximum":
                return 2;
            case "remain":
                return 3;
            default:
                return -1;
        }
    }
}