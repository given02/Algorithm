import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        int i = 0;
        while(i < ingredient.length){
            list.add(ingredient[i++]);
            if(list.size() >= 4){
                StringBuilder sb = new StringBuilder();
                sb.append(list.get(list.size() - 4));
                sb.append(list.get(list.size() - 3));
                sb.append(list.get(list.size() - 2));
                sb.append(list.get(list.size() - 1));
                if(sb.toString().equals("1231")){
                    list.remove(list.size() - 4);
                    list.remove(list.size() - 3);
                    list.remove(list.size() - 2);
                    list.remove(list.size() - 1);
                    answer++;
                }
            }
        }
        
        
        return answer;
    }
}