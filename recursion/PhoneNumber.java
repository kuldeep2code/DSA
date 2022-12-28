package recursion;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {
    public static void main(String[] args) {
        System.out.println(phoneNumberr("", "23"));
    }
    public static List<String> phoneNumberr(String p, String up){
            if(up.isEmpty()){
                List<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
        List<String> list = new ArrayList<>();
            int digit = up.charAt(0) - '0';
            if(digit==7){
                for (int i = (digit-1)*3; i < digit*3 + 1; i++) {
                    char ch = (char) ('a' + i -3);
                    list.addAll(phoneNumberr(p+ch, up.substring(1)));
                }
            } else if (digit==9) {
                for (int i = (digit-1)*3; i < digit*3 + 1; i++) {
                    char ch = (char) ('a' + i -2);
                    list.addAll(phoneNumberr(p+ch, up.substring(1)));
                }
            } else if (digit==8) {
                for (int i = (digit-1)*3; i < digit*3; i++) {
                    char ch = (char) ('a' + i -2 );
                    list.addAll(phoneNumberr(p+ch, up.substring(1)));
                }
            } else {
                for (int i = (digit - 1) * 3; i < digit * 3; i++) {
                    char ch = (char) ('a' + i - 3);
                    list.addAll(phoneNumberr(p + ch, up.substring(1)));
                }
            }
            return list;
    }

}
