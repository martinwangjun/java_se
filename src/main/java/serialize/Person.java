package serialize;

import java.io.Serializable;

public class Person implements Serializable{
    private static final long serialVersionUID = -4603531456761444367L;
    private String name;
    private int age;
    public Person(String name, int age) {
        System.out.println("有参数的构造器");
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
