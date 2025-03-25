import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    private static int[][] visited;
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

            if (x-2 >= 0 && y-1 >= 0 && visited[x-2][y-1] == 0) {
                visited[x-2][y-1] = visited[x][y] + 1;
                queue.add(new String[]{String.valueOf(x-2),String.valueOf(y-1)});
            }
            if (x-2 >= 0 && y+1 < N && visited[x-2][y+1] == 0) {
                visited[x-2][y+1] = visited[x][y] + 1;
                queue.add(new String[]{String.valueOf(x-2),String.valueOf(y+1)});
            }
            if (x+2 < N && y-1 >= 0 && visited[x+2][y-1] == 0) {
                visited[x+2][y-1] = visited[x][y] + 1;
                queue.add(new String[]{String.valueOf(x+2),String.valueOf(y-1)});
            }
            if (x+2 < N && y+1 < N && visited[x+2][y+1] == 0) {
                visited[x+2][y+1] = visited[x][y] + 1;
                queue.add(new String[]{String.valueOf(x+2),String.valueOf(y+1)});
            }
            if (x-1 >= 0 && y-2 >= 0 && visited[x-1][y-2] == 0) {
                visited[x-1][y-2] = visited[x][y] + 1;
                queue.add(new String[]{String.valueOf(x-1),String.valueOf(y-2)});
            }
            if (x-1 >= 0 && y+2 < N && visited[x-1][y+2] == 0) {
                visited[x-1][y+2] = visited[x][y] + 1;
                queue.add(new String[]{String.valueOf(x-1),String.valueOf(y+2)});
            }
            if (x+1 < N && y-2 >= 0 && visited[x+1][y-2] == 0) {
                visited[x+1][y-2] = visited[x][y] + 1;
                queue.add(new String[]{String.valueOf(x+1),String.valueOf(y-2)});
            }
            if (x+1 < N && y+2 < N && visited[x+1][y+2] == 0) {
                visited[x+1][y+2] = visited[x][y] + 1;
                queue.add(new String[]{String.valueOf(x+1),String.valueOf(y+2)});
            }
        }

        return -1;
    }
}