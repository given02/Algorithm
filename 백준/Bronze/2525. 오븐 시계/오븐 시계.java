import java.io.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] current = br.readLine().split(" ");
        int time = Integer.parseInt(br.readLine());

        int hour = Integer.parseInt(current[0]);
        int minute = Integer.parseInt(current[1]) + time;
        if(minute >= 60){
            hour += minute/60;
            if(hour >= 24){
                hour -= 24;
            }
            minute %= 60;
        }

        System.out.println(hour + " " + minute);
    }

}