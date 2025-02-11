import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        String[][] arr = new String[N][2];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr, ((o1, o2) -> {
            if(o1[0].equals(o2[0])){
                if(o1[1].length() == o2[1].length()){
                    for(int i = 0; i < o1[1].length(); i++){
                        if(o1[1].equals(o2[1])){
                            return o1[1].charAt(i) - o2[1].charAt(i);
                        }
                    }
                }
                return o1[1].length() - o2[1].length();
            }
            return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
        }));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < N; i++){
            bw.write(arr[i][0] + " " + arr[i][1] + "\n");
        }

        bw.close();
        br.close();
    }

}
