package Ashu;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import Ashu3.Gabru;

public class General extends Global 
{


public  void openapplication() {
	     System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	     driver =new ChromeDriver();
	     driver.navigate().to(url);
         System.out.println("application opened");
         Reporter.log("application opened");
         Gabru.info("application opened");
}
   public  void closeapplication() {
        driver.close();
        System.out.println("application closed");
        Reporter.log("application closed");
        Gabru.info("application closed");
}
	public  void login() throws Exception
	{
		driver.findElement(By.name(txtusr)).sendKeys(un);
		driver.findElement(By.name(txtpass)).sendKeys(pw);
		driver.findElement(By.name(login)).click();
		System.out.println("login completed");
		Reporter.log("login completed");
	    Gabru.info("login completed");
	}
	public  void enterframe() {
	    driver.switchTo().frame(fm);
	    System.out.println("entered frame");
	    Reporter.log("entered frame");
	    Gabru.info("entered frame");
	}
	public  void addbutton() {
		driver.findElement(By.xpath(add)).click();
		driver.findElement(By.name(empln)).sendKeys(emptxtln);
		driver.findElement(By.name(empfn)).sendKeys(emptxtfn);
		driver.findElement(By.name(empmn)).sendKeys(emptxtmn);
		
		driver.findElement(By.xpath(save)).click();
		System.out.println("added button");
		Reporter.log("added button");
		Gabru.info("added button");
	}
	public  void exitframe() 
	{
		driver.switchTo().defaultContent();
		System.out.println("exit frame");
		Reporter.log("exit frame");
		Gabru.info("exit frame");
	}
	public  void logout() 
	{
		driver.findElement(By.linkText(logout)).click();
		System.out.println("logout completed");
		Reporter.log("logout completed");
		Gabru.info("logout completed");
	}
	
	
}
