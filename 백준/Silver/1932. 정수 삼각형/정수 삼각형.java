import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private static int[][] arr;
    private static Integer[][] D;
    private static int N;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        D = new Integer[N][N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j <= i; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < N; i++){
            D[N-1][i] = arr[N-1][i];
        }

        int answer = dp(0, 0);

        System.out.println(answer + "\n");
    }

    public static int dp(int x, int y) {
        if(x == N-1){
            return D[x][y];
        }

        if(D[x][y] == null){
            D[x][y] = arr[x][y] + Math.max(dp(x+1, y), dp(x+1, y+1));
        }

        return D[x][y];
    }

}
