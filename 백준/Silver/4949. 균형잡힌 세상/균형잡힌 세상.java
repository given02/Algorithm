import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack;
        String str = "";
        String answer;
        while(true) {
            stack = new Stack<>();
            str = br.readLine();
            answer = "yes";
            if(str.equals(".")) break;
            for(char c : str.toCharArray()){
                if(c == '(' || c == '[') stack.push(c);
                else if(c == ')'){
                    if(!stack.empty() && stack.peek() == '(') {
                        stack.pop();
                    }
                    else {
                        answer = "no";
                    }
                }
                else if(c == ']'){
                    if(!stack.empty() && stack.peek() == '[') {
                        stack.pop();
                    }
                    else {
                        answer = "no";
                    }
                }
            }
            System.out.println(stack.empty() ? answer : "no");
        }
    }

}
