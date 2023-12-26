import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String numbers) {
        
        Set<Integer> set = new HashSet<>();
        permutation("", numbers, set);
        
        int count = 0;
        for(int num : set) {
            if(isPrime(num)){
                count++;
            }
        }
        
        return count;
        
    }
    
    private void permutation(String prefix, String str, Set<Integer> set) { // 순열 구하기
        int n = str.length();
        if (!prefix.equals("")) {
            set.add(Integer.valueOf(prefix));
        }
        for (int i = 0; i < n; i++) { // 재귀호출
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), set);
        }
    }
    
    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // n의 제곱근까지 loop
            if (n % i == 0) { // 나누어 떨어지는 i가 있다면 소수가 아니므로 false를 반환
                return false;
            }
        }
        return true;
    }
    
}