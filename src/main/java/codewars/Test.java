package codewars;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        set.add("abc".charAt(1));
        set.add("abc".charAt(1));
        set.forEach(obj->System.out.println(obj));
    }
}
