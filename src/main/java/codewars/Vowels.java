package codewars;

public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        for(int i = 0; i < str.length(); i++) {
            char letter = str.toLowerCase().charAt(i);
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

}
