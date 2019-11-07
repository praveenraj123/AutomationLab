package temp.mailapi;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.JSONException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.mashape.unirest.http.exceptions.UnirestException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmailTestRunner {
	private static NadaEMailService nada=new NadaEMailService();
    private static  WebDriver driver;
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IllegalArgumentException, JSONException, IOException, UnirestException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(23, TimeUnit.SECONDS);
		driver.get("https://ismyemailworking.com/");
		System.out.println(nada.getEmailId());
		driver.findElement(By.id("verify_email")).sendKeys(nada.getEmailId());
		driver.findElement(By.xpath("//*[@id=\"content_cob_check\"]")).click();
		String s=nada.getMessageWithSubjectStartsWith("IsMyEmailWorking");
		System.out.println(s.toString());
		
		
	}

}
