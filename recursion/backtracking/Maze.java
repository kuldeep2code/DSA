package recursion.backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        path("",3,3);
//        ArrayList<String> list = new ArrayList<>();
//        list = pathList("",3,3);
//        System.out.println(list);
        boolean[][] arr = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };

        pathRestriction(arr,0,0,"");
    }

    public static  int count(int row , int col){

        if(row==1||col==1) return 1;
        int left=count(row-1,col);
        int right=count(row,col-1);
        return left+right;
    }

    public static void path(String p , int row, int col){
        if(row==1&&col==1){
            System.out.println(p);
            return;
        }
        if(row>1){
            path(p + "D", row-1,col);
        }
        if(col>1){
            path(p + "R", row ,col-1);
        }
    }

    public static ArrayList<String> pathList(String p , int row, int col){
        if(row==1&&col==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(row>1){
            list.addAll(pathList(p + "D", row-1,col));
        }
        if(col>1){
            list.addAll(pathList(p + "R", row ,col-1));
        }
        return list;
    }

    public static void pathRestriction(boolean[][] arr, int row , int col ,String p){
        if(row== arr.length-1 && col== arr[0].length-1){
            System.out.println(p);
            return;
        }
        if(!arr[row][col]) return;
        if(row<arr.length-1) pathRestriction(arr,row+1,col,p+'D');
        if(col<arr[0].length-1) pathRestriction(arr,row ,col+1,p+'R');
    }
}
