import java.io.*;

import java.io.IOException;
import java.util.*;

public class Main {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        sb.append((int) (Math.pow(2, N) - 1)).append('\n');

        Hanoi(N, 1, 2, 3);

        System.out.println(sb);
    }

    public static void Hanoi(int N, int start, int mid, int to) {
        if (N == 1) {
            sb.append(start).append(" ").append(to).append("\n");
            return;
        }

        Hanoi(N - 1, start, to, mid);

        sb.append(start).append(" ").append(to).append("\n");

        Hanoi(N - 1, mid, start, to);
    }

}