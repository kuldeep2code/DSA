package bitwise;

public class NumOfSetBit {
    public static void main(String[] args) {
        int n = 45;
//        System.out.println(Integer.toBinaryString(n));
//        System.out.println(Integer.toBinaryString(-n));
        

        int count = 0;
//        while (n>0){
//            count++;
//            n = n-(n & -n);
//        }
//
        while(n>0){
            count++;
            n= n&(n-1);
        }

        System.out.println(count);
    }
}
