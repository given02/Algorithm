import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static int[][] arr;
    private static Integer[][] D;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        D = new Integer[N][W+1];
        arr = new int[N][2];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // 무게
            arr[i][1] = Integer.parseInt(st.nextToken()); // 값어치
        }

        System.out.println(LCS(N-1, W) + "\n");
    }

    public static int LCS(int i, int w) {
        if(i < 0){
            return 0;
        }

        if(D[i][w] == null){
            if(arr[i][0] > w){
                D[i][w] = LCS(i-1, w);
            } else {
                D[i][w] = Math.max(LCS(i-1, w), LCS(i-1, w-arr[i][0]) + arr[i][1]);
            }
        }

        return D[i][w];
    }

}
