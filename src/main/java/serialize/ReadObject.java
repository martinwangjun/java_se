package serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try(
            ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("src/main/java/serialize/obj_person.txt"));
            ){
            Person p1 = (Person)ois.readObject();
            System.out.println(p1.getName());
            System.out.println(p1.getAge());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
