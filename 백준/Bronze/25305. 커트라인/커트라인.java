import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int N = s.nextInt();

        Integer[] arr = new Integer[T];
        for(int i = 0; i < T; i++){
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr, (a, b) -> b - a);

        System.out.println(arr[N-1]);
    }

}
