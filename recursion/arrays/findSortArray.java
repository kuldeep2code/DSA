package recursion.arrays;

public class findSortArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1};
        System.out.println(findSort(arr,0));
    }

    private static boolean findSort(int[] arr, int index) {
        if (index == arr.length-1) return true;
        if (arr[index]<arr[index+1] && findSort(arr,index+1)){
            return true;
        }else{
            return false;
        }
    }
}
