package testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtils.BaseClass;

@Listeners(GenericUtils.BaseClass.class)
public class DWS001 extends BaseClass {

	@Test
	public void verify_a_product_can_be_added_to_the_cart() {
		lp.getElectronicsLink().click();
		ep.getCellPhoneLink().click(); 	
	}

}
