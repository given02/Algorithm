import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < N; i++){
            String str = st.nextToken();
            if(Integer.parseInt(str) < X){
                sb.append(" ");
                sb.append(str);
            }
        }

        bw.write(sb.toString().trim());
        bw.close();
    }

}

