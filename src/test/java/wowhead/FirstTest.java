package wowhead;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeEach
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void run() {
		driver.get("https://fr.wowhead.com/");
		
		HomePage homePage = new HomePage(driver);
		
		homePage.acceptCookie();
		homePage.rejectNotif();
		ResultPage resultPage = homePage.search("Lardeur");
		
		String chahuteurDeCadavresStats = resultPage.getBootsStats();
		assertEquals(chahuteurDeCadavresStats, "Chahuteurs de cadavre\r\n"
				+ "Niveau d'objet 57\r\n"
				+ "Lié quand ramassé\r\n"
				+ "Pieds Tissu\r\n"
				+ "Armure : 2\r\n"
				+ "+12 Intelligence\r\n"
				+ "+18 Endurance\r\n"
				+ "Augmente votre score de hâte de +13 (0.39% au niveau 70)\r\n"
				+ "+11 Versatilité (0.28% au niveau 70)\r\n"
				+ "Durabilité 60 / 60\r\n"
				+ "Niveau 10 requis\r\n"
				+ "Prix de Vente: 11 81 49");
	}

	@AfterEach
	    public void teardown() {
	       // driver.quit();
	        
	}

}
