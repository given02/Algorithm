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
        long[] arr = new long[N+1];
        long[] cnt = new long[M];
        long answer = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            arr[i] = (arr[i-1] + Integer.parseInt(st.nextToken())) % M;
            cnt[(int) arr[i]]++;
            if(arr[i] == 0){
                answer++;
            }
        }

        for(int i = 0; i < M; i++){
            if(cnt[i] > 1){
                answer += (cnt[i] * (cnt[i]-1) / 2);
            }
        }
        System.out.println(answer);
    }

}
