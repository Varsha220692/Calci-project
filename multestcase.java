package caclculator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class multestcase {

	@Test
	public void multest() {
		
		int expectedvalue=222075;
		allmethod m=new allmethod();
		int actualvalue=m.mulnumber(423,525);
		
		Assert.assertEquals(expectedvalue, actualvalue);
		
		
	}

}
