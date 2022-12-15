package linearsearch;

public class LeetCodeQ1 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
        System.out.println(digit2(-84455));
    }

    static int findNumbers(int[] nums){
        int count =0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }



    static boolean even(int num){
        int numOfDigit = digits(num);
        if(numOfDigit % 2 ==0){
            return true;
        }
        return false;
    }


    static int digits(int num){
        int count =0;

        if(num<0){
            num = num*-1;
        }

        if(num ==0){
            count++;
        }
        while (num>0){
            count++;
            num = num/10;
        }
        return count;
    }

    static int digit2(int num){
        if(num<0){
            num = num*-1;
        }
        return (int)(Math.log10(num))+1;
    }
}
