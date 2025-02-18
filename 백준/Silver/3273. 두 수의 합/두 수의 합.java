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
        HashSet<Integer> set = new HashSet<>();
        for(int i = 1; i < N+1; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }

        int X = Integer.parseInt(br.readLine());
        int count = 0;
        for(int key : set){
            if(set.contains(X - key)){
                count++;
            }
        }
        count /= 2;

        System.out.println(count);
    }

}
