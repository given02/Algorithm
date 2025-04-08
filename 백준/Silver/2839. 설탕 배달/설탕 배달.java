import java.io.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int answer = -1;
        to:
        for(int i = N/5; i >= 0; i--){
            for(int j = 0; j <= N/3; j++){
                if((5*i)+(3*j) == N) {
                    answer = i + j;
                    break to;
                }
            }
        }
        System.out.println(answer);
    }
}