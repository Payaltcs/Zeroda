package Assert;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class sample1 {
	@Test
	public void tc1() {
		Reporter.log("running tc1");
		String expR="hey";
		String actR="bey";
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(expR, actR);
		System.out.println("i am after fail verification");
		s.assertAll();
		
	}
	
	@Test
	public void tc2() {
		Reporter.log("hey hello");
	}
	
	

}
