package testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtils.BaseClass;

@Listeners(GenericUtils.BaseClass.class)
public class DWS002 extends BaseClass {
	
	@Test
	public void verify_user_is_able_to_add_a_product_to_wishlist() {
		System.out.println("Hello!!!");
	}
	

}
