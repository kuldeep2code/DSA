package binarysearch;

public class S2 {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int m = 2;
        System.out.println(sp(arr,m));
    }

    public static int sp(int[] nums, int m){

        int start=0;
        int end = 0;

        for(int i:nums){
            start = Math.max(start,i);
            end = end+i;
        }

        while (start<end){
            int mid = start+(end-start)/2;
            int sum =0;
            int pieces =1;

            for (int num:nums){
                sum = sum+num;
                if(sum>mid){
                    pieces++;
                    sum=num;
                }

            }

            if(pieces>m){
                start = mid+1;
            }else end = mid;

        }


        return start;
    }

}
