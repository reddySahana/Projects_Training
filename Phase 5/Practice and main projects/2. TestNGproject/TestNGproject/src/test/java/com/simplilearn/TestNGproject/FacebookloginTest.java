package com.simplilearn.TestNGproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookloginTest {
  @Test
  public void Facebooklogin() {
	 
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		
		email.click();
		pass.click();
		
		WebElement Email = driver.findElement(By.id("email"));
		WebElement Pass = driver.findElement(By.id("pass"));
		
		Email.sendKeys("9322804079");
		Pass.sendKeys("patilsa123");
		
		WebElement login= driver.findElement(By.name("login"));
		login.submit();
  }
}
