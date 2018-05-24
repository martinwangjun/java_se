package codewars;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * 
 * @see https://www.codewars.com/kata/first-variation-on-caesar-cipher/train/java
 * 
 * @author martin.wang
 *
 */
public class CaesarCipher {
    private static final Logger LOGGER = Logger.getLogger(CaesarCipher.class);

    public static List<String> movingShift(String s, int shift) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + (c + shift - 'a') % 26);

            }
            if (c >= 'A' && c <= 'Z') {
                c = (char) ('A' + (c + shift - 'A') % 26);
            }
            sb.append(c);
            shift++;
        }
        String sentence = sb.toString();
        sentence.indexOf(" ");
//        List<String> list = new ArrayList<>();
//        String[] words = sb.toString().split(" ");
//        int len = words.length;
//        int partSize = (len % 5 == 0 ? len % 5 : len % 5 + 1);
//        sb = new StringBuilder();
//        for (int i = 0; i < words.length; i++) {
//            if (len >= partSize) {
//                sb.append(words[i]);
//                if(1 % partSize == 0) {
//                    list.add(sb)
//                }
//            } else {
//                
//            }
//        }
        
        return null;
    }

    public static String demovingShift(List<String> s, int shift) {
        StringBuilder sb = new StringBuilder();
        s.forEach(str -> sb.append(str));
        return sb.toString();
    }

}