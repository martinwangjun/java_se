package codewars;

public class School {

    public static int getAverage(int[] marks) {
        int sum = 0;
        int len = marks.length;
        for (int i = 0; i < len; i++) {
            sum += marks[i];
        }
        return sum/len;
    }

}