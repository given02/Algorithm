import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        String[] TP = br.readLine().split(" ");
        int T = Integer.parseInt(TP[0]);
        int P = Integer.parseInt(TP[1]);

        int[] t = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int tmp = Integer.parseInt(arr[i]);
            if(tmp % T == 0){
                t[i] = tmp / T;
            } else {
                t[i] = tmp / T + 1;
            }
        }

        System.out.println(Arrays.stream(t).sum());
        System.out.println(N / P + " " + N % P);
    }
}
