package codewars;

import static org.junit.Assert.*;
import org.junit.Test;

public class LongestConsecTest {

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test() {
        System.out.println("longestConsec Fixed Tests");
        testing(LongestConsec.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2), "abigailtheta");
        testing(LongestConsec.longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1), "oocccffuucccjjjkkkjyyyeehh");
        testing(LongestConsec.longestConsec(new String[] {}, 3), "");
        testing(LongestConsec.longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2), "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
        testing(LongestConsec.longestConsec(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2), "wlwsasphmxxowiaxujylentrklctozmymu");
        testing(LongestConsec.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2), "");
        testing(LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3), "ixoyx3452zzzzzzzzzzzz");
        testing(LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15), "");
        testing(LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 0), "");
    }
    
    @Test
    public void Check_Positive_Values()
    {
        assertEquals(17, LongestConsec.maxTriSum(new int[]{3,2,6,8,2,3}));
        assertEquals(32, LongestConsec.maxTriSum(new int[]{2,9,13,10,5,2,9,5}));
        assertEquals(18, LongestConsec.maxTriSum(new int[]{2,1,8,0,6,4,8,6,2,4}));
    }
    @Test
    public void Check_Negative_Values()
    {
        assertEquals(-9, LongestConsec.maxTriSum(new int[]{-3,-27,-4,-2,-27,-2}));
        assertEquals(-33, LongestConsec.maxTriSum(new int[]{-14,-12,-7,-42,-809,-14,-12}));
    }
    @Test
    public void Check_Mixture_Values()
    {
        assertEquals(232, LongestConsec.maxTriSum(new int[]{-13,-50,57,13,67,-13,57,108,67}));
        assertEquals(41, LongestConsec.maxTriSum(new int[]{-7,12,-7,29,-5,0,-7,0,0,29}));
    }
}