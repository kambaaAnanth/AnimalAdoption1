package com.kambaa.aazp.Test;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.kambaa.aazp.pages.TestBase;

public class MyprofilepageTest extends TestBase {
	@Parameters({ "validemail", "validpassword" })
	@Test(priority = 0)
	public void withoutenteraddress(String validemail, String validpassword) {
		PageFactory.initElements(driver,
				com.kambaa.aazp.pages.MyprofilePage.class);
		try{
		com.kambaa.aazp.pages.MyprofilePage.email.sendKeys(validemail);
		com.kambaa.aazp.pages.MyprofilePage.pword.sendKeys(validpassword);
		com.kambaa.aazp.pages.MyprofilePage.loginbtn.click();
		com.kambaa.aazp.pages.MyprofilePage.myprofilelink.click();
		if (com.kambaa.aazp.pages.MyprofilePage.address.isEnabled()) {
			com.kambaa.aazp.pages.MyprofilePage.address.clear();
		}
		com.kambaa.aazp.pages.MyprofilePage.state.click();
		if (com.kambaa.aazp.pages.MyprofilePage.state.isSelected()) {
			com.kambaa.aazp.pages.MyprofilePage.state.clear();
			Select select = new Select(
					com.kambaa.aazp.pages.MyprofilePage.state);
			select.selectByVisibleText("Tamil Nadu");
		}
		if (com.kambaa.aazp.pages.MyprofilePage.pincode.isEnabled()) {
			com.kambaa.aazp.pages.MyprofilePage.pincode.clear();
			com.kambaa.aazp.pages.MyprofilePage.pincode.sendKeys("636701");
		}
		com.kambaa.aazp.pages.MyprofilePage.update.click();
		com.kambaa.aazp.pages.MyprofilePage.logout.click();
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		System.out.println("please enter Address details");
		System.out.println("---------------------------------------");
	}

	@Parameters({ "validemail", "validpassword" })
	@Test(priority = 1)
	public void withoutselectstate(String validemail, String validpassword) {
		PageFactory.initElements(driver,
				com.kambaa.aazp.pages.MyprofilePage.class);
		try{
		com.kambaa.aazp.pages.MyprofilePage.email.sendKeys(validemail);
		com.kambaa.aazp.pages.MyprofilePage.pword.sendKeys(validpassword);
		com.kambaa.aazp.pages.MyprofilePage.loginbtn.click();
		com.kambaa.aazp.pages.MyprofilePage.myprofilelink.click();
		com.kambaa.aazp.pages.MyprofilePage.address.click();
		;
		com.kambaa.aazp.pages.MyprofilePage.state.click();
		Select select = new Select(com.kambaa.aazp.pages.MyprofilePage.state);
		select.selectByIndex(0);
		if (com.kambaa.aazp.pages.MyprofilePage.pincode.isEnabled()) {
			com.kambaa.aazp.pages.MyprofilePage.pincode.clear();
			com.kambaa.aazp.pages.MyprofilePage.pincode.sendKeys("636701");
		}
		com.kambaa.aazp.pages.MyprofilePage.update.click();
		com.kambaa.aazp.pages.MyprofilePage.logout.click();
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		System.out.println("please select State");
		System.out.println("--------------------------------");
	}

	@Parameters({ "validemail", "validpassword" })
	@Test(priority = 2)
	public void withoutenterpincode(String validemail, String validpassword) {
		PageFactory.initElements(driver,
				com.kambaa.aazp.pages.MyprofilePage.class);
		try{
		com.kambaa.aazp.pages.MyprofilePage.email.sendKeys(validemail);
		com.kambaa.aazp.pages.MyprofilePage.pword.sendKeys(validpassword);
		com.kambaa.aazp.pages.MyprofilePage.loginbtn.click();
		com.kambaa.aazp.pages.MyprofilePage.myprofilelink.click();
		com.kambaa.aazp.pages.MyprofilePage.address.click();
		
		com.kambaa.aazp.pages.MyprofilePage.state.click();
		Select select = new Select(com.kambaa.aazp.pages.MyprofilePage.state);
		select.selectByVisibleText("Tamil Nadu");
		if (com.kambaa.aazp.pages.MyprofilePage.pincode.isEnabled()) {
			com.kambaa.aazp.pages.MyprofilePage.pincode.clear();
		}
		com.kambaa.aazp.pages.MyprofilePage.update.click();
		com.kambaa.aazp.pages.MyprofilePage.logout.click();
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		System.out.println("please enter pincode number");
		System.out.println("---------------------------------------");
	}

	@Parameters({ "validemail", "validpassword" })
	@Test(priority = 3)
	public void myprofileeditsuccess(String validemail, String validpassword) {
		PageFactory.initElements(driver,
				com.kambaa.aazp.pages.MyprofilePage.class);
		try{
		com.kambaa.aazp.pages.MyprofilePage.email.sendKeys(validemail);
		com.kambaa.aazp.pages.MyprofilePage.pword.sendKeys(validpassword);
		com.kambaa.aazp.pages.MyprofilePage.loginbtn.click();
		com.kambaa.aazp.pages.MyprofilePage.myprofilelink.click();
		if (com.kambaa.aazp.pages.MyprofilePage.address.isEnabled()) {
			com.kambaa.aazp.pages.MyprofilePage.address.clear();
			com.kambaa.aazp.pages.MyprofilePage.address
					.sendKeys("peelamedu,coimbatore");
		}
		com.kambaa.aazp.pages.MyprofilePage.state.click();
		if (com.kambaa.aazp.pages.MyprofilePage.state.isSelected()) {
			com.kambaa.aazp.pages.MyprofilePage.state.clear();
			Select select = new Select(
					com.kambaa.aazp.pages.MyprofilePage.state);
			select.selectByVisibleText("Tamil Nadu");
		}
		if (com.kambaa.aazp.pages.MyprofilePage.pincode.isEnabled()) {
			com.kambaa.aazp.pages.MyprofilePage.pincode.clear();
			com.kambaa.aazp.pages.MyprofilePage.pincode.sendKeys("636701");
		}
		com.kambaa.aazp.pages.MyprofilePage.update.click();
		driver.switchTo().alert().accept();
		com.kambaa.aazp.pages.MyprofilePage.logout.click();
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		System.out.println("My profie details edit successfully");
		System.out.println("------------------------------------");
	}
}
