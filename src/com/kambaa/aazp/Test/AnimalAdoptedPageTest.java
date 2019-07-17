package com.kambaa.aazp.Test;



import java.util.NoSuchElementException;


import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.kambaa.aazp.pages.Animaladoptiondashboardpage;
import com.kambaa.aazp.pages.TestBase;
public class AnimalAdoptedPageTest extends TestBase {
	@Parameters({ "validemail", "validpassword" })
	@Test(priority=0)
	public void languageconvert (String validemail, String validpassword) {
		PageFactory.initElements(driver, Animaladoptiondashboardpage.class);
		try{
		Animaladoptiondashboardpage.email.sendKeys(validemail);
		Animaladoptiondashboardpage.pword.sendKeys(validpassword);
		Animaladoptiondashboardpage.loginbtn.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Animaladoptiondashboardpage.language.click();
		System.out.println("The Language is converted Frome Tamil To English");
		Animaladoptiondashboardpage.logout.click();
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		System.out
				.println("------------------------------------------------------");
	}

	@Parameters({ "validemail", "validpassword" })
	@Test(priority=1)
	public void checkwithoutselectanimalcheckbox(String validemail,
			String validpassword) {
		PageFactory.initElements(driver, Animaladoptiondashboardpage.class);
		try{
		Animaladoptiondashboardpage.email.sendKeys(validemail);
		Animaladoptiondashboardpage.pword.sendKeys(validpassword);
		Animaladoptiondashboardpage.loginbtn.click();
		// com.kambaa.aazp.pages.Animaladoptiondashboardpage.animalcheckbox.click();
		Animaladoptiondashboardpage.proceedtopay.click();
		System.out.println("The Page is redirect to samepage");
		Animaladoptiondashboardpage.logout.click();
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		System.out
				.println("------------------------------------------------------");
	}

	@Parameters({ "validemail", "validpassword" })
	@Test(priority=2)
	public void checkwithoutselectmonthandyear(String validemail,
			String validpassword) {
		PageFactory.initElements(driver, Animaladoptiondashboardpage.class);
		try{
		Animaladoptiondashboardpage.email.sendKeys(validemail);
		Animaladoptiondashboardpage.pword.sendKeys(validpassword);
		Animaladoptiondashboardpage.loginbtn.click();
		Animaladoptiondashboardpage.animalcheckbox.click();
		Animaladoptiondashboardpage.proceedtopay.click();
		System.out.println("The Page is redirect to samepage");
		Animaladoptiondashboardpage.logout.click();
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		System.out
				.println("------------------------------------------------------");
	}

	@Parameters({ "validemail", "validpassword" })
	@Test(priority=4)
	public void checksuccessfulpay( String validemail,  String validpassword)
			throws InterruptedException {
		PageFactory.initElements(driver, Animaladoptiondashboardpage.class);
		try{
		Animaladoptiondashboardpage.email.sendKeys(validemail);
		Animaladoptiondashboardpage.pword.sendKeys(validpassword);
		Animaladoptiondashboardpage.loginbtn.click();
		try {
			Animaladoptiondashboardpage.animalcheckbox.click();
		} catch (ElementClickInterceptedException e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		Animaladoptiondashboardpage.month.click();
		Select month = new Select(Animaladoptiondashboardpage.month);
		month.selectByIndex(2);
		Thread.sleep(1000);
		Animaladoptiondashboardpage.year.click();
		Select year = new Select(Animaladoptiondashboardpage.year);
		year.selectByIndex(1);
		Thread.sleep(1000);
		Animaladoptiondashboardpage.proceedtopay.click();
		Animaladoptiondashboardpage.termscondition.click();
		Animaladoptiondashboardpage.proceedtopay2.click();
		driver.switchTo().activeElement();
		try{
			driver.switchTo().frame(0);
					Animaladoptiondashboardpage.netbanking.click();			
		}catch(NoSuchElementException e){
			e.printStackTrace();
		}
			Animaladoptiondashboardpage.banktype.click();
			Select select=new Select(Animaladoptiondashboardpage.banktype);
			select.selectByVisibleText("Axis Bank");
		String parantwindow2=driver.getWindowHandle();		
			Animaladoptiondashboardpage.payamount.click();
			for(String childwindow2:driver.getWindowHandles()){
				if(!childwindow2.equals(parantwindow2)){
					driver.switchTo().window(childwindow2);
					Thread.sleep(500);
					Animaladoptiondashboardpage.success.click();
				}
			}
		System.out.println("payment is successful");
		
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		System.out
				.println("------------------------------------------------------");
	}

	@Parameters({ "validemail", "validpassword" })
	@Test(priority=3)
	public void checkamount( String validemail, String validpassword)
			throws InterruptedException {
		PageFactory.initElements(driver, Animaladoptiondashboardpage.class);
		try{
		Animaladoptiondashboardpage.email.sendKeys(validemail);
		Animaladoptiondashboardpage.pword.sendKeys(validpassword);
		Animaladoptiondashboardpage.loginbtn.click();
		Animaladoptiondashboardpage.animalcheckbox.click();
		Animaladoptiondashboardpage.month.click();
		Select month = new Select(Animaladoptiondashboardpage.month);
		month.selectByIndex(2);
		Thread.sleep(1000);
		Animaladoptiondashboardpage.year.click();
		Select year = new Select(Animaladoptiondashboardpage.year);
		year.selectByIndex(1);
		String amount= Animaladoptiondashboardpage.totalamount.getText();
		System.out.println("The animal adoption amount is : " + amount);
		Animaladoptiondashboardpage.logout.click();
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
	}
}
