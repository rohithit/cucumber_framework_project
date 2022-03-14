package stepdefination;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import cucumber.api.java.en.*;
import junit.framework.Assert;

public class stepdefinationlogin {

	
WebDriver driver;
    @SuppressWarnings("deprecation")
	@Given("browser is open")
    public void browser_is_open() {
    	boolean expect= true;
	    boolean fetched = true;
	    try
	    {
    	System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe"); 
    	driver = new ChromeDriver();
    	driver.get("http://retailm1.upskills.in/admin/index.php?route=common/dashboard&token=qIetyF1vq1bDOffA8mu6VMBHi78ie37T");
     	driver.manage().window().maximize();
	    }
	  catch (WebDriverException e) {
	    	fetched=false;
	    }
	    	    
	    Assert.assertEquals(expect, fetched);
   }
	
	
	@And("user is on login page")
	public void user_is_on_login_page() {
	   
	}

	@When("user enters user name and password")
	public void user_enters_user_name_and_password() {
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
	   driver.findElement(By.name("username")).sendKeys("admin");
	   driver.findElement(By.name("password")).sendKeys("Admin@123");
	    }
	   catch (WebDriverException e) {
	    	fetched=false;
	    }
	    
	    
	    Assert.assertEquals(expect, fetched);

	}
	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	    }
		  catch (WebDriverException e) {
		    	fetched=false;
		    }
		    
		    
		    Assert.assertEquals(expect, fetched);
	}

	@When("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	   
	}
	@And("user is click on marketing Tracking")
	public void user_is_click_on_marketing_Tracking()  {
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
		driver.findElement(By.xpath("//*[@id='button-menu']/i")).click();
	
	}
	    catch (WebDriverException e) {
	    	fetched=false;
	    }
	    
	    
	    Assert.assertEquals(expect, fetched);
}
 
	@And("user is on the marketing Menu")
	public void user_is_on_the_marketing_Menu() throws InterruptedException {
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
	      driver.findElement(By.xpath("//*[@id='menu-marketing']/a")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id='menu-marketing']/ul/li[1]/a")).click();
	      Thread.sleep(1000);
		
		}
	    catch (WebDriverException e) {
	    	fetched=false;
	    }
	    
	    
	    Assert.assertEquals(expect, fetched);
}
	@When("user is on Marketing tracking")
	public void user_is_on_Marketing_tracking() {
	  
	}

	@And("User click on Add new option")
	public void user_click_on_Add_new_option() {
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
	    driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/a/i")).click();
	}
	    catch (WebDriverException e) {
	    	fetched=false;
	    }
	    
	    
	    Assert.assertEquals(expect, fetched);
}

	@When("user is on the Marketing Trcking Option")
	public void user_is_on_the_Marketing_Trcking_Option() {
	 
	}

	@When("user enter Valid Campaign Name")
	public void user_enter_Valid_Campaign_Name() {
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
	driver.findElement(By.id("input-name")).sendKeys("Big Billion days");
	}
	    catch (WebDriverException e) {
	    	fetched=false;
	    }
	     Assert.assertEquals(expect, fetched);
}

	@When("user enter Description part")
	public void user_enter_Description_part() {
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
	driver.findElement(By.id("input-description")).sendKeys("Flipkart Big Billion Days Sale 2022 will Be returning this year around first week of October With offer some of the best year-end deals on Mobiles, Laptops, Electronics, Fashion & millions of other products available across Flipkart.");
	    }
	    catch (WebDriverException e) {
	    	fetched=false;
	    }
	     Assert.assertEquals(expect, fetched);
}

	@When("user enter Tracking code")
	public void user_enter_Tracking_code() {
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
	 driver.findElement(By.id("input-code")).sendKeys("6228666917c4e");
	}
	    catch (WebDriverException e) {
	    	fetched=false;
	    }
	     Assert.assertEquals(expect, fetched);
}

	@When("user Examples")
	public void user_Examples() {
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
	   driver.findElement(By.id("input-example1")).sendKeys("http://retailm1.upskills.in/?tracking=6228666917c4e");
	   driver.findElement(By.id("input-example2")).sendKeys("http://retailm1.upskills.in/index.php?route=common/home&tracking=6228666917c4e");
	}
	    catch (WebDriverException e) {
	    	fetched=false;
	    }
	     Assert.assertEquals(expect, fetched);
}
	@When("User fill all the details")
	public void user_fill_all_the_details() {
	}
    @Then("user clicks on save option")
	public void user_clicks_on_save_option() {
    	boolean expect= true;
	    boolean fetched = true;
	    try
	    {
	  driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/button/i")).click();
	}
	    catch (WebDriverException e) {
	    	fetched=false;
	    }
	     Assert.assertEquals(expect, fetched);
}
	
	@SuppressWarnings("deprecation")
	@Then("Validation message should appeared")
	public void validation_message_should_appeared() throws InterruptedException {
		
		String actual = driver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]")).getText();
		Assert.assertTrue(actual.contains("Success: You have modified marketing tracking!"));
		System.out.println(actual);
		Thread.sleep(2000);
		
	}
		
		@Given("User navigates to marketing section")
		public void user_navigates_to_marketing_section1() {
		  
		}

		@When("User enters valid Tracking Code in Tracking code input box")
		public void user_enters_valid_Tracking_Code_in_Tracking_code_input_box() {
		 
		

			
		    driver.findElement(By.name("filter_code")).sendKeys("620f5f5d940cf");
//		    driver.findElement(By.id("input-code")).sendKeys("620f5f5d940cf");
		}
		

		@When("Clicks on filter button")
		public void clicks_on_filter_button() {
			//driver.findElement(By.xpath("//*[@id='input-code']")).click();
		   driver.findElement(By.xpath("//*[@id='button-filter']")).click();
		}

		@SuppressWarnings("deprecation")
		@Then("Campaign Name along with all details should appear")
		public void campaign_Name_along_with_all_details_should_appear() throws InterruptedException {

			String actual = driver.findElement(By.xpath("//*[@id='form-marketing']/div/table/tbody/tr/td[2]")).getText();
			Assert.assertTrue(actual.contains("rohit"));
			System.out.println(actual);
			Thread.sleep(2000);
			driver.close();
			
		    
		}

		
		
		
		
	



	}






















