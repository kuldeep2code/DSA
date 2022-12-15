package recursion;

public class FiboLinearRec {
    public static void main(String[] args) {
//        System.out.println(fibo(50));
        for (int i = 0; i < 11; i++) {
            System.out.println(fibFormula(i));
        }
//        System.out.println(fibFormula(50));
    }
    static int fibo(int n){
        if(n<2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

//    fibonacci time complexity is O(((1+ sqrt(5))/2)^n)
//    fib formula
    static long fibFormula(int n){
//       return  (long) ((Math.pow(((1 + Math.sqrt(5)) / 2) , n) - Math.pow(((1 - Math.sqrt(5)) / 2 ), n)) / Math.sqrt(5));
       return  (long) Math.round((Math.pow(((1 + Math.sqrt(5)) / 2) , n) / Math.sqrt(5)));
    }
}
