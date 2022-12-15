package maths;

public class NewtonSQRT {
    public static void main(String[] args) {
        int  n = 40;
        System.out.println(NewtonSQRT(n));
    }
    static double NewtonSQRT(double n){
        double x = n;
        double root;
        while (true){
            root = 0.5 * (x + n/x);
            if(Math.abs(root-x) < 1) break;
            x =root;
        }
        return root;
    }
}
