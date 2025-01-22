import java.io.*;
import java.util.Arrays;

public class Main {

    private static int[] arr;
    private static Integer[] D;
    private static int N;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        D = new Integer[N+1];
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        D[0] = arr[0];
        D[1] = arr[1];
        if(N >= 2){
            D[2] = arr[1] + arr[2];
        }

        int answer = dp(N);

        System.out.println(answer + "\n");
    }

    public static int dp(int n) {
        if(D[n] == null){
            D[n] = arr[n] + Math.max(dp(n-2), dp(n-3) + arr[n-1]);
        }

        return D[n];
    }

}
