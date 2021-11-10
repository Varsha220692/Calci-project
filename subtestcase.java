package caclculator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class subtestcase {

	@Test
	public void subtest() {
		int expectedvalue=23329646;
		
		allmethod m=new allmethod();
		int actualvalue=m.subnumber(234823,-23094823 );
		
		Assert.assertEquals(expectedvalue, actualvalue);
					}

}
