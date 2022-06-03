package May_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class spotDraft {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\ST\\webDrivers\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.goodreads.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    
	    driver.findElement(By.linkText("Sign In")).click();
	    driver.findElement(By.linkText("Sign in with email")).click();  	    
	    driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("rahulkadam1618@gmail.com");
	    driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Spotdraft@22");
	    driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
	    driver. findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("The singing trees");
	    driver. findElement(By.xpath("(//button[@type=\"submit\"])[1]")).click();
	    driver. findElement(By.xpath("//span[@title=\"Want to Read\"]")).click();
	    driver.findElement(By.xpath("(//*[@value=\"✓\"])[1]")).click();
	}
}
