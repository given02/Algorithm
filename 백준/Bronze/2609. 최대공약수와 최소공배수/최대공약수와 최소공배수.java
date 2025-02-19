import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B= Integer.parseInt(st.nextToken());

        int gcd = gcd(A, B);
        int lcm = lcm(A, B, gcd);
        System.out.println(gcd);
        System.out.println(lcm);
    }

    public static int gcd(int a, int b){
        int gcf = 1;
        for(int i = 2; i <= Math.min(a,b); i++){
            if(a % i == 0 && b % i ==0){
                gcf = i;
            }
        }
        return gcf;
    }

    public static int lcm(int a, int b, int gcd){
        return (a * b) / gcd;
    }
}
