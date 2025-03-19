import java.io.*;
import java.util.*;

public class Main {

    private static ArrayList<ArrayList<Integer>> arr;
    private static boolean[] visited;
    private static int N, M, R;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        arr = new ArrayList<>();

        for(int i = 0; i < N+1; i++){
            arr.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            arr.get(s).add(e);
            arr.get(e).add(s);
        }

        for (ArrayList<Integer> i : arr) {
            Collections.sort(i);
        }

        BFS(R);
    }

    public static void BFS (int r){
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        int[] result = new int[N+1];
        queue.add(r);
        visited[r] = true;
        result[r] = ++count;

        while(!queue.isEmpty()){
            int now = queue.poll();

            for(int i = 0 ; i< arr.get(now).size();i++){
                int next = arr.get(now).get(i);
                if(!visited[next]){
                    queue.add(next);
                    visited[next] = true;
                    result[next] = ++count;
                }
            }
        }

        for(int i=1; i<result.length; i++) {
            System.out.println(result[i]);
        }

    }

}