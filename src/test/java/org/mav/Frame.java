package org.mav;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Frame extends BaseBoy {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		launchBrowser();
	url();
		timeDelay();
	GreensPojo g=new GreensPojo();
	
	javaScript("arguments[0].scrollIntoView(true)",g.getTextBottem());
		Thread.sleep(5000);
	javaScript("arguments[0].scrollIntoView(false)",g.getTextTop());
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
