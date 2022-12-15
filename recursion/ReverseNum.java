package recursion;

public class ReverseNum {
    static int sum= 0;
    public static void main(String[] args) {
        rev2(1234);
        System.out.println(sum);
        System.out.println("Rev :" + rev(1234));
    }

    static int rev1(int num){
        int digit = (int)(Math.log(num)) +1;
        return helper(num , digit);
    }

    private static int helper(int num, int digit) {
        if(num%10 == num) return num;
        int rem = num%10;
        return rem * (int)(Math.pow(10,digit-1)) + helper(num/10 ,digit - 1);
    }

    static void rev2(int num){
        if(num == 0) return ;
        int rem = num%10;
        sum =  sum*10 + rem;
        rev2(num/10);
    }

    static int rev(int n){
        int digits = (int) (Math.log10(n)) + 1;
        return hp( n , digits);
    }

    private static int hp(int n, int digits) {
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return  rem * (int)(Math.pow(10,digits-1)) + hp(n/10,digits-1);
    }
}
