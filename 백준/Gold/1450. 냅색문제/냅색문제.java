import java.io.*;
import java.util.*;

public class Main {

    private static int N, C;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            if(i < N/2){
                list1.add(Integer.valueOf(st.nextToken()));
            } else {
                list2.add(Integer.valueOf(st.nextToken()));
            }
        }

        ArrayList<Integer> sum1 = new ArrayList<>();
        ArrayList<Integer> sum2 = new ArrayList<>();

        dfs(0, 0, list1, sum1);
        dfs(0, 0, list2, sum2);

        Collections.sort(sum2);
        int answer = 0;
        for (int integer : sum1) {
            int searchValue = C - integer;
            answer += binarySearch(sum2, searchValue) + 1;
        }

        System.out.println(answer);
    }

    public static void dfs(int idx, int sum, ArrayList<Integer> weight, ArrayList<Integer> answer){
        if(sum > C) return;;
        if(idx == weight.size()){
            answer.add(sum);
            return;
        }

        dfs(idx+1, sum + weight.get(idx), weight, answer);
        dfs(idx+1, sum, weight, answer);
    }

    public static int binarySearch(ArrayList<Integer> sum, int target) {
        int left = 0, right = sum.size()-1, mid, answer = -1;
        while(left <= right){
            mid = (left + right) / 2;
            if(sum.get(mid) <= target){
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return answer;
    }
}
