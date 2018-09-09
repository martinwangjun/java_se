package basic;

import org.junit.Test;

import junit.framework.TestCase;

public class BoolSkillTest {
	@Test
	public void atLeastTwoTrue() {
		BoolSkill boolSkill = new BoolSkill();
		TestCase.assertTrue(boolSkill.atLeastTwoTrue(true, true, false));
		TestCase.assertTrue(boolSkill.atLeastTwoTrue(true, false, true));
		TestCase.assertFalse(boolSkill.atLeastTwoTrue(true, false, false));
		TestCase.assertFalse(boolSkill.atLeastTwoTrue(false, false, false));
	}
}
