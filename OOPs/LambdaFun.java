package OOPs;

public class LambdaFun {
    public static void main(String[] args) {
        Calculator sum = (a,b)->a+b;
        Calculator subtraction = (a,b)->a-b;
        Calculator product = (a,b)->a*b;
        Calculator division = (a,b)->a/b;
        Calculator expo = (a,b)->(int)Math.pow(a,b);

        System.out.println(op(5,12,sum));
        System.out.println(op(15,2,subtraction));
        System.out.println(op(25,2,product));
        System.out.println(op(25,2,division));
        System.out.println(op(5,2,expo));
    }

    public static int op(int a, int b , Calculator ref){
        return ref.cal(a, b);
    }
}

interface Calculator{
    int cal(int a,int b);
}