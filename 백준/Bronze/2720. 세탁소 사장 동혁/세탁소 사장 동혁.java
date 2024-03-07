import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/input.txt")); // 제출 시 주석처리
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        for(int i = 0; i < cnt; i ++){
            int change = sc.nextInt();
            int qrtr = change / 25;
            change %= 25;
            int dime = change / 10;
            change %= 10;
            int nickel = change / 5;
            change %= 5;
            int penn = change;
            System.out.println(qrtr+" "+dime+" "+nickel+" "+penn);
        }

    }
}
