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
        String[] arr = st.nextToken().split("");
        int answer = 0;
        for(int i = 0; i < N; i++){
            answer += Integer.parseInt(arr[i]);
        }

        bw.write(Integer.toString(answer));
        bw.close();
    }

}

