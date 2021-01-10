package org.mav;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseBoy {

	public static WebDriver d;
	public static JavascriptExecutor js;
	public static Actions a;
	public static Robot r;
	
	public static void launchBrowser() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "A:\\eclipse saved files\\FrameWork\\driver\\chromedriver.exe");
		
		
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--disable-notifications");
		
		d=new ChromeDriver(o);
		
		
		
	}
	
	
	public static void url() {
		// TODO Auto-generated method stub

		d.get("https://www.flipkart.com/account/login");
		
		
	}
	
	public static void sendkeys(WebElement e,String s) {
		// TODO Auto-generated method stub

		e.sendKeys(s);
		
	}
	
	public static void timeDelay() {
		// TODO Auto-generated method stub
d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public static String excelSheet(int k,int j) throws IOException {
		// TODO Auto-generated method stub

		File f=new File("A:\\eclipse saved files\\FrameWork\\excel\\create 1.xlsx");
		
		FileInputStream i=new FileInputStream(f);
		
		Workbook w= new XSSFWorkbook(i);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(k);
		
		Cell c = r.getCell(j);
		
		String c1 = c.getStringCellValue();
		
		return c1;
		
	}
	
	public static void excelSheetOutput(int i,int h,String a) throws IOException {
		// TODO Auto-generated method stub

		File f=new File("A:\\eclipse saved files\\FrameWork\\excel\\output.xlsx");
		
		Workbook w=new XSSFWorkbook();
		
		Sheet cs = w.createSheet();
		
		Row cr = cs.createRow(i);
		Cell cc = cr.createCell(h);
		
		cc.setCellValue(a);
		
		FileOutputStream o=new FileOutputStream(f);
		
		w.write(o);
		
		
	}
	
	public static void javaScript(String s,Object o) {
		// TODO Auto-generated method stub

		js=(JavascriptExecutor)d;
		
	js.executeScript(s, o);
	}
	
	
	public static void mouseMove(WebElement e) {
		// TODO Auto-generated method stub

		 a=new Actions(d);
		 
		 a.moveToElement(e).perform();
		
	}
	
	public static void mouseClick(WebElement e) {
		// TODO Auto-generated method stub
a.click(e).perform();
		
	}
	
	public static void click() {
		// TODO Auto-generated method stub
a.click();
	}
	
	
	public static void Robot1() throws AWTException {
		// TODO Auto-generated method stub

		r=new Robot();
		
	}
	
	public static void mouseDoubleClick(WebElement e) {
		// TODO Auto-generated method stub

		a.doubleClick(e).perform();
		
	}
}
