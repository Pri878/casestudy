package Casestudy;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Cs2 {
	 public static WebDriver driver;
	
	 @Given("I want click on signin button")
	public void i_want_click_on_signin_button() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Desktop\\java\\chromedriver.exe");
	     driver =new ChromeDriver();
	     driver.get("http://192.168.40.4:8083/TestMeApp");
	     driver.manage().window().maximize();
	     driver.findElement(By.partialLinkText("SignIn")).click();
	}
	 @Given("Enter the {string} and {string}")
	 public void enter_the_and(String name, String password, io.cucumber.datatable.DataTable dataTable) {
		 List <Map<String,String>> list = dataTable.asMaps(String.class, String.class);
		 //for(int i=0;i<list.size();i++) {
				driver.findElement(By.id("userName")).sendKeys(list.get(0).get("username"));
				driver.findElement(By.id("password")).sendKeys(list.get(0).get("password"));
		 }
	 
	 @Then("click on login")
	 public void click_on_login() {
		 driver.findElement(By.name("Login")).click(); 
	 }

	
}
