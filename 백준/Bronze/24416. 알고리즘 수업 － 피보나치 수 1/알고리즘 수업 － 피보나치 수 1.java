import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        // recursive
        int recur = recursive(N);

        // dp
        int dp = dp(N);

        bw.write(recur + " " + dp);
        bw.close();
    }

    public static int recursive(int n) {
        if(n == 1 || n == 2){
            return 1;
        }
        return (recursive(n-1) + recursive(n-2));
    }

    public static int dp(int n) {
        int answer = 0;
        for (int i = 2; i < n; i++){
            answer++;
        }
        return answer;
    }
}