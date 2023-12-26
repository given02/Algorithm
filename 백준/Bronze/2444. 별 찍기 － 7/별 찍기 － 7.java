import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/input.txt")); // 제출 시 주석처리
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i <= N; i++){
            for(int j = 0; j < N - i; j++)
                System.out.print(" ");
            for(int j = 0; j < i + (i - 1); j++)
                System.out.print("*");
            System.out.print("\n");
        }
        for(int i = N - 1; i > 0; i--){
            for(int k = 0; k < N - i; k++)
                System.out.print(" ");
            for(int k = 0; k < i + (i - 1); k++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}