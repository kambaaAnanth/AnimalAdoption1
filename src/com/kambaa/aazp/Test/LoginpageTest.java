package com.kambaa.aazp.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.kambaa.aazp.pages.Loginpage;
import com.kambaa.aazp.pages.TestBase;

public class LoginpageTest extends TestBase{
	@Parameters({ "invalidemail", "validpassword" })
	@Test(priority = 0)
	public void invalidemail( String invalidemail,
			 String validpassword) {
		PageFactory.initElements(driver, Loginpage.class);
		try{
		Loginpage.email.sendKeys(invalidemail);
		Loginpage.pword.sendKeys(validpassword);
		Loginpage.loginbtn.click();
		driver.switchTo().alert().accept();
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		System.out.println("Invalid email id");
		System.out.println("----------------------------------");
	}

	@Parameters({ "validemail", "invalidpassword" })
	@Test(priority = 1)
	public void invalidpwd( String validemail,
			 String invalidpassword) throws InterruptedException {
		PageFactory.initElements(driver, Loginpage.class);
	try{
		Loginpage.email.sendKeys(validemail);
		Thread.sleep(500);
		Loginpage.pword.sendKeys(invalidpassword);
		Thread.sleep(1000);
		Loginpage.loginbtn.click();
		driver.switchTo().alert().accept();
	}catch(IllegalArgumentException e){
		e.printStackTrace();
	}
		System.out.println("invalid password");
		System.out.println("----------------------------------");
	}

	@Parameters({ "invalidemail", "invalidpassword" })
	@Test(priority = 3)
	public void bothinvalid( String invalidemail,
			 String invalidpassword) throws InterruptedException {
		PageFactory.initElements(driver, Loginpage.class);
		try{
		Loginpage.email.sendKeys(invalidemail);
		Thread.sleep(500);
		Loginpage.pword.sendKeys(invalidpassword);
		Thread.sleep(1000);
		Loginpage.loginbtn.click();
		driver.switchTo().alert().accept();
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		System.out.println("Email and password is incorrect");
		System.out.println("----------------------------------");
	}

	@Parameters({ "validemail", "validpassword" })
	@Test(priority = 2)
	public void bothcorrect( String validemail,
			 String validpassword) {
		PageFactory.initElements(driver, Loginpage.class);
		try{
		Loginpage.email.sendKeys(validemail);
		Loginpage.pword.sendKeys(validpassword);
		Loginpage.loginbtn.click();
		System.out.println("login success");
		System.out.println("----------------------------------");
		Loginpage.logout.click();
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		System.out.println("Logout successful");
		System.out.println("----------------------------------");
	}
}
