package basic;

public class DoubleTest {
    public static void main(String[] args) {
        String str = "6435546875";
        Double res = 0.0;
        System.out.println(res); // 打印出来是0.0
        Double tens = 1.0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            tens = tens / 10;
            res = res + (c - '0') * tens;
            System.out.print("c - '0' = " + (c - '0') + "\t");
            System.out.print("tens = " + tens + "\t");
            System.out.println("res = " + res);
        }
        System.out.println(res);
    }
}
