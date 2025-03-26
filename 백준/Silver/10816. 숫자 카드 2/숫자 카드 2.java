import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Map<Integer,Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int key = Integer.parseInt(st.nextToken());
            map.put(key, map.getOrDefault(key,0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            int key = Integer.parseInt(st.nextToken());
            if(map.containsKey(key)){
                bw.write(map.get(key) + " ");
            } else {
                bw.write(0 + " ");
            }
        }

        bw.close();
    }

}