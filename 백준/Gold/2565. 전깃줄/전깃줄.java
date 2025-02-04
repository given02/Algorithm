import java.io.*;
import java.util.*;

public class Main {

    private static int N;
    private static int[][] arr;
    private static Integer[] D;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        arr = new int[N][2];
        D = new Integer[N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> o1[0] - o2[0]);

        int max = 0;
        for(int i = 0; i < N; i++){
            max = Math.max(max, find(i));
        }

        System.out.println(N - max + "\n");
    }

    public static int find(int n) {
        if(D[n] == null){
            D[n] = 1;
            for(int i = n+1; i < N; i++){
                if(arr[n][1] < arr[i][1]){
                    D[n] = Math.max(D[n], find(i) + 1);
                }
            }
        }

        return D[n];
    }

}
