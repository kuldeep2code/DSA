package OOPs.generics.comparing;

import java.util.Arrays;

public class User implements Comparable<User>{
    private int userId;
    private float userSalaryDollar;

    public User(int userId, float userSalaryDollar) {
        this.userId = userId;
        this.userSalaryDollar = userSalaryDollar;
    }

    @Override
    public int compareTo(User o) {
        int diff =  (int) (this.userSalaryDollar - o.userSalaryDollar);
        return diff;
    }

    @Override
    public String toString() {
        return  " "  + userSalaryDollar;
    }
    public static void main(String[] args) {
        User Kuldeep = new User(501,5000.45f);
        User Ravi = new User(502,5850.75f);
        User Nikhil = new User(503,2850.75f);
        User Mohit = new User(504,3850.75f);
        User Hemant = new User(505,4850.75f);

//        if (Kuldeep.compareTo(Ravi) < 0){
//            System.out.println("Ravi has more salary");
//        }


        User[] list = {Kuldeep,Ravi,Hemant,Mohit,Nikhil};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
