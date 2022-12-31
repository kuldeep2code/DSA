package practicequestion;

import java.util.Arrays;

public class WaveArrray {
    static int i=0;
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                {41,42},
                {11,12}
        };
        waveArray(arr, arr[0].length, arr.length);
    }

    public static void waveArray(int[][] arr, int colSize , int rowSize){
        for (int col = 0; col < colSize; col++) {

            if (col%2==0){
                for (int j = 0 ; j < rowSize; j++) {
                    System.out.print(arr[j][col]+ " ");
                }
            }else {
                for (int j = rowSize-1; j >= 0; j--) {
                    System.out.print(arr[j][col] + " ");
                }
            }


        }
    }


}
