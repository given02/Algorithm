import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String str = br.readLine();
            if(str.equals("0")) break;

            String answer = "yes";
            int len = str.length() / 2;
            for(int i = 0; i < len; i++){
                if(str.charAt(i) != str.charAt(str.length()-1-i)){
                    answer = "no";
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}
