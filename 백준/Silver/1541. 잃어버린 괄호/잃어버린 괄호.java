import java.io.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("-");
        int answer = 0;
        for(int i = 0; i < input.length; i++){
            if(i == 0){
                answer += calculate(input[i]);
            }
            else {
                answer -= calculate(input[i]);
            }
        }

        System.out.println(answer);
    }

    public static int calculate(String str){
        int sum = 0;
        String[] temp = str.split("\\+");
        for (String string : temp) {
            sum += Integer.parseInt(string);
        }
        return sum;
    }
}