import java.io.*;

public class Main {

    private static Integer[] D;
    private static int N;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        D = new Integer[N+1];
        D[0] = 0;
        D[1] = 0;
        if(N >= 2) D[2] = 1;
        if(N >= 3) D[3] = 1;

        int answer = dp(N);

        System.out.println(answer + "\n");
    }

    public static int dp(int n) {
        if(D[n] != null){
            return D[n];
        }

        int min = n;

        if(n % 3 == 0){
            min = Math.min(min, dp(n / 3) + 1);
        }

        if(n % 2 == 0){
            min = Math.min(min, dp(n / 2) + 1);
        }

        D[n] = Math.min(min, dp(n - 1) + 1);

        return D[n];
    }

}
