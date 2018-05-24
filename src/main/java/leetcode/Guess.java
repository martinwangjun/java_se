package leetcode;

abstract class Why {
    public abstract void printlnOne();
    public Object guess() {
        return new Answer();
    }
}

class Answer extends Why{
    @Override
    public void printlnOne() {
        System.out.println("Answer");
    }
}

public class Guess{
    public static void main(String[] args) {
        Answer answer = new Answer();
        System.out.println(answer instanceof Why);
        System.out.println(answer instanceof Answer);
        System.out.println((answer.guess()).getClass());
        System.out.println(((Why)answer.guess()).getClass());
        
        ((Why)answer.guess()).printlnOne();
    }
}
