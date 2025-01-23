import java.io.*;

public class Main {

    private static Integer[] D;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        D = new Integer[N+1];
        arr = new int[N+1];
        for (int i = 1; i < N+1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        D[0] = 0;
        D[1] = arr[1];
        if(N >= 2){
            D[2] = arr[2] + arr[1];
        }

        int answer = dp(N);

        System.out.println(answer + "\n");
    }

    public static int dp(int n) {
        if(D[n] == null){
            D[n] = Math.max(Math.max(dp(n-2), dp(n-3) + arr[n-1]) + arr[n], dp(n-1));
        }

        return D[n];
    }

}
