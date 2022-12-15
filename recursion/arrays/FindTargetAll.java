package recursion.arrays;

import java.util.ArrayList;

public class FindTargetAll {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,4,123,32,34,4};
        ArrayList<Integer> ans = findTarget1(arr,4,0);
        System.out.println(ans);
    }

    private static ArrayList<Integer> findTarget(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index== arr.length) return list;
        if (arr[index]==target ) {
            list.add(index);
        }
        return findTarget(arr,target,index+1,list);
    }
    private static ArrayList<Integer> findTarget1(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index== arr.length) return list;
        if (arr[index]==target ) {
            list.add(index);
        }
        ArrayList<Integer> ans = findTarget1(arr,target,index+1);
        list.addAll(ans);
        return list;
    }
}
