package libs;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderDemo {
    public static void main(String[] args) {
        // 新建一下指定日期
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, 11, 1, 0, 0, 0);
        Date date = new Date();
        date = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(date));
    }
}
