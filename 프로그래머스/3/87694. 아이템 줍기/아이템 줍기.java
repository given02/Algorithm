import java.util.*;

class Solution {
    
    static int[][] map;
    
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        map = new int[101][101];
        
        for(int[] rect : rectangle){
            int x1 = rect[0];
            int y1 = rect[1];
            int x2 = rect[2];
            int y2 = rect[3];
            
            draw(x1*2, y1*2, x2*2, y2*2);
        }
        
        return bfs(characterX*2, characterY*2, itemX*2, itemY*2);
        
        // for(int i = 0; i < map.length; i++){
        //     System.out.println(Arrays.toString(map[i]));
        // }
    }
    
    public int bfs(int cx, int cy, int ix, int iy){
        int[] xMoves = {0,0,-1,1};
        int[] yMoves = {1,-1,0,0};
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{cx,cy,0});
        
        boolean[][] visited = new boolean[101][101];
        while(!queue.isEmpty()){
            int[] arr = queue.poll();
            int curX = arr[0];
            int curY = arr[1];
            int moves = arr[2];
            if(curX == ix && curY == iy){
                return moves / 2;
            }
            
            for(int i = 0; i < 4; i++){
                int nextX = curX + xMoves[i];
                int nextY = curY + yMoves[i];
                if(nextX < 0 || nextY < 0 || nextX >= map.length || nextY >= map.length)
                    continue;
                
                if(!visited[nextX][nextY] && map[nextX][nextY] == '2'){
                    visited[nextX][nextY] = true;
                    queue.add(new int[]{nextX,nextY,moves+1});
                }
            }
        }
        
        return 0;
    }
    
    public void draw(int x1, int y1, int x2, int y2){
        for(int i = x1; i <= x2; i++){
            for(int j = y1; j <= y2; j++){
                if (map[i][j] == '1') 
                    continue;
                
                map[i][j] = '1';
                
                if (i == x1 || i == x2 || j == y1 || j == y2) 
                    map[i][j] = '2';
            }
        }
    }
}