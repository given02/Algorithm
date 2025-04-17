import java.io.*;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    static char[][] arr;

    public static void solution() throws IOException {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        arr = new char[N][N];
        for(char[] chars : arr){
            Arrays.fill(chars, '*');
        }

        recur(0, 0, N);

        for(char[] chars : arr){
            System.out.println(new String(chars));
        }
    }

    public static void recur(int x, int y, int n){
        if(n < 3) return;

        int newN = n/3;
        for(int i = x + newN; i < x + newN*2; i++){
            for(int j = y + newN; j < y + newN*2; j++){
                arr[i][j] = ' ';
            }
        }

        for (int dx = 0; dx < 3; dx++) {
            for (int dy = 0; dy < 3; dy++) {
                if (dx == 1 && dy == 1) continue;
                recur(x + (dx * newN), y + (dy * newN), newN);
            }
        }
    }

}