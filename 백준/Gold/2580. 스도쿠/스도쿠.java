import java.io.*;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }

    static int[][] board;
    static boolean[][] box;
    static boolean[][] row;
    static boolean[][] col;
    static List<int[]> empty = new ArrayList<>();
    static boolean found = false;

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        board = new int[9][9];
        box = new boolean[9][10];
        row = new boolean[9][10];
        col = new boolean[9][10];

        for(int i = 0; i < 9; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++){
                int num = Integer.parseInt(st.nextToken());
                board[i][j] = num;

                if(num == 0){
                    empty.add(new int[]{i,j});
                } else {
                    int b = (i/3) * 3 + (j/3);
                    row[i][num] = col[j][num] = box[b][num] = true;
                }
            }
        }

        DFS(0);
    }

    public static void DFS(int depth){
        if(found) return;

        if(depth == empty.size()){
            StringBuilder sb = new StringBuilder();
            for(int[] i : board){
                for(int j : i){
                    sb.append(j).append(" ");
                }
                sb.append("\n");
            }
            System.out.println(sb);
            found = true;
            return;
        }

        int[] pos = empty.get(depth);
        int x = pos[0];
        int y = pos[1];
        int b = (x/3) * 3 + (y/3);
        for(int i = 1; i <= 9; i++){
            if(row[x][i] || col[y][i] || box[b][i]) continue;

            row[x][i] = col[y][i] = box[b][i] = true;
            board[x][y] = i;
            DFS(depth+1);
            board[x][y] = 0;
            row[x][i] = col[y][i] = box[b][i] = false;
        }
    }

}