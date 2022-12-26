package practicequestion;



public class Mohit{
    public static void main(String[] args) {
        number(1);
    }

    static void number(int num){
        if(num==5){
            return;
        }
        System.out.println(num);
        number(++num);
    }

}
