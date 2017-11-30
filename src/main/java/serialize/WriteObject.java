package serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        try(
            ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("src/main/java/serialize/obj_person.txt"));
            ){
            Person p1 = new Person("赵云", 18);
            oos.writeObject(p1);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
