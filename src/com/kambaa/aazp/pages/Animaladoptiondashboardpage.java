package com.kambaa.aazp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Animaladoptiondashboardpage extends TestBase {
	@FindBy(xpath=" //input[@id='email']")
	public static WebElement email;
	@FindBy(xpath=" //input[@id='password']")
	public static WebElement pword;
	@FindBy(xpath="//input[@class='login-but']")
	public static WebElement loginbtn;
	@FindBy(xpath="//*[@class='table table-bordered']//tr/td //*[@id='1']")
	public static WebElement animalcheckbox; 
	@FindBy(xpath="//select[@id='monthselect1']")
	public static WebElement month; 
	@FindBy(xpath="//select[@id='yearselect1']")
	public static WebElement year;
	@FindBy(xpath="//*[@class='checkout_button'][@value='PROCEED TO PAY']")
	public static WebElement proceedtopay;
	@FindBy(xpath="//button[@class='btn']")
	public static WebElement language;
	@FindBy(xpath="//button[@class='btn btn-responsive']")
	public static WebElement mycart;
	@FindBy(xpath=" //span[contains(text(),'My Profile')]")
	public static WebElement myprofile;
	@FindBy(xpath=" //a[contains(text(),'My Orders')]")
	public static WebElement myorder;
	@FindBy(xpath=" //a[contains(text(),'Logout')]")
	public static WebElement logout;
	@FindBy(xpath=" //div[@id='total_amount_bg']")
	public static WebElement totalamount;
	@FindBy(xpath="//a[@class='checkout_button confirm']")
	public static WebElement proceedtopay2;
	@FindBy(xpath="//a[@class='checkout_button btn_left']")
	public static WebElement backtoanimals;
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
}
