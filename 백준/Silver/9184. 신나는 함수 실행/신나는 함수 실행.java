import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int[][][] D = new int[101][101][101];

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int A, B, C;

        while(true){
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            if(A == -1 && B == -1 && C == -1) break;

            bw.write("w("+A+", "+B+", "+C+") = " + dp(A, B, C) + "\n");
        }

        bw.close();
    }

    public static int dp(int a, int b, int c){
        if(a <= 0 || b <= 0 || c <=0){
            return 1;
        }
        if(a > 20 || b > 20 || c > 20){
            return dp(20,20,20);
        }
        if(D[a][b][c] > 0){
            return D[a][b][c];
        }
        if(a < b && b < c) {
            D[a][b][c] = dp(a, b, c-1) + dp(a, b-1, c-1) - dp(a, b-1, c);
            return D[a][b][c];
        }
        D[a][b][c] = dp(a-1, b, c) + dp(a-1, b-1, c) + dp(a-1, b, c-1) - dp(a-1, b-1, c-1);
        return D[a][b][c];
    }
}