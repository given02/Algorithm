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
        StringTokenizer st;

        st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());

        String[] arr = bf.readLine().split(" ");

        st = new StringTokenizer(bf.readLine());
        int X = Integer.parseInt(st.nextToken());

        int answer = 0;
        for(int i = 0; i < N; i++){
            if(Integer.parseInt(arr[i]) == X){
                answer++;
            }
        }

        bw.write(Integer.toString(answer));
        bw.close();
    }

}

