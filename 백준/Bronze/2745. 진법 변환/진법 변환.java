import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/input.txt")); // 제출 시 주석처리
        Scanner sc = new Scanner(System.in);

        String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] arr = sc.nextLine().split(" ");

        int answer = 0;
        for(int i = 0; i < arr[0].length(); i++){
            int num = 1;
            for(int j = 0; j < arr[0].length()-1-i; j++){
                num *= Integer.parseInt(arr[1]);
            }

            answer += num * str.indexOf(arr[0].charAt(i));
        }
        System.out.println(answer);
    }
}
