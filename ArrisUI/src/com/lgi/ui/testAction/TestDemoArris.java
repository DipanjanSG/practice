package com.lgi.ui.testAction;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

public class TestDemoArris {
	static WebDriver driver = null;// Driver.getDriver();
	SoftAssert s_assert = new SoftAssert();
	Logger log = null;
	public static void main(String[] args) {
		try{
		driver = new FirefoxDriver();
		String url="www.google.co.uk/";
		System.out.println("URL:"+url);
		driver.get("http://"+url+"/");
		System.out.println("cd");
		driver.findElement(By.xpath(".//*[@id='Password']")).clear();
		driver.findElement(By.xpath(".//*[@id='Password']")).sendKeys("Infosys123");
		Thread.sleep(1000*5);
		driver.findElement(By.xpath(".//*[@id='Login']/div[4]/input")).click();
		driver.findElement(By.xpath(".//*[@id='AdvancedSettings']")).click();
		driver.findElement(By.xpath(".//*[@id='Security']/a")).click();
		driver.findElement(By.xpath(".//*[@id='IPFiltering']/a")).click();
		driver.findElement(By.xpath(".//*[@id='fmRbtn-Inbound']")).click();
		driver.navigate().to(driver.getCurrentUrl());
		}catch(Exception e){
			System.out.println("error");
		}
	}


}
