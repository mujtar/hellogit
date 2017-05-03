package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Headless_HtmlUnit {

@Test
public void basic_test(){
	
	/*
	//System.setProperty("webdriver.gecko.driver", "D:\\QA_Learning\\Automation Files\\geckodriver-v0.16.1-win64\\geckodriver.exe");
	//WebDriver driver= new FirefoxDriver();	
	HtmlUnitDriver driver= new HtmlUnitDriver(true);
	//driver.setJavascriptEnabled(true);
	driver.get("https://www.google.com");
	System.out.println("google page is displayed");
	WebDriverWait waitforSearch = new WebDriverWait(driver,10);
	WebElement SearchBox= waitforSearch.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='gbwa']/div[1]/a")));
	//WebElement SearchBox= waitforSearch.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='sbtc']/descendant::input[2]")));	
	System.out.println("Apps Button Clicked");
	//System.out.println("Search Button Clicked");
	//SearchBox.sendKeys("Amazon Alexa");
	System.out.println(driver.getTitle());	*/
	
				String str= "ab";
				char[] arr1= str.toCharArray();
				int size = str.length();
				for (int i=size-1; i>=0;i--){
					
					System.out.print(arr1[i]);
				}
					
	
	}
}
