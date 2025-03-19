import java.util.LinkedList;
import java.util.Queue;

class Solution {
   private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

   public int solution(int[][] maps) {
       int n = maps.length;
       int m = maps[0].length;
       boolean[][] visited = new boolean[n][m];

       Queue<Node> queue = new LinkedList<>();
       queue.offer(new Node(0, 0, 1));

       while (!queue.isEmpty()) {
           Node node = queue.poll();

           if (node.x == n - 1 && node.y == m - 1) {
               return node.distance;
           }

           for (int[] dir : DIRECTIONS) {
               int newX = node.x + dir[0];
               int newY = node.y + dir[1];

               if (newX >= 0 && newX < n && newY >= 0 && newY < m && maps[newX][newY] == 1 && !visited[newX][newY]) {
                   visited[newX][newY] = true;
                   queue.offer(new Node(newX, newY, node.distance + 1));
               }
           }
       }

       return -1;
   }

   class Node {
       int x;
       int y;
       int distance;

       public Node(int x, int y, int distance) {
           this.x = x;
           this.y = y;
           this.distance = distance;
       }
   }
}