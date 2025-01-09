import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int max = Integer.parseInt(st.nextToken());
        int min = max;
        int X;
        for(int i = 0; i < N-1; i++){
            X = Integer.parseInt(st.nextToken());
            max = Math.max(max, X);
            min = Math.min(min, X);
        }

        bw.write(min+" "+max);
        bw.close();
    }

}

