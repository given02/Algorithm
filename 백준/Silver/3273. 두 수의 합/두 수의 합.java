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

        int X = Integer.parseInt(br.readLine());
        int start = 0;
        int end = N-1;
        int count = 0;
        int sum;
        while(start < end){
            sum = arr[start] + arr[end];
            if(sum == X){
                count++;
                start++;
                end--;
            } else if(sum < X) {
                start++;
            } else {
                end--;
            }
        }

        System.out.println(count);
    }

}
