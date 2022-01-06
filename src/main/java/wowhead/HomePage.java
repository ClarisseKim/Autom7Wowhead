package wowhead;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	// Locators
	
	@FindBy(css = "#onetrust-accept-btn-handler")
	private WebElement acceptCookieButton;

	@FindBy(css = ".notifications-dialog-buttons-decline")
	private WebElement rejectNotifButton;

	@FindBy(css = ".header-search > form:nth-child(1) > input:nth-child(1)")
	private WebElement searchField;
	
	@FindBy(css = ".live-search-icon-boss")
	private WebElement LardeurChoice;

	// Methods
	
	public void acceptCookie() {
		acceptCookieButton.click();
	}

	public void rejectNotif() {
		wait.until(ExpectedConditions.visibilityOf(rejectNotifButton));
		rejectNotifButton.click();
	}

	public ResultPage search(String text) {
		searchField.sendKeys(text);
		wait.until(ExpectedConditions.visibilityOf(LardeurChoice));
		LardeurChoice.click();
		return new ResultPage(this.driver);
	}
}
