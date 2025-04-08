import java.io.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int money = Integer.parseInt(input[1]);

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for(int i = N-1; i >= 0; i--){
            if(arr[i] <= money){
                cnt += money / arr[i];
                money %= arr[i];
            }
        }

        System.out.println(cnt);
    }
}