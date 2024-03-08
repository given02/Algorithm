import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/input.txt")); // 제출 시 주석처리
        Scanner sc = new Scanner(System.in);

        String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] arr = sc.nextLine().split(" ");

        String answer = "";
        long num1 = Long.parseLong(arr[0]);
        int num2 = Integer.parseInt(arr[1]);

        while(num1 >= num2){
            answer = str.charAt((int) (num1 % num2)) + answer;
            num1 /= num2;
        }
        answer = str.charAt((int) num1) + answer;

        System.out.println(answer);
    }
}
