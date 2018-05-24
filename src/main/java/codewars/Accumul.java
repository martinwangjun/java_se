package codewars;

public class Accumul {

    public static String accum(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    sb.append(new String().valueOf(s.charAt(i)).toUpperCase());
                } else {
                    sb.append(new String().valueOf(s.charAt(i)).toLowerCase());
                }
            }
            if (i != len - 1) {
                sb.append("-");
            }
        }
        return sb.toString();
    }
}
