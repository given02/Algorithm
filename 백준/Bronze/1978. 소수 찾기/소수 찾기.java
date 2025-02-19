import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(tmp != 1 && isPrime(tmp)){
                answer++;
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
