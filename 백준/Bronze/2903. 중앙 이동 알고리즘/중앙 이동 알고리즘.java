import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        Scanner sc = new Scanner(System.in);
        int answer = 4;
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            int cal = (int) (Math.pow(2, i-1) - 1);
            int four = cal * 2;
            int three = (int) Math.pow(cal, 2);

            answer += 5 + (4 * four) + (3 * three);
        }

        System.out.println(answer);
    }

}

