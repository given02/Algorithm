import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/input.txt")); // 제출 시 주석처리
        Scanner sc = new Scanner(System.in);

        int answer = 0;
        int cnt = sc.nextInt();
        boolean[][] paper = new boolean[101][101];
        for(int i = 0; i < cnt; i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            for(int j = X; j < X+10; j++){
                for(int k = Y; k < Y+10; k++){
                    if(!paper[j][k]){
                        paper[j][k] = true;
                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
