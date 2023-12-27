import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/input.txt")); // 제출 시 주석처리
        Scanner sc = new Scanner(System.in);

        int answer = -1;
        int x = 0;
        int y = 0;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                int num = sc.nextInt();
                if(num > answer){
                    answer = num;
                    x = i+1;
                    y = j+1;
                }
            }
        }
        System.out.println(answer);
        System.out.print(x + " " + y);
    }
}