import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int answer = 0;
        int score = 0;
        for(int i = 0; i < N; i++){
            String[] arr = br.readLine().split("");
            for(int j = 0; j < arr.length; j++){
                if(arr[j].equals("O")){
                    score++;
                } else {
                    score = 0;
                }
                answer += score;
            }
            bw.write(answer + "\n");
            answer = 0;
            score = 0;
        }

        bw.close();
    }

}

