package codewars;

import java.util.ArrayList;
import java.util.List;

public class SqInRect {
    
    public static List<Integer> sqInRect(int lng, int wdth) {
        List<Integer> list = new ArrayList<>();
        int area = lng * wdth;
        if(lng == wdth) {
            return null;
        }
        while (area > 0) {
            if(lng > wdth) {
                area -= wdth * wdth;
                list.add(wdth);
                lng -= wdth;
            } else {
                area -= lng * lng;
                list.add(lng);
                wdth -= lng;
            }
        }
        return list;
    }
}

