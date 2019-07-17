package com.kambaa.aazp.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.kambaa.aazp.pages.Myorderpage;
import com.kambaa.aazp.pages.TestBase;

public class MyorderpageTest extends TestBase{
	@Parameters({ "validemail", "validpassword" })
	@Test(priority=0)
	public void myorderpagehomepage(String validemail, String validpassword) {
		PageFactory.initElements(driver, Myorderpage.class);
		try{
		Myorderpage.email.sendKeys(validemail);
		Myorderpage.pword.sendKeys(validpassword);
		Myorderpage.loginbtn.click();
		Myorderpage.myorderlink.click();
		Myorderpage.logout.click();
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		System.out.println("Myorder Homepage Successfully Opened");
		System.out.println("-------------------------------------");
	}

	@Parameters({ "validemail", "validpassword" })
	@Test
	public void cartcount(String validemail, String validpassword) throws InterruptedException {
		PageFactory.initElements(driver, Myorderpage.class);
		try{
		Myorderpage.email.sendKeys(validemail);
		Myorderpage.pword.sendKeys(validpassword);
		Myorderpage.loginbtn.click();
		Myorderpage.animalcheckbox.click();
		Myorderpage.month.click();
		Select select=new Select(Myorderpage.month);
		select.selectByIndex(1);
		Myorderpage.year.click();
		Select year=new Select(Myorderpage.year);
		year.selectByIndex(1);
		Thread.sleep(500);
		Myorderpage.proceedtopay.click();
		Myorderpage.myorderlink.click();
		String count = Myorderpage.cartcount.getText();
		Myorderpage.logout.click();		
		System.out.println("The Number Of Animal Adopted is :" + count);
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		System.out.println("-------------------------------------");
	}

	@Parameters({ "validemail", "validpassword" })
	@Test(priority=1)
	public void navigatetobacktoanimaladoptedpage(String validemail,
			String validpassword) {
		PageFactory.initElements(driver, Myorderpage.class);
		try{
		Myorderpage.email.sendKeys(validemail);
		Myorderpage.pword.sendKeys(validpassword);
		Myorderpage.loginbtn.click();
		Myorderpage.myorderlink.click();
		Myorderpage.backtoanimals.click();
		Myorderpage.logout.click();
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		System.out
				.println("The page is successfully navigated From Myorderpage to Animal Adopted Homepage");
		System.out.println("-------------------------------------");
	}
	@Parameters({ "validemail", "validpassword" })
	@Test(priority=2)
	public void orderidcheck(String validemail,
			String validpassword) throws InterruptedException{
		PageFactory.initElements(driver, Myorderpage.class);		
		Myorderpage.email.sendKeys(validemail);
		Myorderpage.pword.sendKeys(validpassword);
		Myorderpage.loginbtn.click();
//		Myorderpage.animalcheckbox.click();
//		Myorderpage.month.click();
//		Select select=new Select(Myorderpage.month);
//		select.selectByIndex(1);
//		Myorderpage.year.click();
//		Select year=new Select(Myorderpage.year);
//		year.deselectByIndex(1);
//		Myorderpage.proceedtopay.click();
//		Myorderpage.termscondition.click();
//		Myorderpage.proceedtopay2.click();
//		driver.switchTo().activeElement();
//		try{
//			driver.switchTo().frame(0);
//			Myorderpage.netbanking.click();			
//		}catch(NoSuchElementException e){
//			e.printStackTrace();
//		}
//		Myorderpage.banktype.click();
//		Select bank=new Select(Myorderpage.banktype);
//		bank.selectByVisibleText("Axis Bank");
//		String parantwindow2=driver.getWindowHandle();		
//		Myorderpage.payamount.click();
//		for(String childwindow2:driver.getWindowHandles()){
//			if(!childwindow2.equals(parantwindow2)){
//				driver.switchTo().window(childwindow2);
//				Thread.sleep(500);
//				Myorderpage.success.click();
//			}
			Myorderpage.myorderlink.click();
		List<WebElement> orderid=driver.findElements(By.xpath("//*[@class='table table-bordered']//tbody/tr[1]/td[1]"));
		for (WebElement webElement : orderid) {
			String orderidlist=webElement.getText();
			System.out.println(orderidlist);
			System.out.println("-------------------");
			
		}
	}
	
	}

