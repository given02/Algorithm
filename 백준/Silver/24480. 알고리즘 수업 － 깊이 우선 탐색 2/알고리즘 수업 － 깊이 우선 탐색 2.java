import java.io.*;
import java.util.*;

public class Main {

    private static ArrayList<Integer>[] arr;
    private static int[] visited;
    private static int cnt;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        visited = new int[N+1];
        arr = new ArrayList[N+1];

        for(int i = 0; i < N+1; i++){
            arr[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr[s].add(e);
            arr[e].add(s);
        }

        for (ArrayList<Integer> integers : arr) {
            Collections.sort(integers, (o1, o2) -> o2 - o1);
        }

        cnt = 1;
        DFS(R);

        for(int i = 1; i < visited.length; i++){
            System.out.println(visited[i]);
        }
    }

    public static void DFS(int v){
        visited[v] = cnt;

        for(int i = 0; i < arr[v].size(); i++){
            int newV = arr[v].get(i);
            if(visited[newV] == 0){
                cnt++;
                DFS(newV);
            }
        }
    }
}
