import java.io.*;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    static int N;
    static int[] nums;
    static int[] ops;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        nums = new int[N];
        for(int i = 0; i < N; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        ops = new int[4];
        for(int i = 0; i < 4; i++){
            ops[i] = Integer.parseInt(st.nextToken());
        }

        DFS(1, nums[0]);

        System.out.println(max);
        System.out.println(min);
    }

    public static void DFS(int idx, int result){
        if(idx == N){
            max = Math.max(max, result);
            min = Math.min(min, result);
            return;
        }

        for(int i = 0; i < 4; i++){
            if(ops[i] > 0){
                ops[i]--;
                if(i == 0){
                    DFS(idx+1, result + nums[idx]);
                } else if(i == 1){
                    DFS(idx+1, result - nums[idx]);
                } else if(i == 2){
                    DFS(idx+1, result * nums[idx]);
                } else {
                    DFS(idx+1, result / nums[idx]);
                }
                ops[i]++;
            }
        }
    }

}