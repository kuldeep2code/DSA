package bitwise;

public class RangeXor {
    public static void main(String[] args) {
        //xor between 4 to 20
        int s = 4;
        int e = 20;
        int ans = xor(e)^xor(s);
        System.out.println(ans);

    }
    public static int xor(int a){
        if(a%4==0) return a;
        if(a%4==1) return 1;
        if(a%4==2) return a+1;
        return 0;
    }
}
