package recursion.arrays;

public class FindTarget {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1};
        System.out.println(findTarget(arr,5,0));
    }

    private static boolean findTarget(int[] arr,int target, int index) {
        if(index== arr.length) return false;
        if (arr[index]==target || findTarget(arr,target,index+1)) return true;
        else{
            return false;
        }
    }
}
