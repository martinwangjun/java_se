package basic;

/**
 * 布尔运算的技巧 
 * 
 * @author martin.wang
 */
public class BoolSkill {
	
	/**
	 * 三个条件中，至少有2个以上是true，才返回true才返回true。
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public boolean atLeastTwoTrue(boolean a, boolean b, boolean c) {
		return a == b ? a : c;
	}
	
}
