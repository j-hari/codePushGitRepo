package com.git.firstProject.FirstPro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenBrowser {
	
	
	public static WebDriver driver;
	@BeforeTest
	public void openBro()
	{
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");	
	}
	@Test
	public void enterText()
	{
		driver.findElement(By.xpath(".//input[@tiltle='Search']")).sendKeys("Joga");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER);
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
