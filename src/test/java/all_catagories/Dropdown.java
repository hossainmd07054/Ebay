package all_catagories;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import junit.framework.Assert;
public class Dropdown {
	WebDriver driver;

	@Test
	public void allCategories() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
				
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select sle = new Select(dropdown);
		sle.selectByValue("11450");
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		boolean veryfy = driver.findElement(By.xpath("//span[@class='b-pageheader__text']")).isDisplayed();
		String print = driver.findElement(By.xpath("//span[@class='b-pageheader__text']")).getText();
		Assert.assertTrue(veryfy);
		System.out.println(print);
		Thread.sleep(5000);
		List<WebElement> total = driver.findElements(By.tagName("option"));
		System.out.println(total.size());
		driver.close();
	}
}
