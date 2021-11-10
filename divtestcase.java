package caclculator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class divtestcase {

	@Test
	public void divtest() {
		int expectedvalue=20;
		allmethod m=new allmethod();
		int actualvalue=m.divnumber(4000,200);
		
       Assert.assertEquals(expectedvalue,actualvalue);
	}

}
