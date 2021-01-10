package org.mav;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensPojo extends BaseBoy {

	
	public GreensPojo() {
	
		PageFactory.initElements(d, this);
		
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy (xpath="//u[contains(text(),'Software Training Centers')]")
	WebElement textBottem;
	
	@FindBy (xpath="//h1[contains(text(),'Institutes in Chennai')]")
	WebElement textTop;

	public WebElement getTextBottem() {
		return textBottem;
	}

	public WebElement getTextTop() {
		return textTop;
	}
	
	
	
	
	
}
