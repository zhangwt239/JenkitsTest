package newTest;

import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.apache.commons.math3.stat.descriptive.rank.Min;
import org.apache.commons.math3.stat.descriptive.summary.Sum;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterMethod;


public class myTest{
	@Test
	public void testMin() {
		double[] values = new double[] {0.33, 1.22, 3.33, 8.0, 0.1, 0.766 };
		Min min = new Min();
		double min1 = min.evaluate(values);
		//System.out.print(min.evaluate(values));
		double expected = 0.1;
		assertEquals(expected, min1, 0);
	}
	
	@Test
	public void testMax() {
		double[] values = new double[] {0.33, 1.22, 3.33, 8.0, 0.1, 0.766 };
		Max max = new Max();
		double max1 = max.evaluate(values);
		//System.out.print(max.evaluate(values));
		double expected = 8.0;
		assertEquals(expected, max1, 0);
	}
	
	@Test
	public void testSum() {
		double[] values = new double[] {0.33, 1.22, 3.33, 8.0, 0.1, 0.766 };
		Sum sum = new Sum();
		double sum1 = sum.evaluate(values);
		//System.out.print(sum.evaluate(values));
		double expected = 13.745999999999999;
		assertEquals(expected, sum1, 0);
	}
	
}