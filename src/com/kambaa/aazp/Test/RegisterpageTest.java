package com.kambaa.aazp.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import com.kambaa.aazp.pages.TestBase;

public class RegisterpageTest extends TestBase  {
	@Test
	public  void registerpage(){
		try{
			driver.findElement(By.xpath("//a[contains(text(),'Register Now')]"))
					.click();
			driver.findElement(By.id("person_name")).click();
			driver.findElement(By.id("person_name")).clear();
			driver.findElement(By.id("person_name")).sendKeys("Dhanaprabhu");
			driver.findElement(By.id("email_id")).click();
			driver.findElement(By.id("email_id")).clear();
			driver.findElement(By.id("email_id")).sendKeys("test2@kambaa.com");
			driver.findElement(By.id("mobile_number")).click();
			driver.findElement(By.id("mobile_number")).clear();
			driver.findElement(By.id("mobile_number")).sendKeys("9876543210");
			driver.findElement(By.id("state")).click();
			new Select(driver.findElement(By.id("state")))
					.selectByVisibleText("Tamil Nadu");
			driver.findElement(By.id("state")).click();
			driver.findElement(By.id("city")).click();
			driver.findElement(By.id("city")).clear();
			driver.findElement(By.id("city")).sendKeys("coimbatore");
			driver.findElement(By.id("address")).clear();
			driver.findElement(By.id("address")).sendKeys("Test");
			driver.findElement(By.id("pincode")).clear();
			driver.findElement(By.id("pincode")).sendKeys("676001");
			driver.findElement(By.id("password")).click();
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("1234");
			driver.findElement(By.id("aadhar")).click();
			driver.findElement(By.id("aadhar")).clear();
			driver.findElement(By.id("aadhar")).sendKeys("123456789101");
			driver.findElement(By.id("notification")).click();
			driver.findElement(
					By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Kambaa Inc'])[1]/preceding::input[1]"))
					.click();
//			Alert alert=driver.switchTo().alert();
//			alert.accept();
			}catch(IllegalArgumentException e){
				e.printStackTrace();
			}
			System.out.println("The Registeration is successfull");
			System.out.println("-------------------------------");
		}
		
	public static void main(String[]args) throws InterruptedException{
		RegisterpageTest register=new RegisterpageTest();
		MyprofilepageTest profile=new MyprofilepageTest();
		MyorderpageTest order=new MyorderpageTest();
		LoginpageTest login=new LoginpageTest();
		AnimalAdoptedPageTest dashboard=new AnimalAdoptedPageTest();
		register.registerpage();
		login.invalidemail("String DEMO@kambaa","String 1234");
		login.invalidpwd("String demo@kambaa.com", "String 3234");
		login.bothcorrect("String demo@kambaa.com", "String 1234");
		login.bothinvalid("String DEMO@kambaa.com","String 3234");
//		dashboard.languageconvert("String test2@kambaa.com", "String 1234");
//		dashboard.checkwithoutselectanimalcheckbox("String demo@kambaa.com", "String 1234");
//		dashboard.checkwithoutselectmonthandyear("String demo@kambaa.com", "String 1234");
	//	dashboard.checkamount("String demo@kambaa.com", "String 1234");
		dashboard.checksuccessfulpay("String demo@kambaa.com", "String 1234");
		profile.withoutenteraddress("String demo@kambaa.com", "String 1234");
		profile.withoutenterpincode("String demo@kambaa.com", "String 1234");
		profile.withoutselectstate("String demo@kambaa.com", "String 1234");
		profile.myprofileeditsuccess("String demo@kambaa.com", "String 1234");
		order.myorderpagehomepage("String demo@kambaa.com", "String 1234");
		order.navigatetobacktoanimaladoptedpage("String demo@kambaa.com", "String 1234");
		order.cartcount("String demo@kambaa.com", "String 1234");
	}
}
