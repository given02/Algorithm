import java.io.*;
import java.util.Scanner;

public class Main {

    private static int[] arr;
    private static Integer[] D;
    private static int max;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }

        D = new Integer[N];
        D[0] = arr[0];
        max = arr[0];

        dp(N-1);

        System.out.println(max);
    }

    public static int dp(int n){
        if(D[n] == null){
            D[n] = Math.max(arr[n], arr[n] + dp(n-1));
            max = Math.max(max, D[n]);
        }
        return D[n];
    }

}