import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] tmp = arr.clone();
        Arrays.sort(tmp);

        HashMap<Integer,Integer> map = new HashMap<>();
        int prev = tmp[0];
        int seq = 0;
        for(int i : tmp){
            if(prev != i){
                seq++;
            }
            map.put(i, seq);
            prev = i;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i : arr){
            bw.write(map.get(i) + " ");
        }

        bw.close();
        br.close();
    }
}
