import java.io.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int seq = 1;
        int target = 666;
        while(seq != N){
            target++;
            if(String.valueOf(target).contains("666")) {
                seq++;
            }
        }

        System.out.println(target);
    }
}