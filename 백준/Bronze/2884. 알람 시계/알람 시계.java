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
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if(B-45 >= 0){
            B -= 45;
        } else {
            B = 60 + (B - 45);
            A--;
        }

        if(A < 0) {
            A = 24 + A;
        }

        bw.write(A + " " + B);
        bw.close();
    }

}

