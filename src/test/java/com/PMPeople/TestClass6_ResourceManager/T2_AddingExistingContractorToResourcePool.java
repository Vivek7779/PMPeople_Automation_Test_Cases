

package com.PMPeople.TestClass6_ResourceManager;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class T2_AddingExistingContractorToResourcePool extends BaseClass {

	@Test
	public void ddingExistingContractorToResourcePool() throws IOException, InterruptedException {
		
		driverinitialize();
		maximizeWindow();
		performLogin("admin11@dummy.com", "Admin@123");
		
		WebElement ResourceManager=driver.findElement(By.xpath("/html/body/div/body/main/aside/nav/div/div[2]/div/ul/li[5]/a"));
		clickWithPause(ResourceManager);
		
		WebElement SelectResourcePoolDropdown=driver.findElement(By.xpath("//*[@id=\"floatingSelect\"]"));
		clickWithPause(SelectResourcePoolDropdown);
		
		Select dropdown=new Select(SelectResourcePoolDropdown);
		dropdown.selectByIndex(2);
		driver.switchTo().activeElement().click();
		
		WebElement Pooldata=driver.findElement(By.xpath("//*[@id=\"rc-tabs-0-tab-POOLDATA\"]"));
		clickWithPause(Pooldata);
		
		Thread.sleep(3000);
                                                                      
		WebElement AddExistingContractor = driver.findElement(By.xpath("//*[@id=\"rc-tabs-0-panel-POOLDATA\"]/div/div/div[1]/div[3]/div/button[2]"));
	    JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].scrollIntoView(true);", AddExistingContractor);
	    Thread.sleep(1000); // Adjust delay as needed
	    clickWithPause(AddExistingContractor);
		
	    WebElement SelectResourcePool = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[1]/select"));
	    Select dropdown1 = new Select(SelectResourcePool);
	    dropdown1.selectByIndex(2); // Assuming you want to select the fourth option, adjust as needed

		WebElement SelectContractor=driver.findElement(By.xpath("//*[@id=\"floatingSelectContractors\"]"));
		clickWithPause(SelectContractor);
		SelectContractor.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);		
		WebElement save=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/button[1]"));
		clickWithPause(save);
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
