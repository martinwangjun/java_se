package codewars;

public class XO {

    public static boolean getXO(String str) {

        int x = 0;
        int o = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.toLowerCase().charAt(i) == 'o') {
                o++;
            }
            if(str.toLowerCase().charAt(i) == 'x') {
                x++;
            }
        }
        return x == o;
    }
}