package array;

import java.util.Arrays;
import java.util.List;

public class FixSizeList {
    public static void main(String[] args) {
        List<String> topFivePowerFixedList = Arrays.asList(
                "USA", "Russia", "UK", "France", "China");
        System.out.println(topFivePowerFixedList.get(1));
        System.out.println(topFivePowerFixedList.getClass());
    }
}
