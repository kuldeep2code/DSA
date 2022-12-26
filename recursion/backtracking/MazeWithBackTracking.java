package recursion.backtracking;

<<<<<<< HEAD
import java.util.Arrays;

=======
>>>>>>> origin/main
public class MazeWithBackTracking {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
<<<<<<< HEAD
        int[][] arr1= new int[arr.length][arr[0].length];
//        allPaths("",arr,0,0);
        allPathsPrint("",arr,0,0,arr1,1);
    }
    public static void allPaths(String p, boolean[][] arr, int row, int col){

=======
        allPaths("",arr,0,0);
    }
    public static void allPaths(String p, boolean[][] arr, int row, int col){
>>>>>>> origin/main
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
<<<<<<< HEAD

    public static void allPathsPrint(String p, boolean[][] arr, int row, int col, int[][] arr1, int steps){
        if(row== arr.length-1 && col== arr[0].length-1){
            arr1[row][col]=steps;
            for (int[] a: arr1){
                System.out.println(Arrays.toString(a));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!arr[row][col]) return;
        //imp
        arr[row][col]= false;
        arr1[row][col]=steps;
        if(row< arr.length-1) allPathsPrint(p+'D',arr,row+1,col,arr1,steps+1);
        if(col< arr[0].length-1) allPathsPrint(p+'R',arr,row,col+1,arr1,steps+1);
        if(row>0) allPathsPrint(p+'U',arr,row-1,col,arr1,steps+1);
        if(col>0) allPathsPrint(p+'L',arr,row,col-1,arr1,steps+1);

        arr1[row][col]=0;
        arr[row][col]=true;
    }

=======
>>>>>>> origin/main
}
