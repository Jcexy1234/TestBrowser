import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class TestGoogle {

	@Test
	void testSearchByKeyword() {
		WebDriver driver = null;
		System.setProperty("webdriver.gecko.driver", "D:\\webdriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		WebElement search_box = driver.findElement(By.name("q"));
		search_box.sendKeys("NPRU");
		search_box.sendKeys(Keys.ENTER);

		driver.close();

		// System.out.print("Result :"+result);

	}




	@Test

	void test3() {

		WebDriver driver = null;

		System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");

		driver = new EdgeDriver();

		driver.get("https://www.google.com");

		WebElement search_box = driver.findElement(By.name("q"));

		search_box.sendKeys("NPRU");

		search_box.sendKeys(Keys.ENTER);



		driver.close();

	}

}
