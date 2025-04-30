import java.io.*;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    static int N, min = Integer.MAX_VALUE;
    static int[][] map;
    static boolean[] visited;

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        combi(0,0);

        System.out.println(min);
    }

    public static void combi(int idx, int count) {
        if(count == N/2){
            diff();
            return;
        }

        for(int i = idx; i < N; i++){
            if(!visited[i]){
                visited[i] = true;
                combi(i+1, count+1);
                visited[i] = false;
            }
        }
    }

    public static void diff() {
        int start = 0;
        int link = 0;

        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                if(visited[i] && visited[j]) {
                    start += map[i][j] + map[j][i];
                } else if(!visited[i] && !visited[j]) {
                    link += map[i][j] + map[j][i];
                }
            }
        }

        int result = Math.abs(start - link);
        if(result == 0){
            System.out.println(result);
            System.exit(0);
        }

        min = Math.min(min, result);
    }

}