import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        String[] command;
        for(int i = 0; i < N; i++){
            command = br.readLine().split(" ");
            switch (command[0]){
                case "push":
                    queue.add(Integer.valueOf(command[1]));
                    break;
                case "pop":
                    bw.write((queue.isEmpty() ? "-1" : queue.poll()) + "\n");
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    bw.write((queue.isEmpty() ? "1" : "0") + "\n");
                    break;
                case "front":
                    bw.write((queue.isEmpty() ? "-1" : queue.peek()) + "\n");
                    break;
                case "back":
                    bw.write((queue.isEmpty() ? "-1" : queue.peekLast()) + "\n");
                    break;
            }
        }
        bw.close();
    }

}
