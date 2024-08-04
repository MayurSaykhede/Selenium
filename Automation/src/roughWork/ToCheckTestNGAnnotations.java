package roughWork;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToCheckTestNGAnnotations {
	
	@Test(priority = 1)
	public void executeScript1() {
		Reporter.log("Executing Test Case 1", true);
	}
	
	@Test(priority = 0)
	public void executeScript2() {
		Reporter.log("Executing Test Case 2", true);
	}
	

}
