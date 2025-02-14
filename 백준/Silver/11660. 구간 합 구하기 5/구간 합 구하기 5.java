import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] S = new int[N+1][N+1];
        for(int i = 1; i < N+1; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j < N+1; j++){
                S[i][j] = S[i][j-1] + Integer.parseInt(st.nextToken());
            }
        }

        int[][] idx = new int[M][4];
        for(int i = 0 ; i < M; i++){
            st = new StringTokenizer(br.readLine());
            idx[i][0] = Integer.parseInt(st.nextToken()); // x1
            idx[i][1] = Integer.parseInt(st.nextToken()); // y1
            idx[i][2] = Integer.parseInt(st.nextToken()); // x2
            idx[i][3] = Integer.parseInt(st.nextToken()); // y2
        }

        int answer;
        for(int i = 0; i < M; i++){
            answer = 0;

            int x1 = idx[i][0];
            int y1 = idx[i][1];
            int x2 = idx[i][2];
            int y2 = idx[i][3];
            for(int x = x1; x <= x2; x++){
                answer += S[x][y2];
                answer -= S[x][y1-1];
            }

            System.out.println(answer);
        }

    }
}
