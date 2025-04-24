import java.io.*;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    static int[] arr;
    static int N, M;
    static StringBuilder sb = new StringBuilder();

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        DFS(0);

        System.out.println(sb);
    }

    public static void DFS(int depth){
        if(depth == M){
            for(int val : arr){
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i < N; i++){
            arr[depth] = i+1;
            DFS(depth + 1);
        }
    }
}