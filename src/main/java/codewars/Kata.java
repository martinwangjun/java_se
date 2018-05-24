package codewars;

import java.util.Arrays;

public class Kata {
    public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
        int[] lenArray = new int[arrayOfArrays.length];
        for (int i = 0; i < arrayOfArrays.length; i++) {
            lenArray[i] = arrayOfArrays[i].length;
        }
        Arrays.sort(lenArray);
        for (int i = 1; i < lenArray.length; i++) {
            if(lenArray[i-1] + 1 != lenArray[i]) {
                return i;
            }
        }
        return 0;
    }
}