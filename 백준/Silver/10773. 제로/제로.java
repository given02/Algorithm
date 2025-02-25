import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            if (i == 0) {
                stack.pop();
            } else {
                stack.push(i);
            }
        }

        int answer = 0;
        for(Integer i : stack){
            answer += i;
        }
        System.out.println(answer);
    }
}
