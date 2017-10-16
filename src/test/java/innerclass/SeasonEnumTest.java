package innerclass;

import org.junit.Test;

/**
 * 枚举类
 * 
 * 这里演示一下最简单的枚举类
 * 
 * @author martin.wang
 *
 */
public class SeasonEnumTest {
    
    @Test
    public void test() {
        for(SeasonEnum s: SeasonEnum.values()) {
            System.out.println(getSeason(s));
        }
    }
    
    public static String getSeason(SeasonEnum season) {
        String seasonName = "";
        switch (season) {
        case SPRING:
            seasonName = "春天";
            break;
        case SUMMER:
            seasonName = "夏天";
            break;
        case AUTUMN:
            seasonName = "秋天";
            break;
        case WINTER:
            seasonName = "冬天";
            break;
        default:
            break;
        }
        return seasonName; 
    }
    
}
