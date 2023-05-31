public class Test {
    //Method to find the shortest path 
    static float getShortestPath(String path){
        //initially we will at origin
        int x=0,y=0;
        for(int i=0;i<path.length();i++)
        {
            char dir=path.charAt(i);   //to get the direction from given route(path)
            //North
            if(dir=='N'){
                y++;
            }
            //South
            else if(dir=='S'){
                y--;
            }
            //East
            else if(dir=='E'){
                x++;
            }
            //West
            else{
                x--;
            }
        }
        //finding squares
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);   //sqrt method is used to find the square root
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(getShortestPath(path));   
    }
}
