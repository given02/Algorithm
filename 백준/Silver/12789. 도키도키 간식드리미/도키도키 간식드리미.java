import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        String answer = "Nice";
        int seq = 1;
        int idx = 0;
        while(idx < N){
            if(arr[idx] == seq){
                idx++;
                seq++;
            }
            else if(!stack.empty() && stack.peek() == seq) {
                stack.pop();
                seq++;
            }
            else {
                stack.push(arr[idx]);
                idx++;
            }
        }
        while(seq <= N){
            if(!stack.empty() && stack.peek() == seq){
                stack.pop();
                seq++;
            } else {
                answer = "Sad";
                break;
            }
        }

        System.out.println(stack.empty() ? answer : "Sad");
    }

}
