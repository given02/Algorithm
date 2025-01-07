import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        boolean[] submitted = new boolean[31];

        for(int i = 1; i <= 28; i++){
            int num = Integer.parseInt(bf.readLine());
            submitted[num] = true;
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < submitted.length; i++){
            if(!submitted[i]){
                list.add(i);
            }
        }
        bw.write(Integer.toString(list.get(0))+ '\n');
        bw.write(Integer.toString(list.get(1)));
        bw.close();
    }

}

