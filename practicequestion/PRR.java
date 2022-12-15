package practicequestion;

class ex {
    public int sum(int a , int b){
        return  a+b;
    }
    public  int sum(int a,int b , int c){
        return a+b+c;
    }
}


public  class PRR {
    public static void main(String[] args) {
        ex obj = new ex();
        System.out.println(obj.sum(12,13));
        System.out.println(obj.sum(12,13,12));

    }
}
