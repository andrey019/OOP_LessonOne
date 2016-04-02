/**
 * Created by 7 on 02.04.2016.
 */
public class ClassCount {
    static int objectNumber;

    ClassCount(){
        objectNumber++;
    }

    public int getObjectNumber(){
        return objectNumber;
    }

    public static void main(String[] args){
        ClassCount obj1 = new ClassCount();
        ClassCount obj2 = new ClassCount();
        ClassCount obj3 = new ClassCount();

        System.out.print("Created objects: " + obj1.getObjectNumber());
    }
}
