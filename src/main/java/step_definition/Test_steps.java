package step_definition;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Test_steps {
	
	
		WebDriver driver;
	
	@Given("User is on HOme Page")
	public void user_is_on_HOme_Page() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sara.chopra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost:8083/TestMeApp/");
		driver.manage().window().maximize();
		
	  
	}

	@When("User Navigate to Login Page")
	public void user_Navigate_to_Login_Page() {
		driver.findElement(By.linkText("SignIn")).click();
	 
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		 driver.findElement(By.name("userName")).sendKeys(username);
		  driver.findElement(By.name("password")).sendKeys(password);
		  driver.findElement(By.name("Login")).click();
	  
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
	//	 driver.findElement(By.linkText(" SignOut")).click();
//		 driver.findElement(By.linkText(" SignOut")).getText();
//		Assert.assertEquals(" SignOut","driver.findElement(By.linkText(\" SignOut\")).getText()");
//	System.out.println("Login Successful");
	    driver.close();
	}

}
