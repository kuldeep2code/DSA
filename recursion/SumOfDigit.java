package recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(1235));
    }
    public  static int sumOfDigit(int num){
        if (num==0) return 0;
        return num%10 + sumOfDigit(num/10);
    }

}
