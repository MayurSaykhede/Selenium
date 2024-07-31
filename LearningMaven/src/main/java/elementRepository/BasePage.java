package elementRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtils.BaseClass;

public class BasePage extends BaseClass {
	
	/**
	 * Declaration
	 */
	@FindBy(partialLinkText = "Register")
	private WebElement registerLink;
	
	@FindBy(partialLinkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;
	
	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishlistLink;
	
	@FindBy(xpath = "//input[@id='small-searchterms']")
	private WebElement searchbarBox;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement booksLink; 
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computersLink; 
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicsLink;
	
	@FindBy(partialLinkText = "APPAREL & SHOES")
	private WebElement apparelAndShoesLink;
	
	@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
	private WebElement digitalDownloadsLink;
	
	@FindBy(partialLinkText = "JEWELRY")
	private WebElement jewelryLink;
	
	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement giftCardsLink;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
	
	
	/**
	 * 
	 * Getters 
	 * 
	 * Utilization
	 * 
	 */
	
	
	/**
	 * this method is used to access the register link of Demo Web Shop
	 * @return WebElement 
	 */
	
	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getSearchbarBox() {
		return searchbarBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getApparelAndShoesLink() {
		return apparelAndShoesLink;
	}

	public WebElement getDigitalDownloadsLink() {
		return digitalDownloadsLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	
	/**
	 * Initialization
	 * 
	 * @param driver --> It accepts WebDriver type of reference
	 */
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
