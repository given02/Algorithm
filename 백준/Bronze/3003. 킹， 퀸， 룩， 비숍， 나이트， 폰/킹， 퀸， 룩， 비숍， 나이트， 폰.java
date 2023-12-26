import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/input.txt")); // 제출 시 주석처리
        Scanner sc = new Scanner(System.in);
        int king = sc.nextInt();
        int queen = sc.nextInt();
        int rook = sc.nextInt();
        int bishop = sc.nextInt();
        int knight = sc.nextInt();
        int pawn = sc.nextInt();
        System.out.println(1 - king);
        System.out.println(1 - queen);
        System.out.println(2 - rook);
        System.out.println(2 - bishop);
        System.out.println(2 - knight);
        System.out.println(8 - pawn);
    }
}