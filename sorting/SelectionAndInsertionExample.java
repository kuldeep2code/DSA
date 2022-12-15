package sorting;

import java.util.Arrays;

public class SelectionAndInsertionExample {
    public static void main(String[] args) {
        int[] arr ={23,1,4,2,5,45,32};
//        selection(arr);
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public  static void insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j>0; j--) {
                if(arr[j]<arr[j-1]) swap(arr,j,j-1);
                else break;
            }
        }
    }
    public static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int max = getMax(arr,0,last);
            swap(arr,max,last);
        }
    }

    public static int getMax(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }

        return max;
    }

    static void swap(int[]arr , int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
