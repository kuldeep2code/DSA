package recursion.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {12,43,65,2,6,2,2};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public  static  void sort(int[] arr , int low , int hi){
        if(low>=hi) return;
        int s= low;
        int e= hi;
        int pivot = s+(e-s)/2;
        while (s<=e){
            while (arr[s]<arr[pivot]) s++;
            while (arr[e]>arr[pivot]) e--;
            if(s<=e){
                int temp = arr[s];
                arr[s]= arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        sort(arr,low,e);
        sort(arr,s,hi);
    }
}
