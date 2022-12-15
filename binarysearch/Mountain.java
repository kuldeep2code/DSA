package binarysearch;

public class Mountain {
    public static void main(String[] args) {
        int[] arr ={0,2,1,0};
        int larger = search(arr);
        System.out.println(larger);
    }

    public static int search(int[] arr){

        int start =0;
        int end = arr.length-1;

        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid+1;
            }
        }
        return arr[start];
    }
}
