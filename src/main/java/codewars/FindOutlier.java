package codewars;

import org.apache.log4j.Logger;

public class FindOutlier {
    private static final Logger LOGGER = Logger.getLogger(FindOutlier.class);
    static int find(int[] integers) {
        int even = 0;
        int odd = 0;
        int evenPosition = -1;
        int oddPosition = -1;
        int rv = 0;
        for (int i = 0; i < integers.length; i++) {
            if(Math.abs(integers[i]) % 2 == 1) {
                odd++;
                oddPosition = i;
            } else {
                even++;
                evenPosition = i;
            }
        }
        
        LOGGER.info(even + " " + odd + " " + evenPosition + " " + oddPosition);
        return even > odd ? integers[oddPosition] : integers[evenPosition];
    }
}