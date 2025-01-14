import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> map = new HashMap<>();

        String str = br.readLine();

        String[] arr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for(String c : arr){
            if(str.contains(c)){
                map.put(c, str.indexOf(c));
            } else {
                map.put(c, -1);
            }
        }

        for(Integer value : map.values()){
            bw.write(value + " ");
        }

        bw.close();
    }

}

