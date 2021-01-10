package org.mav;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class JUnit extends BaseBoy {

	public static Login l;
	

	@BeforeClass
	public static void launch() {
		// TODO Auto-generated method stub

		launchBrowser();
		
	}
	
@Test
public void tc1() throws IOException {
	// TODO Auto-generated method stub
 l=new Login();
 url();
 
	sendkeys(l.getEmail(),excelSheet(11, 0));
	
	sendkeys(l.getPass(),excelSheet(11, 1));
	
	l.getLoginbtn().click();
	
	String t = d.getTitle();System.out.println(t); 
	
}

@Test
public void tc3() throws IOException, InterruptedException {
	// TODO Auto-generated method stub
url();
Thread.sleep(3000);
	sendkeys(l.getEmail(), "7010782628");
	sendkeys(l.getPass(),"kenleechan");
	
	l.getLoginbtn().click();
	Thread.sleep(3000);
String c = d.getTitle();System.out.println(c);

Assert.assertTrue("check tc3",c.contains("Online Shopping Site"));

Thread.sleep(5000);
WebElement l = d.findElement(By.xpath("(//div[@class='exehdJ'])[1]"));
mouseMove(l);



	
WebElement f = d.findElement(By.xpath("//div[text()='Logout']"));
mouseClick(f);
}
	
@Test
public void tc2() throws IOException, InterruptedException {
	// TODO Auto-generated method stub
 l=new Login();
 url();
 Thread.sleep(3000);
	sendkeys(l.getEmail(),excelSheet(11, 0));
	
	sendkeys(l.getPass(),excelSheet(11, 1));
	
	l.getLoginbtn().click();
	Thread.sleep(3000);
	String b = d.getTitle();System.out.println(b); 
	
	Assert.assertTrue("checdk tc2", b.contains("amazing journey"));
	
	
}
	
	
}
