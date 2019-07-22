package Casestudy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cs3 {
	 public static WebDriver driver;
	@Given("I want to registered into TestMeApp")
	public void i_want_to_registered_into_TestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Desktop\\java\\chromedriver.exe");
	     driver =new ChromeDriver();
	     driver.get("http://192.168.40.4:8083/TestMeApp");
	     driver.manage().window().maximize();
	     driver.findElement(By.partialLinkText("SignIn")).click();
	     driver.findElement(By.id("userName")).sendKeys("AlexUser");
	     driver.findElement(By.id("password")).sendKeys("Alex@123");
	     driver.findElement(By.name("Login")).click(); 
	    	}

	@Given("search the product like HeadPhone")
	public void search_the_product_like_HeadPhone() {
		Actions action=new Actions(driver);
		  WebElement all_cat=driver.findElement(By.partialLinkText("All Categories"));
		   action.moveToElement(all_cat).build().perform();
		   WebElement electronics=driver.findElement(By.partialLinkText("Electronics"));
           electronics.click();
           try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
          action.moveToElement(driver.findElement(By.partialLinkText("Head Phone"))).click().build().perform();
         }

	@When("Proceed to payment without adding any item in the cart")
	public void proceed_to_payment_without_adding_any_item_in_the_cart() {
		//WebElement addtocart=driver.findElement(By.xpath(".//a[contains(text(),'Add to cart')]"));
		//addtocart.click();
		//WebElement cart=driver.findElement(By.xpath(".//a[contains(text(),'Cart')]"));
		//Assert.assertEquals("Cart1", cart);
		//Assert.assertTrue(message, condition);;
	   if(driver.findElements(By.cssSelector("i.fa.fa-shopping-cart")).size()!=0) {
		   driver.findElement(By.cssSelector("i.fa.fa-shopping-cart")).click();
	   }
	   else
	   {
		   System.out.println("\n\n ICON NOT VISIBLE \n\n");
	   }
	}

	@Then("TestMe doesn't displayes the cart item")
	public void testme_doesn_t_displayes_the_cart_item() {
		Assert.assertEquals(0,driver.findElements(By.cssSelector("i.fa.fa-shopping-cart")).size());
	  
	}

}