import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> prime = new ArrayList<>();
        for(int i = 2; i <= N; i++){
            if(isPrime(i)){
                prime.add(i);
            }
        }

        int s = 0, e = 0, sum = 0, cnt = 0;
        while(true) {
            if (sum >= N) {
                sum -= prime.get(s++);
            } else if(e == prime.size()) {
                break;
            } else{
                sum += prime.get(e++);
            }
            if(sum == N){
                cnt++;
            }
        }


        System.out.println(cnt);
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
