import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = 1;
        int range = 1;
        int i = 1;

        while (num > range) {
            answer++;
            range += 6 * i;
            i++;
        }

        System.out.println(answer);
    }

}

