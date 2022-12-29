package OOPs;

class Test {
    String name;
    int a;
    int f;
    Test(String name , int a){
        this.name =name;
        this.a =a;
    }

    public Test(String name, int a, int f) {
        this(name,a);
        this.f = f;
    }
}
class Test1{
    static String name;
    static int a;
   static {
       System.out.println("Static......");
        name = "Kuldeep";
        a = 12;
    }
     {
        System.out.println("Instance......");

    }

    @Override
    public String toString() {
        return "Test1{name:"+name + " a:"+a + " }";
    }
}

class SingleTon{
    private SingleTon(){

    }
    private static SingleTon instance;

    public static SingleTon getInstance(){
        if (instance==null){
            instance = new SingleTon();
        }
        return instance;
    }
}

public class Main {

    public static void main(String[] args) {
//        Test obj = new Test("Kuldeep",12,312);
//        System.out.println(obj.a);
//        Test1 obj1 = new Test1();
//        System.out.println(obj1.name);
//        System.out.println(obj1.a);
//        Test1 obj2 = new Test1();
//        System.out.println(obj1.name);
//        System.out.println(obj1.a);
//        System.out.println("____________________________________");
//        System.out.println(obj1);
        System.out.println("____________________________________");
        SingleTon obj3 = SingleTon.getInstance();
        SingleTon obj4 = SingleTon.getInstance();
        SingleTon obj5 = SingleTon.getInstance();
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj5);
        System.out.println("____________________________________");
    }

}
