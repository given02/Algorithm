import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/input.txt")); // 제출 시 주석처리
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;

        for(int i = 0; i < N; i++){
            if(isGroupString(sc.next())){
                answer++;
            }
        }

        System.out.println(answer);
        sc.close();
    }

    static boolean isGroupString(String str) {
        boolean[] arr = new boolean[26];
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            char prev = i > 0 ? str.charAt(i-1) : str.charAt(0);
            if(!arr[c - 'a']) { // 현재 글자가 false 면 true로 바꿔줌 == 처음 만난 글자라는 뜻
                arr[c - 'a'] = true;
            } else if(c != prev){ // true인 글자를 다시 만나면(처음 만난 글자가 아니라면) 이전 글자와 비교 => 이전 글자와 현재 글자가 다르다면 그룹 글자가 아님 
                return false;
            }
        }
        return true;
    }
}