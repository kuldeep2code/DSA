package sorting;

public class CyHardQue41 {

    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }


    static public int firstMissingPositive(int[] nums) {
        cycleSort(nums);
        for(int i = 0 ; i<nums.length; i++){
            if(nums[i]!=i+1) return i+1;
        }
        return nums.length+1;

    }
    static  void cycleSort(int[] arr){
        int i = 0;
        while ( i <arr.length){
            int correct = arr[i]-1;
            if(correct > 0 && arr[i]<=arr.length && arr[i]!=arr[correct]) swap(arr,i,correct);
            else i++;
        }
    }
    static  void swap(int[]arr , int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
