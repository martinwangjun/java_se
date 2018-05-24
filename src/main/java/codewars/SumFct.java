package codewars;

import java.math.BigInteger;

public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);
        if(n.compareTo(BigInteger.ZERO) == 0) {
            return BigInteger.valueOf(4);
        }
        if(n.compareTo(BigInteger.ONE) == 0) {
            return BigInteger.valueOf(8);
        }
        for(BigInteger i = BigInteger.ZERO;
                i.compareTo(n) <= 0;
                i = i.add(BigInteger.ONE)) {
            BigInteger current = a.add(b);
            sum = sum.add(a);
            a = b;
            b = current;
        }
        return sum.multiply(BigInteger.valueOf(4));
    }
}