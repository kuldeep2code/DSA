package practicequestion;

//public class Bool {
//    public static void main(String[] args) {
//        boolean x = (5-3)!=2;
//        System.out.println(x);
//        int y = ((0 < -5) ? 5 : 3);
//        System.out.println(y);
//    }
public class Bool {
    public static void main(String[] args) {
        int [] arr={ 5,5,5,6,7,3,4};
        System.out.println(arr[pivot(arr)+1]);
    }



    public static int pivot(int[] arr){

        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]) return mid;
            if(mid>start && arr[mid]<arr[mid-1]) return mid-1;

            if(arr[start] == arr[mid] && arr[start] == arr[end]){
                if(start<mid&&arr[start]>arr[start+1]) return start;
                start++;
                if(end>mid&&arr[end]<arr[end-1]) return end-1;
                end--;

            }else if(arr[start]<arr[mid]||(arr[start]==arr[mid]&&arr[mid] > arr[end])){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }

        return -1;
    }




}


