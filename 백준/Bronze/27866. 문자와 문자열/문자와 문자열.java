import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String str = st.nextToken();
        st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        bw.write(str.substring(N-1, N));

        bw.close();

    }

}

