package practicequestion;

import java.util.Arrays;

public class ArrayQue {
    public static void main(String[] args) {
        int[] myArr= {4,3,7,8,6,2,1};


        for(int i = 0; i< myArr.length-1 ; i++){

            if(i%2==0) {
                if (myArr[i] > myArr[i + 1]) {
                    int temp = myArr[i];
                    myArr[i] = myArr[i + 1];
                    myArr[i+1] = temp;
                }
            } else{
                if(myArr[i] < myArr[i+1]){
                    int temp = myArr[i];
                    myArr[i] = myArr[i + 1];
                    myArr[i+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(myArr));




    }


}

