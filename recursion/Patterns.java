package recursion;

import java.util.Arrays;

public class Patterns {
    public static void main(String[] args) {
//        pattern2(4,0);
        int []arr = {4,1,3,2,1};
//        bubbleSort(arr, arr.length-1, 0);
//        System.out.println(Arrays.toString(arr));
//
        selectionSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }


    public static void pattern1(int row , int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print(" * ");
            pattern1(row,col+1);
        }else {
            System.out.println();
            pattern1(row-1,0);
        }

    }
    public static void pattern2(int row , int col){
        if(row==0){
            return;
        }
        if(col<row){
            pattern2(row,col+1);
            System.out.print(" * ");
        }else {
            pattern2(row-1,0);
            System.out.println();
        }

    }

    public static void bubbleSort(int arr[] , int row , int col){
        if(row==0){
            return;
        }
        if(col<row){
            if(arr[col]>=arr[col+1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            bubbleSort(arr, row, col + 1);
        }else {
            bubbleSort(arr,row-1,0);
        }

    }

    public static void selectionSort(int arr[] , int row , int col ,int max){
        if(row==0) return;
        if(col<row){
            if(arr[col]>arr[max]){
                selectionSort(arr,row,col+1,col);
            }else {
                selectionSort(arr,row,col+1,max);
            }

        }else{
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;
            selectionSort(arr,row-1,0,0);
        }
    }


}
