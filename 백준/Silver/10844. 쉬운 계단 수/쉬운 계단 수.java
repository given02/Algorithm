import java.io.*;

public class Main {

    private static Long[][] dp;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new Long[N+1][10];
        for(int i = 0; i < 10; i++){
            dp[1][i] = 1L;
        }

        long answer = 0;
        for(int i = 1; i < 10; i++){
            answer += dp(N, i);
        }

        System.out.println(answer % 1000000000 + "\n");
    }

    public static long dp(int digit, int n) {
        if(digit == 1){
            return dp[digit][n];
        }

        if(n == 0){
            dp[digit][n] =  dp(digit-1, n+1);
        }

        if(n == 9){
            dp[digit][n] =  dp(digit-1, n-1);
        }

        if(dp[digit][n] == null){
            dp[digit][n] = dp(digit-1, n+1) + dp(digit-1, n-1);
        }

        return dp[digit][n] % 1000000000;
    }
}
