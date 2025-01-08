import java.io.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String content = br.lines().collect(Collectors.joining(System.lineSeparator()));
        
        bw.write(content);
        bw.close();

    }

}

