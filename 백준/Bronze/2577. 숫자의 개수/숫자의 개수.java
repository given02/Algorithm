import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());

        Character[] arr = {'0','1','2','3','4','5','6','7','8','9'};
        String str = Long.toString((long) A * B * C);
        for(Character c : arr){
            int count = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == c){
                    count++;
                }
            }
            bw.write(Integer.toString(count) + '\n');
        }
        bw.close();
    }

}

