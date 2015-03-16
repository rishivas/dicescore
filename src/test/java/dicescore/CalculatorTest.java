package dicescore;

import junit.framework.Assert;

import org.junit.Test;

public class CalculatorTest {

	public CalculatorTest() {
	}

	@Test
	public final void testMain() {
		Assert.assertEquals(70, Calculator.calculate(new String[] {"1", "1", "2", "6"}));
	}
	
	@Test
	public final void testMainThreeOnes() {
		Assert.assertEquals(800, Calculator.calculate(new String[] {"1", "1", "1", "2"}));
	}
	
	@Test
	public final void testMainThreeTwos() {
		Assert.assertEquals(220, Calculator.calculate(new String[] {"2", "2", "2", "1"}));
	}
	
	@Test
	public final void testMainThreeThrees() {
		Assert.assertEquals(330, Calculator.calculate(new String[] {"3", "3", "3", "6"}));
	}
	
	@Test
	public final void testMainThreeFours() {
		Assert.assertEquals(400, Calculator.calculate(new String[] {"4", "4", "4", "4"}));
	}
	
	@Test
	public final void testMainThreeFives() {
		Assert.assertEquals(530, Calculator.calculate(new String[] {"5", "5", "5", "6"}));
	}
	
	@Test
	public final void testMainThreeSixess() {
		Assert.assertEquals(1030, Calculator.calculate(new String[] {"6", "6", "6", "6"}));
	}
	
	@Test
	public final void testMainFourOnes() {
		Assert.assertEquals(820, Calculator.calculate(new String[] {"1", "1", "1", "1"}));
	}

}
