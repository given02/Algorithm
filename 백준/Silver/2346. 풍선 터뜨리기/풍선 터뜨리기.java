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

        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        int[] arr = new int[N+1];
        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            deque.add(i);
        }

        int idx = deque.pollFirst(), move;
        bw.write(idx + " ");
        while (!deque.isEmpty()) {
            move = arr[idx];
            for (int i = 0; i < Math.abs(move)-1; i++) {
                if (move > 0) {
                    deque.addLast(deque.pollFirst());
                } else {
                    deque.addFirst(deque.pollLast());
                }
            }

            if (move > 0) {
                idx = deque.pollFirst();
            } else {
                idx = deque.pollLast();
            }

            bw.write(idx + " ");
        }

        bw.flush();
    }

}
