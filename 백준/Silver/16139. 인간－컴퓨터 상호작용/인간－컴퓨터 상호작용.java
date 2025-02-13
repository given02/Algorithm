import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int N = Integer.parseInt(br.readLine());
        int[][] S = new int[str.length()+1][26];
        for(int i = 1; i <= str.length(); i++){
            int searchChar = str.charAt(i-1)-'a';

            for(int j = 0; j < 26; j++){
                if(searchChar == j){
                    S[i][j] = S[i-1][j] + 1;
                } else {
                    S[i][j] = S[i-1][j];
                }
            }
        }

        StringTokenizer st;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            int a = st.nextToken().charAt(0)-'a';
            int start = Integer.parseInt(st.nextToken())+1;
            int end = Integer.parseInt(st.nextToken())+1;

            bw.write(S[end][a] - S[start-1][a] + "\n");
        }

        bw.flush();
        br.close();
    }

}
