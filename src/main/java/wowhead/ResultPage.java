package wowhead;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends BasePage {

	public ResultPage(WebDriver driver) {
		super(driver);
	}

	
	// Locators
	
	@FindBy(css = "tr.listview-row:nth-child(1) > td:nth-child(3)")
	private WebElement chahuteurDeCadavres;
	
	@FindBy(css = "tr.listview-row:nth-child(2) > td:nth-child(3)")
	private WebElement chaussesDeLardeur;
	
	@FindBy(css = "tr.listview-row:nth-child(3) > td:nth-child(3)")
	private WebElement piocheEnFerFroid;
	
	@FindBy(css = "tr.listview-row:nth-child(4) > td:nth-child(3)")
	private WebElement grevesDeGeolierVolees;
	
	@FindBy(css = "tr.listview-row:nth-child(5) > td:nth-child(3)")
	private WebElement espauliesrDeTournecle;
	
	////////////////
	
	@FindBy(css = "#tt2168")
	private WebElement chahuteurDeCadavresStatsLocator;
	
	@FindBy(css = "#tt1934")
	private WebElement chaussesDeLardeurStatsLocator;
	
	@FindBy(css = "#tt1959")
	private WebElement piocheEnFerFroidStatsLocator;
	
	@FindBy(css = "#tt132569")
	private WebElement grevesDeGeolierVoleesStatsLocator;
	
	@FindBy(css = "#tt151074")
	private WebElement espauliesrDeTournecleStatsLocator;

	
	// Methods
	
	public String getBootsStats() {
		chahuteurDeCadavres.click();
		String chahuteurDeCadavresStats = chahuteurDeCadavresStatsLocator.getText();
		// chahuteurDeCadavresStats.split("/n");
		// System.out.println(chahuteurDeCadavresStats);
		return chahuteurDeCadavresStats;
	}
/*	
	public void getPantsStats() {
		chaussesDeLardeur.click();
		String chaussesDeLardeurStats = chaussesDeLardeurStatsLocator.getText();
	}
	
	public void getPickaxeStats() {
		piocheEnFerFroid.click();
		String piocheEnFerFroidStats =  piocheEnFerFroidStatsLocator.getText();
	}
	
	public void getGreaveStats() {
		grevesDeGeolierVolees.click();
		String piocheEnFerFroidStats = grevesDeGeolierVoleesStatsLocator.getText();
	}
	
	public void getPauldronStats() {
		espauliesrDeTournecle.click();
		String espauliesrDeTournecleStats = espauliesrDeTournecleStatsLocator.getText();
	}
*/	
	

}
