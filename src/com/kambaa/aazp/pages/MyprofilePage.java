package com.kambaa.aazp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyprofilePage extends TestBase{
	@FindBy(xpath=" //input[@id='email']")
	public static WebElement email;
	@FindBy(xpath=" //input[@id='password']")
	public static WebElement pword;
	@FindBy(xpath="//input[@class='login-but']")
	public static WebElement loginbtn;
	@FindBy(xpath=" //a[contains(text(),'Logout')]")
	public static WebElement logout;	
@FindBy(xpath="//span[contains(text(),'My Profile')]")
public static WebElement myprofilelink;
@FindBy(xpath=" //input[@id='address']")
public static WebElement address;
@FindBy(xpath=" //select[@id='state']")
public static WebElement state;
@FindBy(xpath=" //input[@id='pincode']")
public static WebElement pincode;
@FindBy(xpath="//input[@class='login-but']")
public static WebElement update;
@FindBy(xpath=" //a[@class='checkout_button']")
public static WebElement Bacttoanimal;
@FindBy(xpath="//span[@class='cartcount']")
public static WebElement cartcount;



}


