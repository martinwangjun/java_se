package innerclass;

abstract class Pig{
    public abstract void eat();
    public void sleep() {
        System.out.println("Zzz");
    }
}

public class AnonymousInnerAbstract {
    public static void main(String[] args) {
        Pig penny = new Pig() {
            @Override
            public void eat() {
                System.out.println("Yummy");
            }
        };
        penny.eat();
        penny.sleep();
    }
}
