package pageobjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClass;

public class Paymentpage extends BaseClass{
	@Test
	public void paymentpage(){
	       driver.findElement(By.xpath(OR.getProperty("addresspagecheckout"))).click();
	       driver.findElement(By.xpath(OR.getProperty("Termsofservice"))).click();
	       driver.findElement(By.xpath(OR.getProperty("shippingpagecheckout"))).click();
	       driver.findElement(By.xpath(OR.getProperty("paymentoption"))).click();
	       driver.findElement(By.xpath(OR.getProperty("confirmorder"))).click();
	       driver.findElement(By.xpath(OR.getProperty("orderhistory"))).click();
	       driver.findElement(By.xpath(OR.getProperty("homebutton"))).click();
	       driver.findElement(By.xpath(OR.getProperty("home"))).click();
	     //  driver.findElement(By.xpath(OR.getProperty("homebuttn"))).click();
	     //  driver.findElement(By.xpath(OR.getProperty("nexthomebutton"))).click();
		
	}

}
