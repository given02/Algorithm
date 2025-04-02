import java.util.*;

class Solution {
    
    static List<List<Point>> blocks = new ArrayList<>();
    static List<List<Point>> blanks = new ArrayList<>();
    static int[] moveX = {0,0,-1,1};
    static int[] moveY = {1,-1,0,0};
    static int N;
    
    public int solution(int[][] game_board, int[][] table) {
        N = table.length;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                game_board[i][j] = (game_board[i][j] == 1) ? 0 : 1;
            }
        }
        
        boolean[][] visitedBoard = new boolean[N][N];
        boolean[][] visitedTable = new boolean[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(!visitedTable[i][j] && table[i][j] == 1) {
                    List<Point> block = new ArrayList<>();
                    DFS(table, visitedTable, i, j, block);
                    blocks.add(normalize(block));
                }
                if(!visitedBoard[i][j] && game_board[i][j] == 1){
                    List<Point> blank = new ArrayList<>();
                    DFS(game_board, visitedBoard, i, j, blank);
                    blanks.add(normalize(blank));
                }
            }
        }
        
        int answer = 0;
        boolean[] usedBlock = new boolean[blocks.size()];
        for(List<Point> blank : blanks){
            for(int i = 0; i < blocks.size(); i++){
                if(usedBlock[i]) continue;
                
                List<Point> block = blocks.get(i);
                if(matches(block, blank)){
                    answer += block.size();
                    usedBlock[i] = true;
                    break;
                }
            }
        }
        
        return answer;
    }
    
    
    public void DFS(int[][] arr, boolean[][] visited, int x, int y, List<Point> list){
        list.add(new Point(x,y));
        visited[x][y] = true;
        
        for(int i = 0; i < 4; i++){
            int nextX = x + moveX[i];
            int nextY = y + moveY[i];
            
            if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= N)
                continue;
            if(visited[nextX][nextY] || arr[nextX][nextY] != 1)
                continue;
            
            DFS(arr, visited, nextX, nextY, list);
        }
        
    }
    
    public boolean matches(List<Point> block, List<Point> blank){
        if(block.size() != blank.size()) return false;

        for(int i = 0; i < 4; i++){
            block = normalize(rotate(block));
            if(compare(block, blank)) return true;
        }
        
        return false;
    }
    
    public boolean compare(List<Point> block, List<Point> blank){
        block.sort(Comparator.comparingInt((Point p) -> p.x).thenComparingInt(p -> p.y));
        blank.sort(Comparator.comparingInt((Point p) -> p.x).thenComparingInt(p -> p.y));

        for(int i = 0; i < block.size(); i++){
            if(block.get(i).x != blank.get(i).x || block.get(i).y != blank.get(i).y) 
                return false;
        }
        
        return true;
    }
    
    public List<Point> rotate(List<Point> list){
        List<Point> rotated = new ArrayList<>();
        for(Point p : list){
            rotated.add(new Point(p.y, -p.x));
        }
        return rotated;
    }
    
    public List<Point> normalize(List<Point> list){
        List<Point> normalized = new ArrayList<>();
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        
        for(Point p : list){
            minX = Math.min(minX, p.x);
            minY = Math.min(minY, p.y);
        }
        
        for(Point p : list){
            normalized.add(new Point(p.x - minX, p.y - minY));
        }
        
        return normalized;
    }
    
    public class Point {
        int x;
        int y;
        
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
        
        public String toString(){
            return "{x:" + this.x + ", y:" + this.y + "}";
        }
    }
    
}