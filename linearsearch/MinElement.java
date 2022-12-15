package linearsearch;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {584854, 9742465, 56312, 445564, 242545, 52563, 456456, 245456, 465623, 54556, 23563, 24685};
        int min = minElement(arr);
        System.out.println(min);
    }
    static int minElement(int[] arr ){
        int min = arr[0];
        for(int i =1; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
