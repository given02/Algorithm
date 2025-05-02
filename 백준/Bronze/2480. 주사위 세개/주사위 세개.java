import java.io.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] dice = br.readLine().split(" ");
        int answer;
        if (dice[0].equals(dice[1]) && dice[1].equals(dice[2])){
            answer = 10_000 + Integer.parseInt(dice[0]) * 1000;
        } else if (dice[0].equals(dice[1])){
            answer = 1_000 + Integer.parseInt(dice[0]) * 100;
        } else if (dice[1].equals(dice[2])){
            answer = 1_000 + Integer.parseInt(dice[1]) * 100;
        } else if (dice[0].equals(dice[2])){
            answer = 1_000 + Integer.parseInt(dice[2]) * 100;
        } else {
            answer = Math.max(Integer.parseInt(dice[0]), Math.max(Integer.parseInt(dice[1]), Integer.parseInt(dice[2]))) * 100;
        }

        System.out.println(answer);
    }

}