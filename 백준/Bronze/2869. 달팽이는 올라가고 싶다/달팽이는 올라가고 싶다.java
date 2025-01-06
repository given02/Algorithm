import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        
        int answer = (V-B) % (A-B) == 0 ? (V-B) / (A-B) : ((V-B) / (A-B)) + 1;
        
        System.out.println(answer);
    }

}

