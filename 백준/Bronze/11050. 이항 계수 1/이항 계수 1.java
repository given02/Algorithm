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
        int K = Integer.parseInt(st.nextToken());

        System.out.println(f(N) / (f(K) * f(N-K)));
    }

    public static int f(int n){
        if(n < 2){
            return 1;
        }

        int sum = 1;
        for(int i = 2; i <= n; i++){
            sum *= i;
        }
        return sum;
    }

}