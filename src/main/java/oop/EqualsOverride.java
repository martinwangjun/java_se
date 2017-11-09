package oop;

/**
 * Equal和==
 * 
 * @author martin.wang
 *
 */

// Kangaroo类的equals是故意弄成这样的，为了演示一个荒谬的结果
class Kangaroo{
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
class Shark{
    
}

public class EqualsOverride {
    public static void main(String[] args) {
        // 这里演示一个非常荒谬的结果
        Kangaroo kangaroo = new Kangaroo();
        Shark shark = new Shark();
        
        System.out.println(kangaroo.equals(shark));
        System.out.println(kangaroo.equals(new String("Kangaroo")));
    }
}
