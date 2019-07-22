package Casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cs1 {
	 public static WebDriver driver;
	
    @Given("I want to click on Signup button")
	public void i_want_to_click_on_Signup_button() {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Desktop\\java\\chromedriver.exe");
		     driver =new ChromeDriver();
		     driver.get("http://192.168.40.4:8083/TestMeApp");
		     driver.manage().window().maximize();
		     driver.findElement(By.partialLinkText("SignUp")).click();
	}

	@When("Enter the User Name")
	public void enter_the_User_Name() {
		 driver.findElement(By.id("userName")).sendKeys("Priyamoorthy");
	}

	@When("Enter the first name {string} and last name {string}")
	public void enter_the_first_name_and_last_name(String x, String y) {
	driver.findElement(By.id("firstName")).sendKeys(x);
	driver.findElement(By.id("lastName")).sendKeys(y);
	}

	@Then("Enter the password {string} and confirm password {string}")
	public void enter_the_password_and_confirm_password(String p, String cp) {
		driver.findElement(By.id("password")).sendKeys(p);
		driver.findElement(By.name("confirmPassword")).sendKeys(cp);
	}

	@Then("Select the gender {string}")
	public void select_the_gender(String gender) {
		switch (gender) {
		case "Female":{
		driver.findElement(By.xpath(".//input[@value='Female']")).click();
		break;
	}
		case "Male":{
			driver.findElement(By.xpath(".//input[@value='Male']")).click();
			break;
		}
		}
	}	
	

	@Then("Enter the E-mail {string}")
	public void enter_the_E_mail(String email) {
		driver.findElement(By.id("emailAddress")).sendKeys(email);
	}

	@Then("Enter the mobile number {string}")
	public void enter_the_mobile_number(String num) {
		driver.findElement(By.id("mobileNumber")).sendKeys(num);
	}

	@Then("Enter the DOB {string}")
	public void enter_the_DOB(String dob) {
		driver.findElement(By.name("dob")).sendKeys(dob);
	}

	@Then("Enter the address {string}")
	public void enter_the_address(String address) {
		driver.findElement(By.name("address")).sendKeys(address);
	}

	@Then("Select the security question {string}")
	public void select_the_security_question(String Security) {
		 Select question=new Select(driver.findElement(By.id("securityQuestion")));
		 question.selectByIndex(0);
	}

	@Then("Enter the answer {string}")
	public void enter_the_answer(String ans) {
		driver.findElement(By.name("answer")).sendKeys(ans);
	}

	@Then("click on Register")
	public void click_on_Register() {
		driver.findElement(By.name("Submit")).click(); 
	}

}
