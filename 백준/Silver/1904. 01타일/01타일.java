import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        if(N == 1){
            bw.write(1 + "\n");
        } else {
            long[] D = new long[N+1];

            D[1] = 1;
            D[2] = 2;

            for (int i = 3; i <= N; i++) {
                D[i] = (D[i - 1] + D[i - 2]) % 15746;
            }

            bw.write( D[N] + "\n");
        }

        bw.close();
        br.close();
    }

}