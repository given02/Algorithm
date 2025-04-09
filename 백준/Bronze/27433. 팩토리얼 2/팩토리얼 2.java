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
        long answer = recursive(N);
        System.out.println(answer);
    }

    public static long recursive(int i){
        if(i <= 1){
            return 1;
        }
        return i * recursive(i-1);
    }


}