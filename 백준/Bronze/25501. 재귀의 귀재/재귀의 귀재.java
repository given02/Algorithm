import java.io.*;

import java.io.IOException;

public class Main {

    static int cnt;
    
    public static void main(String[] args) throws IOException {
        solution();
    }
    
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            cnt = 1;
            String str = br.readLine();
            int result = recursive(str.toCharArray(), 0, str.length()-1);
            System.out.println(result + " " + cnt);
        }
    }

    public static int recursive(char[] chars, int l, int r){
        if(l >= r) return 1;
        if(chars[l] != chars[r]) return 0;
        cnt++;
        return recursive(chars, l+1, r-1);
    }

}