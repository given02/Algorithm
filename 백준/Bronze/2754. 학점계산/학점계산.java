import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        switch (st.nextToken()){
            case "A+": bw.write("4.3"); break;
            case "A0": bw.write("4.0"); break;
            case "A-": bw.write("3.7"); break;
            case "B+": bw.write("3.3"); break;
            case "B0": bw.write("3.0"); break;
            case "B-": bw.write("2.7"); break;
            case "C+": bw.write("2.3"); break;
            case "C0": bw.write("2.0"); break;
            case "C-": bw.write("1.7"); break;
            case "D+": bw.write("1.3"); break;
            case "D0": bw.write("1.0"); break;
            case "D-": bw.write("0.7"); break;
            case "F": bw.write("0.0"); break;
        }

        bw.close();

    }

}

