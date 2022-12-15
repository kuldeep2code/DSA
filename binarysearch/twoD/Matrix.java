package binarysearch.twoD;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] mat = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 34;
        System.out.println(Arrays.toString(binaryS2D(mat, target)));

    }
    public static int[] binaryS2D(int[][] matrix , int target){

        int loweBoundRow = 0;
        int upperBoundColumn = matrix.length - 1;

        while (loweBoundRow<matrix.length && upperBoundColumn >=0){
            if(matrix[loweBoundRow][upperBoundColumn] == target) return new int[] {loweBoundRow , upperBoundColumn};
            else if(matrix[loweBoundRow][upperBoundColumn] > target) upperBoundColumn--;
            else loweBoundRow++;
        }


        return new int[] {-1,-1};
    }
}
