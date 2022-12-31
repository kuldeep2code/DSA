package OOPs;

public class CloneObject implements Cloneable{
    String name;
    Integer age;

    public CloneObject(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneObject cloneObject = new  CloneObject("Kuldeep",20);
        CloneObject cloneObject1 = (CloneObject) cloneObject.clone();
        System.out.println(cloneObject1.age);
        System.out.println(cloneObject1.name);
        cloneObject1.age=30;
        cloneObject1.name="Ravi";
        System.out.println(cloneObject1.age);
        System.out.println(cloneObject1.name);

        System.out.println(cloneObject.age);
        System.out.println(cloneObject.name);

    }
}
