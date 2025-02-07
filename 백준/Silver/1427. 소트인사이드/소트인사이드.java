import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int[] arr = new int[str.length()];
        for(int i = 0; i < str.length(); i++){
            arr[i] = Integer.parseInt(str.substring(i, i+1));
        }

        for(int i = 0; i < arr.length; i++){
            int max = 0;
            int idx = 0;
            for(int j = i+1; j < arr.length; j++){
                if(max < arr[j]){
                    max = arr[j];
                    idx = j;
                }
            }

            if(arr[i] < max){
                int tmp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = tmp;
            }
        }

        for(int n : arr){
            System.out.print(n);
        }
    }
}
