import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder("<");
        while(!queue.isEmpty()){
            for(int i = 0; i < K-1; i++){
                queue.add(queue.poll());
            }
            if(!sb.toString().equals("<")){
                sb.append(", ");
            }
            sb.append(queue.poll());
        }
        sb.append(">");


        System.out.println(sb);
    }

}
