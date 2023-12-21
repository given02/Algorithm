import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/input.txt")); // 제출 시 주석처리
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();

        HashMap<String,Integer> map = new HashMap<>();
        for(String s : str.split("")){
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        int count = 0;
        String answer = "";
        int max = Collections.max(map.values());
        for(String key : map.keySet()){
            if(map.get(key) == max){
                answer = key;
                count++;
            }
        }

        if(count > 1){
            System.out.println("?");
        } else {
            System.out.println(answer.toUpperCase());
        }
    }
}