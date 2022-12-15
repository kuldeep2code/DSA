package linearsearch;

public class LeetCodeQ2 {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,9},
                {6,9,4},
                {9,8,1}
        };
        int w = maxWealth(arr);
        System.out.println(w);
    }

    private static int maxWealth(int[][] arr) {
        int ans = Integer.MIN_VALUE;

        for (int customer = 0; customer < arr.length; customer++) {
            int sum =0;
            for (int accounts = 0; accounts < arr[customer].length; accounts++) {
                sum += arr[customer][accounts];
            }
            ans = sum;
        }


        return ans;
    }
}
