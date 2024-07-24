package com.PMPeople.TestClass6_ResourceManager;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class T1_AddResourcePool extends BaseClass{

	@Test
	public void addResourcePool() throws IOException, InterruptedException {
		driverinitialize();
		maximizeWindow();
		performLogin("vivek.sale@plusinfosys.com", "Vivek@123");
		
		WebElement ResourceManager=driver.findElement(By.xpath("/html/body/div/body/main/aside/nav/div/div[2]/div/ul/li[5]/a"));
		clickWithPause(ResourceManager);
		
		WebElement AddResourcePool=driver.findElement(By.xpath("//*[@id=\"projectHeader\"]/div[2]/button"));
		clickWithPause(AddResourcePool);

		WebElement ResourcePoolDescription=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div/div[2]/div/input"));
		clickWithPause(ResourcePoolDescription);
		ResourcePoolDescription.sendKeys("Test 6");
		ResourcePoolDescription.sendKeys(Keys.ENTER);
		
		WebElement SelectResourcePoolDropdown=driver.findElement(By.xpath("//*[@id=\"floatingSelect\"]"));
		clickWithPause(SelectResourcePoolDropdown);
		
		System.out.println("Resource Pool Created Successfuly.");
		driver.quit();
		
		
		
	}
}
