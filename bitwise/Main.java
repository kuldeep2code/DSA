package bitwise;

public class Main {
    public static void main(String[] args) {
//        int num = 5;
//        if(isOdd(num)) System.out.println("Odd");
//        else System.out.println("Even");
//        int n = num&111;
//        System.out.println(n);

//        int[] arr = {2,3,4,6,4,3,2};
//        System.out.println(unique(arr));

//        System.out.println(15&(1<<14));

        int[] nums ={4,3,2,7,8,2,3,1};
        int dup = 0;
        for (int n :
                nums) {
            int i = 0;
            dup  = dup^n;
        }
        for (int i = 0; i < nums.length; i++) {
            dup =dup^nums[i]^i ;
        }

        System.out.println(dup);
    }

    private static int unique(int[] arr) {
        int unique = 0;
        for (int n: arr) {
            unique = unique^n;
        }

        return unique;
    }

    private static boolean isOdd(int num) {
        int isOne = num&1;
        if(isOne ==1) return true;
        return false;
    }
}
