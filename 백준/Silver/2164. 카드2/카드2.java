import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            queue.add(i);
        }

        int idx = 1;
        while(queue.size() > 1){
            if(idx % 2 == 0){
                queue.add(queue.poll());
            } else {
                queue.poll();
            }
            idx++;
        }

        System.out.println(queue.peek());
    }
}
