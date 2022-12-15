package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static sorting.SelectionAndInsertionExample.swap;

public class CycleExample {
    public static void main(String[] args) {
        int[] arr = {1,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(i!=arr[i]-1){
                myList.add(i+1);
            }
        }
        System.out.println(myList);
    }
    static void cycleSort(int[] arr){
        int i = 0;
        while ( i <arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]) swap(arr,i,correct);
            else i++;
        }
    }
}
