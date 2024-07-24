package com.PMPeople.TestClass3_ForgotPassword;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import Resources.BaseClass;

public class T1_ForgotPassword extends BaseClass {
                                                                                        //:"xpath","selector":"//*[@id="root"]/body/main/div/div/div/div/ul/form/li[2]/a"}
	@Test 
	public void forgot_password () throws IOException, InterruptedException {
		
		driverinitialize();
		maximizeWindow();
		driver.get("http://115.244.148.118:8195/signin");
		Thread.sleep(2000);
		
		WebElement ForgotPassword=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div/div/div/div/ul/form/li[2]/div/a"));
		Thread.sleep(1000);
		ForgotPassword.click();
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div/div/div/div/ul/form/li[1]/input"));
		email.sendKeys("Viveksale123@gmail.com");
		System.out.println("Email entered: " + email.getAttribute("value"));
		
		WebElement Submit=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div/div/div/div/ul/form/li[2]/button"));
		clickWithPause(Submit);
		
		WebElement resend_a_new_code=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div/div/div/ul/li[2]/span/a"));
		resend_a_new_code.click();
		System.out.println("resend new code send successfully");
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}
}
