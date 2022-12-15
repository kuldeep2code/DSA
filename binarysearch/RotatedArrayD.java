package binarysearch;

public class RotatedArrayD {
    public static void main(String[] args) {
        int[] arr= {12,14,1,2,3,4,5,8,9};
        int target = 9;
        System.out.println(search(arr,target));
    }
    public static int search(int[] arr, int target){

        int pivot = pivot(arr);
        if(pivot==-1){
            return bSearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target) return pivot;
        if(arr[0]<=target) return bSearch(arr,target,0,pivot-1);
        return bSearch(arr,target,pivot+1,arr.length-1);
    }

    public static int bSearch(int[] arr, int target , int start , int end){
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<target){
                start = mid+1;
            } else if (arr[mid]>target) {
                end= mid-1;
            } else return mid;
        }
        return -1;
    }

    public static int pivot(int[] arr){

        int start = 0;
        int end = arr.length -1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]) return mid;
            if(mid> start && arr[mid]<arr[mid-1]) return mid-1;
            if(arr[start]>arr[mid]){
                end = mid-1;
            }else start = mid+1;
        }


        return -1;
    }




}
