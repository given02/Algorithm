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

        String answer = "";
        int start = Integer.parseInt(st.nextToken());
        if(start == 8){
            for(int i = 1; i < 8; i++){
                int next = Integer.parseInt(st.nextToken());
                if(start - i == next) {
                    answer = "descending";
                } else {
                    answer = "mixed";
                    break;
                }
            }
        } else if(start == 1){
            for(int i = 1; i < 8; i++){
                int next = Integer.parseInt(st.nextToken());
                if(start + i == next) {
                    answer = "ascending";
                } else {
                    answer = "mixed";
                    break;
                }
            }
        } else {
            answer = "mixed";
        }

        bw.write(answer);
        bw.close();
    }

}

