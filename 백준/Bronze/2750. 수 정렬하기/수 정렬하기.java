import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = s.nextInt();
        }

//        Arrays.sort(arr);

        for(int i = 0; i < N-1; i++){
            for(int j = 0; j < N-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        for(int i : arr){
            System.out.println(i);
        }
    }
}
