import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split("");
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        String[][] arr = new String[N][3];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();
        }

        int[] S = new int[N];
        for(int i = 0; i < N; i++){
            int start = Integer.parseInt(arr[i][1]);
            int end = Integer.parseInt(arr[i][2]);
            for (int j = start; j <= end; j++) {
                if (arr[i][0].equals(str[j])) {
                    S[i] += 1;
                }
            }
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i : S){
            bw.write(i + "\n");
        }

        bw.close();
        br.close();
    }

}
