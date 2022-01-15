package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class simplr {
	
	@Test
	public void  openPage() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://auto-test1--simpplr.visualforce.com/apex/simpplr__app?u=/site/a1A5Y00000MbH1fUAF/page/a185Y00001agRXZQA2");
	}

}
