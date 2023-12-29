class Solution {
    static boolean[] visited;
    static int answer = 0;
    
    public int solution(String begin, String target, String[] words) {
        // 1. begin과 target이 같으면 현재까지 바꾼 횟수를 answer로 반환한다.
        // 2. words의 첫번째 글자부터 dfs를 돈다.
        // 3. words의 cnt번째 글자와 begin을 비교한다.
        
        visited = new boolean[words.length];
        
        dfs(begin, target, words, 0);
        
        return answer;
    }
    
    public static void dfs(String begin, String target, String[] words, int cnt) {
        if (begin.equals(target)) {
            answer = cnt;
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (visited[i]) {
                continue;
            }

            int k = 0;
            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) != words[i].charAt(j)) {
                    k++;
                }
            }

            if (k == 1) {
                visited[i] = true;
                dfs(words[i], target, words, cnt + 1);
                visited[i] = false;
            }
        }
    }
}
