class Solution {
    public boolean solution(int x) {
        int num = 0;
        int newx = x;
        while(newx > 0){
            num += newx % 10;
            newx = newx / 10;
        }
        return (x % num == 0) ? true : false;
    }
}