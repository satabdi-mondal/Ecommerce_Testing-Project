package pageobjects;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import base.BaseClass;
import dev.failsafe.internal.util.Assert;

public class AddToCartPage extends BaseClass  {
	
  @Test
   public void signin() throws InterruptedException {
	  
	
	 
	  WebElement search = driver.findElement(By.xpath(OR.getProperty("searchbox")));
	  search.click();
	  search.sendKeys("summer dress");
	  driver.findElement(By.cssSelector(OR.getProperty("searchbutton"))).click();
	
	  WebElement ele =   driver.findElement(By.xpath(OR.getProperty("product")));
      Actions action = new Actions(driver);
	
	 action.moveToElement(ele).perform();
	 
	  driver.findElement(By.cssSelector(OR.getProperty("addtocart"))).click();
	  
/*	WebElement Verifymessage =  driver.findElement(By.xpath(OR.getProperty("verifyproductaddedmsg")));
	System.out.println(Verifymessage.getText());
	String actualmsg = Verifymessage.getText();
	String expectedmsgcart = "Product successfully added to your shopping cart";
	assertEquals(actualmsg, expectedmsgcart);  */
	
	 driver.findElement(By.xpath(OR.getProperty("proccedtocheckout"))).click();
	 WebElement quantity = driver.findElement(By.xpath(OR.getProperty("cartquantity")));
	 quantity.clear();
	 quantity.sendKeys("3");
	 Thread.sleep(3000);
	 WebElement quantitymsg = driver.findElement(By.xpath(OR.getProperty("shoppingcartquantitymsg")));
	 System.out.println(quantitymsg.getText());
	 String actual = quantitymsg.getText();
		String expected = "3 products";
		assertEquals(actual, expected);
		driver.findElement(By.xpath(OR.getProperty("Proceedtocheckout"))).click();
	 
	  
	  
//	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	//   wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("signin"))));
	 //  driver.findElement(By.xpath(OR.getProperty("signin"))).click();
  /*     driver.findElement(By.xpath(OR.getProperty("create_email"))).sendKeys(OR.getProperty("email"));
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
       driver.findElement(By.xpath(OR.getProperty("addresspagecheckout"))).click();
       driver.findElement(By.xpath(OR.getProperty("Termsofservice"))).click();
       driver.findElement(By.xpath(OR.getProperty("shippingpagecheckout"))).click();
       driver.findElement(By.xpath(OR.getProperty("paymentoption"))).click();
       driver.findElement(By.xpath(OR.getProperty("confirmorder"))).click();
       driver.findElement(By.xpath(OR.getProperty("orderhistory"))).click();
       driver.findElement(By.xpath(OR.getProperty("homebutton"))).click();              */
   }
	
	

}
