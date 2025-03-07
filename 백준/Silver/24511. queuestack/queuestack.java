import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] listQueuestack = new int[N];
        for (int i = 0; i < N; i++) {
            listQueuestack[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] currentList = new int[N];
        for (int i = 0; i < N; i++) {
            currentList[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] insertList = new int[M];
        for (int i = 0; i < M; i++) {
            insertList[i] = Integer.parseInt(st.nextToken());
        }

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            if (listQueuestack[i] == 0) {
                queue.addFirst(currentList[i]);
            }
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < M; i++) {
            queue.add(insertList[i]);
            answer.append((queue.pollFirst() + " "));
        }

        System.out.println(answer);
    }

}
