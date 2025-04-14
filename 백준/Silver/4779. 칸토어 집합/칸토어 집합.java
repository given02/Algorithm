import java.io.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    static String str;

    public static void solution() throws IOException {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int N = s.nextInt();
            int len = (int) Math.pow(3, N);
            char[] arr = new char[len];
            Arrays.fill(arr, '-');

            recur(arr, 0, len);

            System.out.println(new String(arr));
        }
    }

    public static void recur(char[] arr, int start, int len){
        if(len < 3) return;

        int third = len / 3;
        for(int i = start + third; i < start + 2 * third; i++){
            arr[i] = ' ';
        }

        recur(arr, start, third);
        recur(arr, start + 2 * third, third);
    }

}