import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/input.txt")); // 제출 시 주석처리
        Scanner sc = new Scanner(System.in);

        int maxLen = 0;
        String[] str = new String[5];
        for(int i = 0; i < 5; i++){
            str[i] = sc.nextLine();
            maxLen = Math.max(str[i].length(), maxLen);
        }

        for(int j = 0; j < maxLen; j++){
            for (String s : str) {
                if (s.length() > j) {
                    System.out.print(s.charAt(j));
                }
            }
        }
    }
}
