package OOPs.generics;

import java.util.Arrays;
import java.util.List;

public class WildCardExample<T extends Number>{

    private Object[] data;
    private static int DEFAULT_SIZE =10;
    private int size = 0;

    public WildCardExample(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp =  new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] =  data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size== data.length;
    }

    public T remove(){
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int index){
        return (T) data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index , T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        //Now only Number and its subclasses can pass , String and other things not working here
        WildCardExample<Float> list = new WildCardExample<>();
        list.add(12.5f);
        list.add(13.5f);
        list.add(14.5f);
        list.add(15.5f);

//        ArrayList list1= new ArrayList<>();
        System.out.println(list);
    }

    //another example of wildCard
    public void getList(List<? extends Number> list){
        //Some operation
    }
}
