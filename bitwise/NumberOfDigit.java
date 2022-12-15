package bitwise;

public class NumberOfDigit {
    public static void main(String[] args) {
        int n = 45;
        int base = 2;

        int ans = (int) (Math.log(n)/Math.log(base)) + 1;

        System.out.println(ans);

        //Pascal's triangle
        int nth = 7;
        int sol = 1<<(nth-1);
        System.out.println(sol);

        //power of 2
        int number = 0;
        //note:- number = 0 is exception so fix it for number = 0
        boolean answer = (number&(number-1))==0;
        if(number==0)  answer=false;
        System.out.println(answer);

//        System.out.println(110>>1);
    }
}
