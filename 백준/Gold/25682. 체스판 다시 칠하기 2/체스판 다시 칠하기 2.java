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
        int K = Integer.parseInt(st.nextToken());
        int min = K * K;
        int max = 0;
        boolean[][] arr = new boolean[N+1][M+1];

        for(int i = 1; i < N+1; i++){
            String str = br.readLine();
            for(int j = 1; j < M+1; j++){
                arr[i][j] = str.charAt(j-1) == 'W';
            }
        }

        boolean flag = arr[1][1];
        int[][] S = new int[N+1][M+1];
        for(int i = 1; i < N+1; i++){
            for(int j = 1; j < M+1; j++){
                S[i][j] = S[i-1][j] + S[i][j-1] - S[i-1][j-1] + (arr[i][j] != flag ? 1 : 0);
                flag = !flag;
            }
            if(M % 2 == 0){
                flag = !flag;
            }
        }

        int tmp;
        for(int i = K; i < N+1; i++){
            for(int j = K; j < M+1; j++){
                tmp = S[i][j] - (S[i-K][j] + S[i][j-K] - S[i-K][j-K]);
                min = Math.min(min, tmp);
                max = Math.max(max, tmp);
            }
        }

        System.out.println(Math.min(min, K*K-max));

    }

}
