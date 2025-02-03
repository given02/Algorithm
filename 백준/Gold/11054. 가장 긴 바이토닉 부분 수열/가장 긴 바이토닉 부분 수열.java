import java.io.*;
import java.util.*;

public class Main {

    private static int N;
    private static int[] arr;
    private static Integer[] R;
    private static Integer[] L;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        R = new Integer[N];
        L = new Integer[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());;
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++){
            findR(i);
            findL(i);
        }

        int max = 0;
        for(int i = 0; i < N; i++){
            max = Math.max(max, R[i] + L[i] - 1);
        }

        System.out.println(max + "\n");
    }

    public static int findR(int n) {
        if(R[n] == null){
            R[n] = 1;
            for(int i = n+1; i < N; i++){
                if(arr[n] > arr[i]) {
                    R[n] = Math.max(R[n], findR(i) + 1);
                }
            }
        }

        return R[n];
    }

    public static int findL(int n) {
        if(L[n] == null){
            L[n] = 1;
            for(int i = n-1; i >= 0; i--){
                if(arr[n] > arr[i]){
                    L[n] = Math.max(L[n], findL(i) + 1);
                }
            }
        }

        return L[n];
    }

}
