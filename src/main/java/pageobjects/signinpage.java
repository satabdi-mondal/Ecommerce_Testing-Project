package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseClass;

public class signinpage extends BaseClass {
	@Test
	 public void Signinpage() {
		
		 driver.findElement(By.xpath(OR.getProperty("signinemail"))).sendKeys(OR.getProperty("email"));
		 driver.findElement(By.xpath(OR.getProperty("passwordbutton"))).sendKeys(OR.getProperty("password"));
		 driver.findElement(By.xpath(OR.getProperty("submitlogin"))).click();
		
	}

}
