import java.io.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int count = 0;
    static int result = -1;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = s.nextInt();
        }

        merge_sort(arr,0,N-1, K);

        System.out.println(result);
    }

    public static void merge_sort(int[] arr, int p, int r, int k){
        if(p < r) {
            int q = (p+r) / 2;
            merge_sort(arr, p, q, k);
            merge_sort(arr,q+1, r, k);
            merge(arr, p, q, r, k);
        }
    }

    public static void merge(int[] arr, int p, int q, int r, int k){
        int i = p, j = q+1, t = 0;
        int[] tmp = new int[r-p+1];

        while (i <= q && j <= r){
            if(arr[i] <= arr[j]){
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }
        }

        while (i <= q){
            tmp[t++] = arr[i++];
        }

        while (j <= r){
            tmp[t++] = arr[j++];
        }

        i = p; t= 0;
        while (i <= r){
            arr[i++] = tmp[t++];
            count++;
            if(count == k){
                result = arr[i-1];
            }
        }
    }

}