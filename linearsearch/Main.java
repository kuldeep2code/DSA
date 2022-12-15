package linearsearch;

public class Main {
    public static void main(String[] args) {
        int[] numbers ={45,65,23,51,63,456,564,652};
        int target = 89;
        int index = linearSearch(numbers,target);
//        if(index==-1){
//            System.out.println("Element is not found");
//        }
//        else {
//            System.out.println("Element is found on the index: "+ index);
//        }
//        System.out.println(linearSearch1(numbers,target));
    }
    //search in array
    //return index if item found or -1
    static int linearSearch(int[] arr,int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (target == element) {
                return i;
            }
        }
        return -1;
    }

    //return element
    static int linearSearch1(int[] arr,int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (target == element) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
}
