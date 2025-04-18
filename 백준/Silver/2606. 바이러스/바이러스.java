import java.io.*;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    static List<List<Integer>> list;
    static boolean[] visited;
    static int cnt;

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        visited = new boolean[N+1];
        list = new ArrayList<>();
        for (int i = 0; i <= N; i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < K; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }

        cnt = 0;
        BFS(1);

        System.out.println(cnt);
    }

    public static void BFS(int n){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        visited[n] = true;

        while(!queue.isEmpty()){
            int temp = queue.poll();
            for(int next : list.get(temp)){
                if(!visited[next]){
                    visited[next] = true;
                    cnt++;
                    queue.add(next);
                }
            }
        }
    }

}