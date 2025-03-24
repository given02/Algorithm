import java.io.*;
import java.util.*;

public class Main {

    private static int[] seconds = new int[100001];
    private static int N, K;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        System.out.println(BFS(N));
    }

    public static int BFS (int n){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        seconds[n] = 1;

        n = 0;
        while(!queue.isEmpty()){
            n = queue.poll();
            if(n == K){
                return seconds[n] - 1;
            }

            if (n - 1 >= 0 && seconds[n - 1] == 0) {
                seconds[n-1] = seconds[n] + 1;
                queue.add(n-1);
            }
            if (n + 1 <= 100000 && seconds[n + 1] == 0) {
                seconds[n+1] = seconds[n] + 1;
                queue.add(n+1);
            }
            if (n * 2 <= 100000 && seconds[n * 2] == 0) {
                seconds[n*2] = seconds[n] + 1;
                queue.add(n*2);
            }
        }

        return -1;
    }
}