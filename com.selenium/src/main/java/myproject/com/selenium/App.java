package myproject.com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ChromeOptions options = new ChromeOptions(); 
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        
        WebDriverManager.chromedriver().setup();
        
        WebDriver driver=new ChromeDriver();
        
        driver.get("http://www.testautomationguru.com/selenium-webdriver-how-to-automate-charts-and-graphs-validation/");
        
        
    }
}
