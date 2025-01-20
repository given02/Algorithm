import java.io.*;
import java.util.Scanner;

public class Main {

    private static int[][] arr;
    private static Long[][] D;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        arr = new int[N][3];
        D = new Long[N][3];

        for(int i = 0; i < N; i++){
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
            arr[i][2] = in.nextInt();
        }

        long min = Long.MAX_VALUE;
        for(int i = 0; i < 3; i++){
            min = Math.min(dp(N-1, i), min);
        }

        System.out.println(min + "\n");
    }

    public static long dp(int n, int color){
        // color 0 = R, 1  = G, 2 = B
        long A = 0, B = 0;

        if(n == 0){
            return arr[n][color];
        }

        if(D[n][color] != null){
            return D[n][color];
        }

        switch (color){
            case 0:
                A = arr[n][color] + dp(n-1, 1);
                B = arr[n][color] + dp(n-1, 2);
                break;
            case 1:
                A = arr[n][color] + dp(n-1, 0);
                B = arr[n][color] + dp(n-1, 2);
                break;
            case 2:
                A = arr[n][color] + dp(n-1, 0);
                B = arr[n][color] + dp(n-1, 1);
                break;
        }

        D[n][color] = Math.min(A,B);

        return D[n][color];
    }

}