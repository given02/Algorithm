class Solution {
    public int[] solution(String[] park, String[] routes) {
        int parkX = park[0].length()-1;
        int parkY = park.length-1;
        int curX = 0;
        int curY = 0;
        
        for(int i = 0; i < park.length; i++){
            if(park[i].indexOf('S') != -1){
                curX = park[i].indexOf('S');
                curY = i;
                break;
            }
        }
        
        for(int i = 0; i < routes.length; i++){
            String[] route = routes[i].split(" ");
            int num = Integer.parseInt(route[1]);
            boolean blocked = false;
            
            switch(route[0]){
                case "N":
                    if(curY - num < 0) break;
                    
                    for(int j = 1; j <= num; j++)
                        if(park[curY-j].charAt(curX) == 'X')
                            blocked = true;
                    
                    if(!blocked) curY -= num;
                    
                    break;
                case "S":
                    if(curY + num > parkY) break;
                    
                    for(int j = 1; j <= num; j++)
                        if(park[curY+j].charAt(curX) == 'X')
                            blocked = true;
                    
                    if(!blocked) curY += num;
                    
                    break;
                case "W":
                    if(curX - num < 0) break;
                    
                    for(int j = 1; j <= num; j++)
                        if(park[curY].charAt(curX-j) == 'X')
                            blocked = true;
                    
                    if(!blocked) curX -= num;
                    
                    break;
                case "E":
                    if(curX + num > parkX) break;
                    
                    for(int j = 1; j <= num; j++)
                        if(park[curY].charAt(curX+j) == 'X')
                            blocked = true;
                    
                    if(!blocked) curX += num;
                    
                    break;
            }
        }
        
        return new int[]{curY, curX};
    }
}