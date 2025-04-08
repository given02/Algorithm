import java.io.*;
import java.util.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int[] xx = {1, -1, 1, -1};
        int[] yy = {1, 1, -1, -1};
        int X = 0;
        int Y = 0;
        for(int x = 0; x < 1000; x++){
            for(int y = 0; y < 1000; y++){
                for(int i = 0; i < 4; i++){
                    int nx = x * xx[i];
                    int ny = y * yy[i];
                    if ((a * nx) + (b * ny) == c && (d * nx) + (e * ny) == f) {
                        X = nx;
                        Y = ny;
                        break;
                    }
                }
            }
        }

        System.out.println(X + " " + Y);
    }
}