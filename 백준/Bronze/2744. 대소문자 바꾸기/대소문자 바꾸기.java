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
        StringTokenizer st = new StringTokenizer(bf.readLine());

        byte[] arr = st.nextToken().getBytes();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= 90){
                bw.write(arr[i]+32);
            } else {
                bw.write(arr[i]-32);
            }
        }

        bw.close();

    }

}

