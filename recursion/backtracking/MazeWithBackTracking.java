package recursion.backtracking;

public class MazeWithBackTracking {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        allPaths("",arr,0,0);
    }
    public static void allPaths(String p, boolean[][] arr, int row, int col){
        if(row== arr.length-1 && col== arr[0].length-1){
            System.out.println(p);
            return;
        }
        if(!arr[row][col]) return;
        //imp
        arr[row][col]= false;
        if(row< arr.length-1) allPaths(p+'D',arr,row+1,col);
        if(col< arr[0].length-1) allPaths(p+'R',arr,row,col+1);
        if(row>0) allPaths(p+'U',arr,row-1,col);
        if(col>0) allPaths(p+'L',arr,row,col-1);

        arr[row][col]=true;
    }
}
