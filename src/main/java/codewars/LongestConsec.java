package codewars;

public class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        int n = strarr.length;
        String returnStr = "";
        if(n==0 || k <= 0 || k > n) {
            return "";
        }
        int[] lenArr = new int[n];
        int maxStart = 0;
        int max = 0;
        int temp = 0;
        
        for (int i = 0; i < n; i++) {
            lenArr[i] = strarr[i].length();
        }
        for (int i = 0; i < n; i++) {
            temp = 0;
            for(int j = i; j < ((i + k) < n ? (i + k):n); j++) {
                temp += lenArr[j];
            }
            if(max < temp) {
                max = temp;
                maxStart = i;
            }
        }
        
        for (int i = maxStart; i < ((maxStart + k) < n ? (maxStart + k) : n); i++) {
            returnStr += strarr[i];
        }
        
        return returnStr;
    }
    
    public static int maxTriSum (int[] numbers)
    {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if(numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        int max = 0;
        int counter = 0;
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i-1] != numbers[i] && counter < 3) {
                max += numbers[i - 1];
                counter++;
            }
        }
        return max;
    }
    
}
