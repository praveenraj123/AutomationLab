package myproject.com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class visualvalidation {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://applitools.com/helloworld?diff1");
		Eyes eye=new Eyes();
		eye.setApiKey("97MPj5JoRBlzeRaBKamfzQox2TCCVN111rK1qHos104Wc2ns110");
		eye.open(driver, "applitool", "hello", new RectangleSize(800, 600));
		eye.checkWindow("Hellow");
		driver.findElement(By.xpath("/html/body/div/div[3]/button")).click();
		eye.checkWindow("Click");
		eye.close();
		eye.abortIfNotClosed();
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
