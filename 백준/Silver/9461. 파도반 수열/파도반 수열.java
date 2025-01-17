import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long[] D = new long[101];
        D[1] = D[2] = D[3] = 1;
        for(int i = 4; i < D.length; i++){
            D[i] = D[i-3] + D[i-2];
        }

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            bw.write(D[N] + "\n");
        }

        bw.close();
        br.close();
    }

}