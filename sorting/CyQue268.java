package sorting;

import static sorting.SelectionAndInsertionExample.swap;

public class CyQue268 {
    public static void main(String[] args) {
        int[] arr= {0,1,3};
        System.out.println(missingNumber(arr));

    }
    static int missingNumber(int[]arr){
        int i =0;
        while(i< arr.length) {
            int correct = arr[i];
            if (correct < arr.length) {
                if (arr[correct] != arr[i]) swap(arr, i, correct);
                else i++;
            }else i++;

        }

        for (int j = 0; j <arr.length ; j++) {
            if(j!=arr[j]){
                return j;
            }
        }
        return arr.length;
    }

}
