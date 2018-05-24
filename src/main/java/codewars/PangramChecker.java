package codewars;

//import java.util.HashSet;
//import java.util.Set;

public class PangramChecker {
    public boolean check(String sentence) {
        // Set<Character> set = new HashSet<>();
        // sentence = sentence.toLowerCase();
        // for (int i = 0; i < sentence.length(); i++) {
        // char c = sentence.charAt(i);
        // if(c >= 'a' && c <= 'z') {
        // set.add(c);
        // }
        // }
        // return set.size() == 26;
        for (char c = 'a'; c <= 'z'; c++) {
            if (!sentence.toLowerCase().contains("" + c)) {
                return false;
            }
        }
        return true;
    }
}