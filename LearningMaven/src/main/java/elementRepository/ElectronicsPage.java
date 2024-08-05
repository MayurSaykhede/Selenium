package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends BasePage {

	public ElectronicsPage(WebDriver driver) {
		super(driver);
	}

	// Declaration
	@FindBy(xpath = "//img[@title='Show products in category Camera, photo']")
	private WebElement cameraAndPhotoLink;
	
	@FindBy(xpath = "//img[@title='Show products in category Cell phones']")
	private WebElement cellPhoneLink;

	// Utilization
	public WebElement getCameraAndPhotoLink() {
		return cameraAndPhotoLink;
	}

	public WebElement getCellPhoneLink() {
		return cellPhoneLink;
	}
	
	

}
