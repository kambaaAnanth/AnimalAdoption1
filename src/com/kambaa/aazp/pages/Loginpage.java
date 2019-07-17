package com.kambaa.aazp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends TestBase{
	@FindBy(xpath=" //input[@id='email']")
	public static WebElement email;
	@FindBy(xpath=" //input[@id='password']")
	public static WebElement pword;
	@FindBy(xpath="//input[@class='login-but']")
	public static WebElement loginbtn;
	@FindBy(xpath=" //a[contains(text(),'Logout')]")
	public static WebElement logout;
}
