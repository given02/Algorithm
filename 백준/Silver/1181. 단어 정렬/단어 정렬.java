import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];
        for(int i = 0; i < N; i++){
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1.length() == o2.length()){
                for(int i = 0; i < o1.length(); i++){
                    if(o1.charAt(i) != o2.charAt(i)){
                        return o1.charAt(i) - o2.charAt(i);
                    }
                }
            }
            return o1.length() - o2.length();
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String prev = "";
        for(int i = 0; i < N; i++){
            if(!prev.equals(arr[i])){
                bw.write(arr[i] + "\n");
            }
            prev = arr[i];
        }

        bw.close();
        br.close();
    }

}
