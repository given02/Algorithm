import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int X = Integer.parseInt(bf.readLine());
        int Y = Integer.parseInt(bf.readLine());
        int answer = (X > 0) ? ((Y > 0) ? 1 : 4) : ((Y > 0) ? 2 : 3);

        bw.write(String.valueOf(answer));
        bw.close();
    }

}

