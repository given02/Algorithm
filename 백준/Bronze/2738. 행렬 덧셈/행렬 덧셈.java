import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/input.txt")); // 제출 시 주석처리
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];

        for(int i = 0; i < N; i++)
            for(int j = 0; j < M; j++)
                arr[i][j] = sc.nextInt();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + sc.nextInt());
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}