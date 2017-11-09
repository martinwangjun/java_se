package collections;

/**
 * 为什么《阿里巴巴 Java 开发手册》P10上要写：
 * “只要重写 equals，就必须重写 hashCode。”
 * 
 * 对于集合来说，是按照hashCode来区分是否是同一对象的。
 * 
 * - 两个obj，如果equals()相等，hashCode()一定相等。
 * - 两个obj，如果hashCode()相等，equals()不一定相等
 *   （Hash散列值有冲突的情况，虽然概率很低）。
 *   
 * 在集合中，判断两个对象是否相等的规则是:
 * 1. 如果hashCode()相等，则查看第二步，否则不相等;
 * 2. 查看equals()是否相等，如果相等，则两obj相等，否则还是不相等。
 * 
 * @author martin.wang
 *
 */
public class SameKeyInCollectionDemo {

}
