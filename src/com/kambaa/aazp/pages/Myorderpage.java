package com.kambaa.aazp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Myorderpage extends TestBase{
	@FindBy(xpath=" //input[@id='email']")
	public static WebElement email;
	@FindBy(xpath=" //input[@id='password']")
	public static WebElement pword;
	@FindBy(xpath="//input[@class='login-but']")
	public static WebElement loginbtn;
	@FindBy(xpath=" //a[contains(text(),'Logout')]")
	public static WebElement logout;
	@FindBy(xpath=" //a[contains(text(),'My Orders')]")
	public static WebElement myorderlink;
	@FindBy(xpath="//span[@class='cartcount']")
	public static WebElement cartcount;
	@FindBy(xpath="//a[@class='checkout_button']")
	public static WebElement backtoanimals;
	@FindBy(xpath="//*[@class='table table-bordered']//tr/td //*[@id='1']")
	public static WebElement animalcheckbox; 
	@FindBy(xpath="//select[@id='monthselect1']")
	public static WebElement month; 
	@FindBy(xpath="//select[@id='yearselect1']")
	public static WebElement year;
	@FindBy(xpath="//*[@class='checkout_button'][@value='PROCEED TO PAY']")
	public static WebElement proceedtopay;
	@FindBy(xpath="//input[@id='terms'] [@name='terms']")
	public static WebElement termscondition;
	@FindBy(xpath="(.//*[normalize-space(text()) and normalize-space(.)='Select a payment method'])[1]/following::div[3]")
	public static WebElement netbanking;
	@FindBy(xpath="//*[@id='bank-select']")
	public static WebElement banktype;
	@FindBy(xpath="//*[@id='footer']/span[2]")
	public static WebElement payamount;
	@FindBy(xpath="/html/body/form/button[1]")
	public static WebElement success;
	@FindBy(xpath="//a[@class='checkout_button confirm']")
	public static WebElement proceedtopay2;
}
