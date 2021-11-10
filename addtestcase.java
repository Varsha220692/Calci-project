package caclculator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;


public class addtestcase {

	@Test
	public void addtest() {
		int expectedvalue=111111;
		allmethod m=new allmethod();
		int actualvalue= m.addnumber (-234234, 345345);
		
		Assert.assertEquals(expectedvalue, actualvalue);
		
	}

}

