package BankAndCashPage;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;

	public void waitforelement(WebDriver driver, int waittimein_seconds,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, waittimein_seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public int random(int value) {
		Random rnd=new Random();
		  int b=rnd.nextInt(100);
		return b;
	}
	
	
}
