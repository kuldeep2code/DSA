package linearsearch;

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {54,4532,5842,45465},
                {6485,68453,2452},
                {645,456,8564},
                {485,645,45645}
        };

        int target=645;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] search(int[][] arr, int target){
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols <arr[rows].length; cols++) {
                if(target == arr[rows][cols]){
                    return new int[]{rows,cols};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] ints:arr){
            for (int Element:ints){
                if(Element>max){
                    max = Element;
                }
            }
        }
        return max;
    }
}
