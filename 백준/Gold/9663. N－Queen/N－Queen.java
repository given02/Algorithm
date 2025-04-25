import java.io.*;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    static int N;
    static int cnt = 0;
    static boolean[] colVisited;
    static boolean[] diag1Visited;
    static boolean[] diag2Visited;

    public static void solution() throws IOException {
        Scanner s = new Scanner(System.in);

        N = s.nextInt();
        colVisited = new boolean[N];
        diag1Visited = new boolean[2*N];
        diag2Visited = new boolean[2*N];

        DFS(0);

        System.out.println(cnt);
    }

    public static void DFS(int row){
        if(row == N){
            cnt++;
            return;
        }

        for(int col = 0; col < N; col++){
            int diag1 = row + col;
            int diag2 = row - col + N -1;
            if(colVisited[col] || diag1Visited[diag1] || diag2Visited[diag2]) continue;

            colVisited[col] = diag1Visited[diag1] = diag2Visited[diag2] = true;
            DFS(row+1);
            colVisited[col] = diag1Visited[diag1] = diag2Visited[diag2] = false;
        }
    }

}