import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String ops = st.nextToken();
            switch (ops){
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(queue.isEmpty()){
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(queue.poll() + "\n");
                    }
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    if(queue.isEmpty()){
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    break;
                case "front":
                    if(queue.isEmpty()){
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(queue.peekFirst() + "\n");
                    }
                    break;
                case "back":
                    if(queue.isEmpty()){
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(queue.peekLast() + "\n");
                    }
                    break;
            }
        }

        bw.close();
    }

}