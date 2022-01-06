package wowhead;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest {
	WebDriver driver;
	WebDriverWait wait;

	@Before
	public void setUp() {
		String browser = System.getProperty("browser");
		// driver = new ChromeDriver();
		// driver = new FirefoxDriver();

		if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("WebDriver.gecko.driver", "src/main/resources/driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("WebDriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
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
		// resultPage.getBootsStats();

		System.out.println("START" + chahuteurDeCadavresStats + "STOP");

		String chahuteurDeCadavresStatsAttendu = "Chahuteurs de cadavre\r\n" + "Niveau d'objet 57\r\n"
				+ "Lié quand ramassé\r\n" + "Pieds Tissu\r\n" + "Armure : 2\r\n" + "+12 Intelligence\r\n"
				+ "+18 Endurance\r\n" + "Augmente votre score de hâte de +13 (0.39% au niveau 70)\r\n"
				+ "+11 Versatilité (0.28% au niveau 70)\r\n" + "Durabilité 60 / 60\r\n" + "Niveau 10 requis\r\n"
				+ "Prix de Vente: 11 81 49";

		System.out.println("START" + chahuteurDeCadavresStatsAttendu + "STOP");

		// assertEquals(chahuteurDeCadavresStats, chahuteurDeCadavresStatsAttendu);

	}

	@After
	public void teardown() {
		driver.quit();

	}

}
