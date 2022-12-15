package practicequestion;

import java.util.Arrays;

public class PR {

    static {
        System.out.println("sdfgh");
    }
    static{
        System.out.println("Hello");
    }


    public static void main(String[] args) {
        String str ="Hello Ram";
        String str1 = new String("Hello Ram");
        System.out.println(str.equals(str1));
        System.out.println(str.length());
        if(str.startsWith("adm")){
            System.out.println("Not allowed");
        }else{
            System.out.println("Successfully created");
        }
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,7));
        System.out.println(Arrays.toString(str.getBytes()));
        String s = "Hello";
//        char[] arrr=new char[s.length()];
//        for (int i = s.length()-1; i>0 ; i--) {
//            char c = s.charAt(i);
//            System.out.print(c);
//        }
        StringBuffer x= new StringBuffer("ram");
        StringBuffer y= new StringBuffer("ram");
        System.out.println(x.equals(y));

        String a = new String("Ram");
        String b = new String("Ram");
        System.out.println(a.equals(b));

        String k = "a";
        System.out.println(Arrays.toString(k.getBytes()));
    }
}


