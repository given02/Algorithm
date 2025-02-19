import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int tmp, answer = 0;
        for(int i = 0; i < N-2; i++){
            for(int j = i+1; j < N-1; j++){
                for(int k = j+1; k < N; k++){
                    tmp = arr[i] + arr[j] + arr[k];
                    if(tmp <= M){
                        answer = Math.max(answer, tmp);
                    }
                }
            }
        }

        System.out.println(answer);
    }

    public static boolean isPrime(int num){
        for(int i = 2; i * i <= num; i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
