import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder strA = new StringBuilder(st.nextToken());
        StringBuilder strB = new StringBuilder(st.nextToken());
        int A = Integer.parseInt(strA.reverse().toString());
        int B = Integer.parseInt(strB.reverse().toString());

        System.out.println(Math.max(A,B) + "\n");
    }

}
