package com.demo.testcases;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox{

public static void main(String[] args) {

System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
//FirefoxDriver driver = new FirefoxDriver();
WebDriver driver=new ChromeDriver();
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
driver.get("https://www.facebook.com/");

String s = driver.getTitle();

//Selenium API provided us an Java Class named -Select
WebElement e = driver.findElement(By.id("day"));
Select daySelect = new Select(e);

//daySelect.selectByVisibleText("4");
//daySelect.selectByValue("20");
daySelect.selectByIndex(28);

//finding the number of options in the listbox
List<WebElement> list = daySelect.getOptions();
//System.out.println("Number of items:: " + list.size());

for(int i =0 ;i<list.size();i++)
{
WebElement e1 = list.get(i);
System.out.println(e1.getText() + ":::" + i );
}



}
}

