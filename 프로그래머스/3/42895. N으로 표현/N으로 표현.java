import java.util.*;

class Solution {
    public int solution(int N, int number) {
        if(N == number) return 1;
        
        List<HashSet<Integer>> dp = new ArrayList<>();
        for(int i = 0; i <= 8; i++){ // 최대 N을 8번 사용해서 만들 수 있는지를 확인해야하니까 리스트를 8개 생성
            dp.add(new HashSet<>());
        }
        
        dp.get(1).add(N); // dp[i][1] = i // 1번 사용하면 N이니까 직접 초기화
        
        for (int i = 2; i <= 8; i++) { // 2번 이상은 반복문 활용 초기화
            StringBuilder sb = new StringBuilder().append(N);
            for (int j = 1; j < i; j++) { // N을 i번 사용한 숫자 생성
                sb.append(N);
            }
            dp.get(i).add(Integer.parseInt(sb.toString())); // 리스트에 추가
            
            for (int j = 1; j < i; j++) { // N을 i번 사용하면서 연산자 4개 활용 연산 진행
                int k = i - j;
                for (int num1 : dp.get(j)) { // 연산 진행
                    for (int num2 : dp.get(k)) {
                        dp.get(i).add(num1 + num2);
                        dp.get(i).add(num1 - num2);
                        dp.get(i).add(num1 * num2);
                        if (num2 != 0) {
                            dp.get(i).add(num1 / num2);
                        }
                    }
                }
            }
 
            System.out.println(dp);
            
            if (dp.get(i).contains(number)) { // 결과 중 number와 일치하는 값이 있으면 현재 i 반환
                return i;
            }
            
        }
 
        return -1;
    }
}