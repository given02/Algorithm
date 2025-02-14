import java.io.*;
import java.util.*;

public class Main {

    private static boolean[][] arr;
    private static int min = 64;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < M; j++){
                arr[i][j] = str.charAt(j) == 'W';
            }
        }

        for(int i = 0; i < N-7; i++){
            for(int j = 0; j < M-7; j++){
                find(i,j);
            }
        }
        System.out.println(min);
    }

    public static void find(int x, int y) {
        int count = 0;
        boolean flag = arr[x][y];

        for(int i = x; i < x+8; i++){
            for(int j = y; j < y+8; j++){
                if(arr[i][j] != flag){
                    count++;
                }
                flag = !flag;
            }
            flag = !flag;
        }

        count = Math.min(count, 64-count);

        min = Math.min(min, count);
    }
}
