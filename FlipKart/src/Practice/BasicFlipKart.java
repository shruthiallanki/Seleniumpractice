package Practice;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BasicFlipKart {
	 WebDriver driv;
	 @Test(priority=1)
	 public void login(){
		 driv.navigate().to("http://www.flipkart.com/");;
		 //("http://www.flipkart.com/");
		 driv.findElement(By.linkText("Log In")).click();
		 Assert.assertEquals("https://www.flipkart.com/account/login?ret=%2F",driv.getCurrentUrl());
		 driv.findElement(By.xpath("//div[4]/div[2]/input")).sendKeys("8143464718");
		 driv.findElement(By.xpath("//div[4]/div[4]/input")).sendKeys("8143464718");
		 driv.findElement(By.xpath("//div[4]/div[7]/input")).click();
		 System.out.println("Logged in to flipkart");
		System.out.println(driv.getCurrentUrl());
		 driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	 Assert.assertEquals("", driv.findElement(By.partialLinkText("Hi")));
	/*		WebElement name= driv.findElement(By.className("_1AHrFc _2k0gmP"));
			Actions action=new Actions(driv);
			action.moveToElement(name);
			action.click().build().perform();
			Assert.assertEquals("Log Out",driv.findElement(By.linkText("Log Out")) );
*/			
		//	driv.findElement(By.linkText("Log Out")).click();
		 
	 }
	 
	 @Test(priority=0)
	 public void men() throws InterruptedException{
		WebElement mens= driv.findElement(By.xpath(".//*[@id='container']/div/div/header/div[1]/div/ul/li[3]"));
		Actions action=new Actions(driv);
		action.moveToElement(mens);
		action.click().build().perform();
		//driv.switchTo().frame(driv.findElement(By.id("container")));
		driv.findElement(By.linkText("Boots")).click();
		Assert.assertEquals("http://www.flipkart.com/womens-footwear/boots/pr?sid=osp%2Ciko%2Cxgp",driv.getCurrentUrl());
		driv.findElement(By.xpath(".//*[@id='products']/div/div[1]/div[1]/div/div[1]/a[1]/img")).click();
		driv.findElement(By.linkText("39")).click();
		Thread.sleep(10000);
		//	driv.findElement(By.cssSelector(".btn-buy-now.btn-big.current")).click();
			//System.out.println("Caadd to cart");
		
		WebElement buyNow=driv.findElement(By.xpath("//input[@value='Buy Now' and @type='submit']"));
		((JavascriptExecutor) driv).executeScript("window.scrollTo(0,"+buyNow.getLocation().y+")");
		buyNow.click();
		//Thread.sleep(6000);
	/*	//driv.findElement(By.xpath(".//*[@id='fk-mainbody-id']/div/div[7]/div/div[3]/div/div/div[6]/div/div[2]/div[1]/div/div[2]/div[1]/div[2]/form/input[10]")).click();
		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Assert.assertEquals("https://www.flipkart.com/checkout/init", driv.getCurrentUrl());
	//	driv.findElement(By.name("email")).sendKeys("8143464718");
		driv.findElement(By.className("btn btn-large btn-blue tmargin5 ng-scope")).click();
		driv.findElement(By.id("password")).sendKeys("8143464718");
		driv.findElement(By.className("ng-scope")).click();
		
		
		*/
		//   .//div[@class='selector-boxes']//span[1]
		//*[@id='container']/div/div/header/div[1]/div/ul/li[3]/ul/li[3]/ul/li[2]/ul/li[8]/a/span
	 }
	 // dependsOnMethods={"login"}
	 @Test(priority=2)
	 
	 public void notification(){
		 //driv.findElement(By.className("_3ZgaWY")).click();
		// String elements =""
		 driv.findElement(By.id("notifications-link")).click();
		 driv.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement text= driv.findElement(By.xpath("html/body/div[28]/div/div[2]/ul/li/a/div/div[2]/div/span"));
		text.click();
	 }
	 
	
  @BeforeClass
  public void browserLaunch() {
	 driv = new FirefoxDriver();
	  driv.get("http://www.flipkart.com/");
	
  }


@AfterClass
public void closeBrowser(){
	//driv.close();
}
}