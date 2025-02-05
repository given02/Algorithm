import java.io.*;
import java.util.*;

import static javax.swing.text.html.HTML.Attribute.N;

public class Main {

    private static char[] str1;
    private static char[] str2;
    private static Integer[][] D;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str1 = br.readLine().toCharArray();
        str2 = br.readLine().toCharArray();

        D = new Integer[str1.length][str2.length];

        System.out.println(LCS(str1.length-1, str2.length-1) + "\n");
    }

    public static int LCS(int x, int y) {
        if(x == -1 || y == -1){
            return 0;
        }

        if(D[x][y] == null){
            D[x][y] = 0;
            if(str1[x] == str2[y]){
                D[x][y] = LCS(x-1, y-1) + 1;
            } else {
                D[x][y] = Math.max(LCS(x-1, y), LCS(x, y-1));
            }
        }

        return D[x][y];
    }

}
