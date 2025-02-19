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
        int S = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N+1];
        for(int i = 1; i < N+1; i++){
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }

        int start = 1;
        int end = 1;
        int answer = Integer.MAX_VALUE;
        int sum;
        while(end < N+1){
            sum = arr[end] - arr[start-1];
            if(sum >= S){
                answer = Math.min(answer, end - start + 1);
                start++;
            } else {
                end++;
            }
        }

        System.out.println(answer == Integer.MAX_VALUE ? 0 : answer);
    }
}
