import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/input.txt")); // 제출 시 주석처리
        Scanner sc = new Scanner(System.in);

        double answer = 0;
        double count = 0;
        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            if(!arr[2].equals("P")){
                double grade = Double.parseDouble(arr[1]);
                double rate = switch (arr[2]) {
                    case "A+" -> 4.5;
                    case "A0" -> 4.0;
                    case "B+" -> 3.5;
                    case "B0" -> 3.0;
                    case "C+" -> 2.5;
                    case "C0" -> 2.0;
                    case "D+" -> 1.5;
                    case "D0" -> 1.0;
                    default -> 0;
                };

                answer += grade * rate;
                count += grade;
            }
        }

        System.out.println(answer / count);
    }
}