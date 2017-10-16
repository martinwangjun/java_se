package innerclass;

interface Bear{
    void eat();
}

public class AnonymousInnerInterface {
    public static void main(String[] args) {
        Bear benny = new Bear() {
            @Override
            public void eat() {
                System.out.println("Eat something.");
            }
        };
        benny.eat();
    }
}
