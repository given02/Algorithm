import java.io.*;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    private static List<List<Integer>> list;
    private static boolean[] visited;

    static StringBuilder sb1 = new StringBuilder();
    static StringBuilder sb2 = new StringBuilder();

    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        list = new ArrayList<>();
        for(int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.get(x).add(y);
            list.get(y).add(x);
        }

        for(int i = 1; i <= N; i++) {
            Collections.sort(list.get(i));
        }

        visited = new boolean[N+1];
        DFS(V);

        visited = new boolean[N+1];
        BFS(V);

        System.out.println(sb1);
        System.out.println(sb2);
    }

    private static void DFS(int v) {
        visited[v] = true;
        sb1.append(v).append(" ");

        for (int next : list.get(v)) {
            if (!visited[next]) {
                DFS(next);
            }
        }
    }

    private static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visited[v] = true;
        sb2.append(v);

        while(!queue.isEmpty()) {
            int point = queue.poll();
            for (int next : list.get(point)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                    sb2.append(" ").append(next);
                }
            }
        }
    }

}