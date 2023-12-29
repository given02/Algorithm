import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
		PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>((o1, o2) -> o2 - o1);
        
        for(String op : operations){
            String[] arr = op.split(" ");
            switch(arr[0]){
                case "I":
                    min.add(Integer.parseInt(arr[1]));
                    max.add(Integer.parseInt(arr[1]));
                    break;
                case "D":
                    if(max.isEmpty()) break;
                    if(arr[1].equals("1")){
                        int del = max.poll();
                        min.remove(del);
                    } else if(arr[1].equals("-1")){
                        int del = min.poll();
                        max.remove(del);
                    }
                    break;
            }
        }
        
        if(max.isEmpty())
            return new int[] {0, 0};

        return new int[] {max.peek(), min.peek()};
    }
}