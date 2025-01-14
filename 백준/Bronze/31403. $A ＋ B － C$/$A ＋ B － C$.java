import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        String A = st.nextToken();

        st = new StringTokenizer(br.readLine());
        String B = st.nextToken();

        st = new StringTokenizer(br.readLine());
        String C = st.nextToken();

        int answer1 = Integer.parseInt(A) + Integer.parseInt(B) - Integer.parseInt(C);
        int answer2 = Integer.parseInt(A + B) - Integer.parseInt(C);

        bw.write(answer1 + "\n"+ answer2);
        bw.close();
    }

}

