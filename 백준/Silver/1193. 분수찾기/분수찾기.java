import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // depth 구하기
        int depth = 1;
        for(int i = 1; i < x; i++){
            x = x - i;
            depth++;
        }

        int sum = depth + 1;
        int bunza, bunmo;
        if(depth % 2 == 0) {
            bunza = x;
            bunmo = sum - bunza;
        } else {
            bunmo = x;
            bunza = sum - bunmo;
        }

        System.out.println(bunza + "/" + bunmo);
    }

}

