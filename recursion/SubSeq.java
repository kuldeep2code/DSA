package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSeq {
    public static void main(String[] args) {
        seq("","abc");
        System.out.println();
        ArrayList<String> str = new ArrayList<>();
        seq1("","abc",str);
        System.out.println(str);
        ArrayList<String> ss = seqRet("","abc");
        System.out.println(ss);

        //Subset
        int[] arr= {1,2,3,4};
        System.out.println(subSet(arr));
    }
    public static void seq(String p , String up){
        if (up.isEmpty()){
            System.out.print(p+", ");
            return;
        }
        char ch = up.charAt(0);
        seq(p+ch,up.substring(1));
        seq(p,up.substring(1));
    }

    public static ArrayList<String> seq1(String p , String up,ArrayList<String> str){
        if (up.isEmpty()){
            str.add(p);
            return str;
        }
        char ch = up.charAt(0);
        seq1(p+ch,up.substring(1),str);
        seq1(p,up.substring(1),str);
        return str;
    }
    public static ArrayList<String> seqRet(String p , String up){
        if (up.isEmpty()){
            ArrayList<String> al = new ArrayList<>();
            al.add(p);
            return al;
        }
        char ch = up.charAt(0);
        ArrayList<String>left = seqRet(p+ch,up.substring(1));
        ArrayList<String>right = seqRet(p,up.substring(1));
        left.addAll(right);
        return left;
    }

    //By iteration
    static List<List<Integer>> subSet(int[]arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int m :
                arr) {
            int n= outer.size();
            for (int i = 0; i <n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(m);
                outer.add(internal);
            }
        }
        return outer;
    }
}
