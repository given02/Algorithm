import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for(int i = 0; i < N; i++){
            arr[i] = br.readLine();
        }

        Stack<String> stack;
        for (String str : arr) {
            stack = new Stack<>();
            String answer = "YES";
            for(String s : str.split("")){
                if(s.equals("(")){
                    stack.push(s);
                }
                else if(stack.empty()){
                    answer = "NO";
                }
                else {
                    stack.pop();
                }
            }
            System.out.println(stack.empty() ? answer : "NO");
        }
    }
}
