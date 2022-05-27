package all_catagories;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Search {
	@Test
	public void search() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("_nkw")).sendKeys("b");		
		List<WebElement> all = driver.findElements(By.xpath("//ul[@id=\"ui-id-1\"]//li/descendant::a[@role=\"option\"]"));
		//ul[@role='listbox']//li/descendant::div[@class="wM6W7d"]
		System.out.println(all.size());
		Thread.sleep(2000);
		//Select sl = new Select(web);
		//sl.selectByVisibleText("boots").
		driver.close();
		
	}

}
