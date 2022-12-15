package practicequestion;


public class Recurrsion {
    public static void main(String[] args) {
        ginTI(10);
    }
    public static void ginTI(int n){
        if(n>0){
            ginTI(n-1);
            System.out.println(n);
        }
    }
}