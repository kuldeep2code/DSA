package OOPs.exception;

public class Main {
    public static void main(String[] args) {
        int a =9;
        int b = 0;
        try{
            divide(a ,b);
        }catch (Exception e){
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        divide(78,0);

    }

    private static int divide(int a, int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("Please don't divide by zero");
        }
        return a/b;
    }
}
