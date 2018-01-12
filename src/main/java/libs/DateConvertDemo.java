package libs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateConvertDemo {
    public static void main(String[] args) {
        Date date = new Date();

        // 日期转字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(date));
        sdf = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(sdf.format(date));

        // 字符串转日期
        String dateString1 = "2017-11-11 13:22:33";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            date = sdf1.parse(dateString1);
        } catch (ParseException e) {
            date = new Date();
        }
        System.out.println(date);

        // 新建一个指定日期并输出
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, 11, 1, 0, 0, 0);
        date = calendar.getTime();
        System.out.println(sdf.format(date));
    }
}
