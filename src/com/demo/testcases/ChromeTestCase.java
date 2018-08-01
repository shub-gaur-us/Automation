package com.demo.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTestCase {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		String os=System.getProperty("os.name").toLowerCase();
		
		WebDriver driver=new ChromeDriver();
		
		if(os.contains("mac"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
			
		}else
		{
			
		}
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("selenium");
        Thread.sleep(4000);
        element.submit();
	}

}
