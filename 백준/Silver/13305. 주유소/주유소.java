import java.io.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] length = br.readLine().split(" ");
        String[] price = br.readLine().split(" ");

        long answer = 0;
        long min_price = Integer.MAX_VALUE;
        for(int i = 0; i < N-1; i++){
            min_price = Math.min(min_price, Integer.parseInt(price[i]));
            answer += min_price * Integer.parseInt(length[i]);
        }

        System.out.println(answer);
    }

}