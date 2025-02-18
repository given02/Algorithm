import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int start = 0;
        int end = N-1;
        int min = Integer.MAX_VALUE;
        int[] answer = new int[2];
        int sum;
        while(start < end){
            sum = arr[start] + arr[end];
            if (min > Math.abs(sum)) {
                min = Math.abs(sum);
                answer[0] = start;
                answer[1] = end;
                if(sum == 0) break;
            }

            if (sum < 0) {
                start++;
            } else {
                end--;
            }
        }

        System.out.println(arr[answer[0]] + " " + arr[answer[1]]);
    }

}
