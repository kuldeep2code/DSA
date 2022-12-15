package binarysearch;

public class InfiniteArray {

    public static void main(String[] args) {
         int[] arr ={12,56,87,89,96,100,213,354,564,879,988};
         int target = 879;
        System.out.println("Index of target element is: "+ ans(arr,target));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while (target>arr[end]){
            int newStart = end+1;
            end = end+ (end-start +1)*2;
            start = newStart;
        }


        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr, int target,int start,int end){

        while (start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]) end = mid-1;
            else if (target > arr[mid]) start = mid-1;
            else  return mid;
        }
        return -1;
    }
}
