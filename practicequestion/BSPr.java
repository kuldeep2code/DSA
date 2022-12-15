package practicequestion;

//LeetCode Que--162 hard question
public class BSPr {
    public static void main(String[] args) {
        int[] arr = {2,10,20,50,60,70,80,90,50,40,30,15};
        int target = 15;
        System.out.println(arr[searchTargetInMountainArr(arr,target)]);
    }

    private static int searchTargetInMountainArr(int[] arr, int target){

        int peek = peekElement(arr);
        int firstTry = bSearch(arr,target,0,peek);
        int secondTry = bSearch(arr,target,peek+1,arr.length-1);
        if(firstTry != -1){
            return firstTry;
        }

        return secondTry;
    }


    public static int bSearch(int[] arr, int target , int start, int end){
        boolean isAcs = arr[start]<arr[end];

        while (start<=end){
            int mid = start + (end-start)/2;

            if(target == arr[mid]) return mid;

            if (isAcs) {
                if(arr[mid]<target) start = mid +1;
                else end = mid - 1;
            }else{
                if(arr[mid]>target) start = mid +1;
                else end = mid - 1;
            }
        }

        return -1;
    }

    public static int peekElement(int[] arr){

        int start = 0;
        int end = arr.length -1;

        while (start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start =mid+1;
            }


        }

        return start;
    }


}
