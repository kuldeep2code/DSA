package recursion;

public class Stream {
    public static void main(String[] args) {
        skip("","abccdacbd");
        System.out.println(skip1("abhinav"));
        System.out.println("____________________________________________________________________________");
        String s1 = "asdfghapplesdfghjk";
        String s2 = "dsapplesdapp";
        System.out.println(skipApple(s1));
        System.out.println(skipApple(s2));
        System.out.println(skipAppNotApple(s1));
        System.out.println(skipAppNotApple(s2));
    }
    public static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        if(up.charAt(0)=='a'){
            skip(p,up.substring(1));
        }else {
            skip(p+up.charAt(0) ,up.substring(1));
        }
    }

     public static String skip1(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.charAt(0)=='a'){
            return skip1(up.substring(1));
        }else {
            return  up.charAt(0)  + skip1(up.substring(1));

        }
    }
    public static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else {
            return  up.charAt(0)  + skipApple(up.substring(1));

        }
    }
    public static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app")&& !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }else {
            return  up.charAt(0)  + skipAppNotApple(up.substring(1));

        }
    }
}
