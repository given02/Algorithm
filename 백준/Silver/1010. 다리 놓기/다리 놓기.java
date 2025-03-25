import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            BigInteger answer = f(M).divide(f(N).multiply(f(M-N)));

            System.out.println(answer);
        }
    }

    public static BigInteger f(int n){
        if(n < 2){
            return BigInteger.valueOf(1);
        }

        BigInteger sum = BigInteger.valueOf(1);
        for(int i = 2; i <= n; i++){
            sum = sum.multiply(BigInteger.valueOf(i));
        }

        return sum;
    }

}