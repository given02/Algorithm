import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String[] arr = new String[N];
        for(int i = 0; i < N; i++){
            arr[i] = br.readLine();
        }

        Deque<String> deque = new LinkedList<>();
        for(int i = 0; i < N; i++){
            switch (arr[i].charAt(0)){
                case '1':
                    deque.addFirst(arr[i].substring(2));
                    break;
                case '2':
                    deque.addLast(arr[i].substring(2));
                    break;
                case '3':
                    bw.write((deque.isEmpty() ? -1 : deque.pollFirst()) + "\n");
                    break;
                case '4':
                    bw.write((deque.isEmpty() ? -1 : deque.pollLast()) + "\n");
                    break;
                case '5':
                    bw.write((deque.size()) + "\n");
                    break;
                case '6':
                    bw.write((deque.isEmpty() ? 1 : 0) + "\n");
                    break;
                case '7':
                    bw.write((deque.isEmpty() ? -1 : deque.peekFirst()) + "\n");
                    break;
                case '8':
                    bw.write((deque.isEmpty() ? -1 : deque.peekLast()) + "\n");
                    break;
            }
        }
        bw.close();
    }
}
