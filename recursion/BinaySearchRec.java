package recursion;

public class BinaySearchRec {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,32,45,86};
        int target = 45;
        System.out.println(bSearch(arr,target,0, arr.length-1));
    }

    static int bSearch(int[] arr, int target , int s , int e){
        if (s>e) return -1;
        int mid = s + (e - s)/2;
        if (arr[mid]==target) return mid;
        if (arr[mid]<target) return bSearch(arr,target ,mid+1,e);
        return bSearch(arr,target,s,mid-1);
    }
}