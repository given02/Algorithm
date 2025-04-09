import java.io.*;

import java.io.IOException;

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

    public static long recursive(int i){ //3
        if(i <= 1){
            return i;
        }
        return recursive(i-1) + recursive(i-2);
    }

}