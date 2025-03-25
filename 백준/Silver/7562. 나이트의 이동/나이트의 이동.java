import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    private static int[][] visited;
    private static int[] moveX = {-2,-2,2,2,-1,-1,1,1};
    private static int[] moveY = {-1,1,-1,1,-2,2,-2,2};
    private static int N;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            N = Integer.parseInt(br.readLine());
            String[] cur = br.readLine().split(" ");
            String[] goal = br.readLine().split(" ");

            visited = new int[N][N];

            System.out.println(BFS(cur, goal));
        }
    }

    public static int BFS (String[] cur, String[] goal){
        Queue<String[]> queue = new LinkedList<>();
        queue.add(cur);
        visited[Integer.parseInt(cur[0])][Integer.parseInt(cur[1])] = 1;

        while(!queue.isEmpty()){
            cur = queue.poll();
            int x = Integer.parseInt(cur[0]);
            int y = Integer.parseInt(cur[1]);
            if(cur[0].equals(goal[0]) && cur[1].equals(goal[1])){
                return visited[x][y] - 1;
            }

            for(int i = 0; i < 8; i++){
                int nx = x + moveX[i];
                int ny = y + moveY[i];

                if(nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
                if(visited[nx][ny] > 0) continue;
                visited[nx][ny] = visited[x][y] + 1;
                queue.add(new String[]{String.valueOf(nx),String.valueOf(ny)});
            }
        }

        return -1;
    }
}