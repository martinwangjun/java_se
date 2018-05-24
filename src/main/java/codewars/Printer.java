package codewars;

public class Printer {
    
    public static String printerError(String s) {
        return s.toLowerCase().replaceAll("[a-m]", "").length() + "/" + s.length();
//        int len = s.length();
//        int err = 0;
//        s = s.toLowerCase();
//        for (int i = 0; i < len; i++) {
//            if(s.charAt(i) > 'm') {
//                err++;
//            }
//        }
//        return err + "/" + len;
    }
}
