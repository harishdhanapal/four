package org.mav;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseBoy{

	public Login() {
	
		PageFactory.initElements(d, this);
		
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement email;
	
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement loginbtn;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	
	
	

	
	
	
	
}
