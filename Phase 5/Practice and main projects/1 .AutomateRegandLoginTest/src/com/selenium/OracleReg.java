package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class OracleReg {

    public static void main(String[] args) {
         
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
 
    	
         WebDriver driver= new ChromeDriver();
            driver.get("https://www.oracle.com/index.html");
            
            WebElement s1=driver.findElement(By.id("u30-flyout"));
            s1.click();
            
            WebElement s2=driver.findElement(By.xpath("//*[@id=\"u30-profilew1\"]/ul[1]/li[2]/a"));
            s2.click();
            
            WebElement s3=driver.findElement(By.name("sView1:r1:0:email"));
            s3.click();
            
            WebElement name=driver.findElement(By.name("sView1:r1:0:email"));
            name.sendKeys("patilsupriya757@gmail.com");
            
            
            
            
            WebElement s4=driver.findElement(By.id("sView1:r1:0:password::content"));
            s4.click();
            
            WebElement pass=driver.findElement(By.id("sView1:r1:0:password::content"));
            pass.sendKeys("Supriya@1231993");
            
            WebElement s5=driver.findElement(By.id("sView1:r1:0:retypePassword::content"));
            s5.click();
            
            WebElement pass1=driver.findElement(By.id("sView1:r1:0:retypePassword::content"));
            pass1.sendKeys("Supriya@1231993");
            
         
            WebElement s6=driver.findElement(By.name("sView1:r1:0:firstName"));
            s6.click();
            WebElement s9=driver.findElement(By.name("sView1:r1:0:firstName"));
            s9.sendKeys("supriya");
            
            WebElement s7=driver.findElement(By.name("sView1:r1:0:lastName"));
            s7.click();
            WebElement s8=driver.findElement(By.name("sView1:r1:0:lastName"));
            s8.sendKeys("patil");
            
            WebElement s12=driver.findElement(By.name("sView1:r1:0:jobTitle"));
            s12.click();
            WebElement s11=driver.findElement(By.name("sView1:r1:0:jobTitle"));
            s11.sendKeys("Engineer");
            
            WebElement s13=driver.findElement(By.name("sView1:r1:0:workPhone"));
            s13.click();
            WebElement s14=driver.findElement(By.name("sView1:r1:0:workPhone"));
            s14.sendKeys("9322804078");
            
            WebElement s15=driver.findElement(By.name("sView1:r1:0:companyName"));
            s15.click();
            WebElement s16=driver.findElement(By.name("sView1:r1:0:companyName"));
            s16.sendKeys("mphasis");
            
            WebElement s17=driver.findElement(By.id("sView1:r1:0:address1::content"));
            s17.click();
            WebElement s18=driver.findElement(By.id("sView1:r1:0:address1::content"));
            s18.sendKeys("pune");
            
            
            WebElement s19=driver.findElement(By.id("sView1:r1:0:city::content"));
            s19.click();
            WebElement s20=driver.findElement(By.id("sView1:r1:0:city::content"));
            s20.sendKeys("pune");
            
            
            Select a = new Select(driver.findElement(By.id("sView1:r1:0:state::content")));
            a.selectByIndex(21);
            
            WebElement s21=driver.findElement(By.id("sView1:r1:0:postalCode::content"));
            s21.click();
            WebElement s22=driver.findElement(By.id("sView1:r1:0:postalCode::content"));
            s22.sendKeys("413 406");

            WebElement s23=driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:b1\"]/a"));
            s23.click();
            WebElement s24=driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:b1\"]/a"));
            s24.click();
            System.out.println("done");
            
       
             WebElement c= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:subsecCreateAccount\"]/table/tbody/tr/td/table/tbody/tr[30]/td[2]"));
     		c.click();
     		

    }

}


