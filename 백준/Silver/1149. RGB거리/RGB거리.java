import java.io.*;
import java.util.Scanner;

public class Main {

    private static int[][] arr;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        arr = new int[N][3];
        long[] prev = new long[3];
        long[] curr = new long[3];

        for (int i = 0; i < N; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
            arr[i][2] = in.nextInt();
        }

        prev[0] = arr[0][0];
        prev[1] = arr[0][1];
        prev[2] = arr[0][2];

        for (int i = 1; i < N; i++) {
            curr[0] = arr[i][0] + Math.min(prev[1], prev[2]);
            curr[1] = arr[i][1] + Math.min(prev[0], prev[2]);
            curr[2] = arr[i][2] + Math.min(prev[0], prev[1]);

            prev[0] = curr[0];
            prev[1] = curr[1];
            prev[2] = curr[2];
        }

        long min = Math.min(prev[0], Math.min(prev[1], prev[2]));
        System.out.println(min);
    }

}
