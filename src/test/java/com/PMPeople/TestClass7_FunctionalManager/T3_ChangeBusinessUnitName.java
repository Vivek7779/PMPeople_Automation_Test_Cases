package com.PMPeople.TestClass7_FunctionalManager;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class T3_ChangeBusinessUnitName extends BaseClass {

	@Test
	public void changeBusinessUnitName () throws IOException, InterruptedException {
		driverinitialize();
		maximizeWindow();
		performLogin("Vivek.sale@plusinfosys.com", "Vivek@123");
		
		WebElement FunctionalManager=driver.findElement(By.xpath("/html/body/div/body/main/aside/nav/div/div[2]/div/ul/li[9]/a"));
		clickWithPause(FunctionalManager);
		
		WebElement SelectBusinessUnitDropdown=driver.findElement(By.xpath("//*[@id=\"floatingSelect\"]"));
		clickWithPause(SelectBusinessUnitDropdown);
		
		//Create a Select object for the dropdown
		Select dropdown=new Select(SelectBusinessUnitDropdown);
		dropdown.selectByIndex(1);
		driver.switchTo().activeElement().click();
		
		WebElement BusinessUnitData=driver.findElement(By.xpath("//*[@id=\"rc-tabs-0-tab-BUDATA\"]"));
		clickWithPause(BusinessUnitData);
		
		WebElement Name=driver.findElement(By.xpath("//*[@id=\"rc-tabs-0-panel-BUDATA\"]/div[1]/form/div[2]/div[1]/div/input"));
		clickWithPause(BusinessUnitData);
		Name.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		Name.sendKeys("BU 243");
		System.out.println("BU Name entered: " + Name.getAttribute("value"));
		Thread.sleep(2000);
		
		WebElement Description=driver.findElement(By.xpath("//*[@id=\"rc-tabs-0-panel-BUDATA\"]/div[1]/form/div[2]/div[3]/div/textarea[1]"));
		clickWithPause(BusinessUnitData);
		Description.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		Description.sendKeys("Test 244");
		System.out.println("BU Description entered: " + Description.getAttribute("value"));
		Thread.sleep(2000);
		
		WebElement Save=driver.findElement(By.xpath("//*[@id=\"rc-tabs-0-panel-BUDATA\"]/div[1]/form/div[1]/div/div[3]/button"));
		clickWithPause(Save);                        
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		WebElement SelectBusinessUnitDropdown1=driver.findElement(By.xpath("//*[@id=\"floatingSelect\"]"));
		clickWithPause(SelectBusinessUnitDropdown1);
		
		//Create a Select object for the dropdown
		Select dropdown1=new Select(SelectBusinessUnitDropdown1);
		
		dropdown1.selectByIndex(1);
		driver.switchTo().activeElement().click();
		
		WebElement BusinessUnitData1=driver.findElement(By.xpath("//*[@id=\"rc-tabs-0-tab-BUDATA\"]"));
		clickWithPause(BusinessUnitData1);
		
		Thread.sleep(3000);
		
		driver.quit();
		
	
	}
}
