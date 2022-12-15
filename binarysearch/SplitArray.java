package binarysearch;

public class SplitArray {
    public static void main(String[] args) {
        int[] nums ={7,2,5,8,10};
        int m =2;
        System.out.println(ans(nums,m));
    }
    public static int ans(int[] nums, int m){

        int start=0;
        int end=0;
        for (int j : nums) {
            start = Math.max(start, j);
            end += j;
        }

        while (start<end){
            int mid = start+(end-start)/2;

            int sum = 0;
            int pieces =1;

            for (int num:nums){
                if (sum+num>mid){
                    sum = num;
                    pieces++;
                }else {
                    sum += num;
                }
            }

            if(pieces>m){
                start=mid+1;
            }else{
                end=mid;
            }

        }
        return start;
    }
}
