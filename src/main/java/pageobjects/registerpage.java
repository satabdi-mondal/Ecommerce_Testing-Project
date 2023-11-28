package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseClass;

public class registerpage extends BaseClass {
	@Test
	public void registerpage() {
		driver.findElement(By.xpath(OR.getProperty("create_email"))).sendKeys(OR.getProperty("email"));
	       driver.findElement(By.xpath(OR.getProperty("createAccountButton"))).click();
	       driver.findElement(By.xpath(OR.getProperty("radioButton"))).click();
	       driver.findElement(By.id(OR.getProperty("customerfirstnameid"))).sendKeys(OR.getProperty("firstname"));
	       driver.findElement(By.id(OR.getProperty("customerlastnameid"))).sendKeys(OR.getProperty("lastname"));
	       driver.findElement(By.xpath(OR.getProperty("emailfield"))).click();
	       driver.findElement(By.xpath(OR.getProperty("passwordbutton"))).sendKeys(OR.getProperty("password"));
	       WebElement day =  driver.findElement(By.xpath(OR.getProperty("dobdaysid")));
	       day.click();
	       Select select = new Select(day) ;
	       select.selectByIndex(2);
	       
	       WebElement month =  driver.findElement(By.xpath(OR.getProperty("dobmonthsid")));
	       month.click();
	       Select select1 = new Select(month) ;
	       select1.selectByIndex(2);
	       WebElement year =  driver.findElement(By.xpath(OR.getProperty("dobyearsid")));
	       year.click();
	       Select select2 = new Select(year) ;
	       select2.selectByIndex(2);
	       driver.findElement(By.xpath(OR.getProperty("registerbutton"))).click();
	       driver.findElement(By.xpath(OR.getProperty("searchbox"))).click();   
	       
	       driver.findElement(By.xpath(OR.getProperty("firstnameXpath"))).click();
	       driver.findElement(By.xpath(OR.getProperty("lastnameXpath"))).click();
	       driver.findElement(By.xpath(OR.getProperty("company"))).sendKeys(OR.getProperty("compamyname"));
	       driver.findElement(By.xpath(OR.getProperty("address_xpath"))).sendKeys(OR.getProperty("addressvalue"));
	       driver.findElement(By.xpath(OR.getProperty("city"))).sendKeys(OR.getProperty("cityname"));
	       WebElement state =  driver.findElement(By.xpath(OR.getProperty("state_xpath")));
	       state.click();
	       Select select3 = new Select(state) ;
	       select3.selectByVisibleText("Hawaii");
	       driver.findElement(By.xpath(OR.getProperty("postcode"))).sendKeys(OR.getProperty("postcodevalue"));
	       driver.findElement(By.xpath(OR.getProperty("phone"))).sendKeys(OR.getProperty("phoneno"));
	       driver.findElement(By.xpath(OR.getProperty("savebutton"))).click();
		
		
	}

}
