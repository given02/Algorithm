import java.io.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            int[][] D = new int[N+1][2];
            D[0][0] = 1;
            D[0][1] = 0;
            if(N >= 1){
                D[1][0] = 0;
                D[1][1] = 1;
            }
            for(int n = 2; n <= N; n++){
                D[n][0] = D[n -1][0] + D[n -2][0];
                D[n][1] = D[n -1][1] + D[n -2][1];
            }
            bw.write(D[N][0] + " " + D[N][1] + "\n");
        }
        bw.close();
    }

}