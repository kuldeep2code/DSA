package binarysearch;

public class BinaryS {
    public static void main(String[] args) {
        int[] arr = {-90,-45,-3,0,9,18,28,92,100};
        int target = 28;
        int index = binarySearch1(arr,target);
        System.out.println("Element is found on the index: "+index);
    }

    private static int binarySearch1(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }


        return -1;
    }
}
