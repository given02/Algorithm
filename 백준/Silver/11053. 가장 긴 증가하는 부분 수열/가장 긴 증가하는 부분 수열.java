import java.io.*;
import java.util.*;

public class Main {

    private static int[] arr;
    private static Integer[] D;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        D = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine());;
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++){
            dp(i);
        }

        int max = D[0];
        for(int i = 1; i < N; i++){
            max = Math.max(max, D[i]);
        }

        System.out.println(max + "\n");
    }

    public static int dp(int n) {
        if(D[n] == null){
            D[n] = 1;
            for(int i = n-1; i >= 0; i--){
                if(arr[n] > arr[i]){
                    D[n] = Math.max(D[n], dp(i) + 1);
                }
            }
        }

        return D[n];
    }

}

