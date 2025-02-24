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

        Stack<Integer> stack = new Stack<>();
        for (String string : arr) {
            switch (string.charAt(0)) {
                case '1':
                    stack.push(Integer.parseInt(string.substring(2)));
                    break;
                case '2':
                    System.out.println(!stack.empty() ? stack.pop() : "-1");
                    break;
                case '3':
                    System.out.println(stack.size());
                    break;
                case '4':
                    System.out.println(stack.empty() ? "1" : "0");
                    break;
                case '5':
                    System.out.println(!stack.empty() ? stack.peek() : "-1");
            }
        }
    }
}
