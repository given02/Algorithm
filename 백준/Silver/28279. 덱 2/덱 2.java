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
                    System.out.println(deque.isEmpty() ? -1 : deque.pollFirst());
                    break;
                case '4':
                    System.out.println(deque.isEmpty() ? -1 : deque.pollLast());
                    break;
                case '5':
                    System.out.println(deque.size());
                    break;
                case '6':
                    System.out.println(deque.isEmpty() ? 1 : 0);
                    break;
                case '7':
                    System.out.println(deque.isEmpty() ? -1 : deque.peekFirst());
                    break;
                case '8':
                    System.out.println(deque.isEmpty() ? -1 : deque.peekLast());
                    break;
            }
        }
    }
}
