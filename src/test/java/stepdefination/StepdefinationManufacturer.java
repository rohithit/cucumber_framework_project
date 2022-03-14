package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import junit.framework.Assert;

public class StepdefinationManufacturer {
	WebDriver driver;
	private String Dashboard;
	private String mm_name;
	@SuppressWarnings("deprecation")
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
		System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe"); 
    	driver = new ChromeDriver();
    	
     	driver.manage().window().maximize();
     	
  	    }
	    catch (WebDriverException e) {
	    	fetched=false;
	    }
	    	    
	    Assert.assertEquals(expect, fetched);
   }
	
  	    	    
  	@When("I want to opens URL {string}")
	public void i_want_to_opens_URL(String string) {
  		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
	  driver.get("http://retailm1.upskills.in/admin");
	}
	    catch (WebDriverException e) {
	    	fetched=false;
	    }
	    	    
	    Assert.assertEquals(expect, fetched);
   }
	

	@When("I want to enters username {string} and password as {string}")
	public void i_want_to_enters_username_and_password_as(String uname, String pass) {
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
	  
			driver.findElement(By.name("username")).sendKeys(uname);
		   driver.findElement(By.name("password")).sendKeys(pass);
		    }
	    catch (WebDriverException e) {
	    	fetched=false;
	    }
	    	    
	    Assert.assertEquals(expect, fetched);
   }
	

	@When("admin click on login")
	public void admin_click_on_login() throws InterruptedException {
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

	@Then("i want to see Page title should be {string}")
	public void i_want_to_see_Page_title_should_be(String Title) {
		
		
	    {
	    
		if (driver.getPageSource().contains("No match for Username and/or Password.")){
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(Title, driver.getTitle());
		}
	    }
}
	

	@Then("admin move to catlog section")
	public void admin_move_to_catlog_section() throws InterruptedException {
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
		driver.findElement(By.xpath("//*[@id='button-menu']/i")).click();
		driver.findElement(By.xpath("//*[@id='menu-catalog']/a")).click();
		Thread.sleep(2000);
		
	}
	    catch (WebDriverException e) {
	    	fetched=false;
	    }
	    	    
	    Assert.assertEquals(expect, fetched);
   }

	@Then("admin navigates to manufacturer section")
	public void admin_navigates_to_manufacturer_section() throws InterruptedException {
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
		driver.findElement(By.xpath("//*[@id='menu-catalog']/ul/li[7]/a")).click();
		
	   
	}
	    catch (WebDriverException e) {
	    	fetched=false;
	    }
	    	    
	    Assert.assertEquals(expect, fetched);
   }

	@Then("admin move to add new section")
	public void admin_move_to_add_new_section() throws InterruptedException {
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
		driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/a/i")).click();
		Thread.sleep(2000);
	    
	}
	    catch (WebDriverException e) {
	    	fetched=false;
	    }
	    	    
	    Assert.assertEquals(expect, fetched);
   }

	@And("Admin want to write manufacturer name in Manufacturers field option")
	public void admin_want_to_write_manufacturer_name_in_Manufacturers_field_option() {
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
	   driver.findElement(By.id("input-name")).sendKeys("CloudTail India Pvt LTD");
	
	}
	    catch (WebDriverException e) {
	    	fetched=false;
	    }
	    	    
	    Assert.assertEquals(expect, fetched);
   }

	@And("I want to set store as deafault")
	public void i_want_to_set_store_as_deafault() {
	   
	}

	@And("I want to write SEO URL")
	public void i_want_to_write_SEO_URL() {
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
		driver.findElement(By.id("input-keyword")).sendKeys("scjsbcj"+Math.random());
	 
	}
	    catch (WebDriverException e) {
	    	fetched=false;
	    }
	    	    
	    Assert.assertEquals(expect, fetched);
   }


   @When("I want to write sort order as sort order")
   public void i_want_to_write_sort_order_as_sort_order() {
	   boolean expect= true;
	    boolean fetched = true;
	    try
	    {
  driver.findElement(By.id("input-sort-order")).sendKeys("12"+Math.random());
}
	    catch (WebDriverException e) {
	    	fetched=false;
	    }
	    	    
	    Assert.assertEquals(expect, fetched);
   }

	 

	@When("I want to click on save option")
	public void i_want_to_click_on_save_option() {
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
	@Then("I want to get the validation message")
	public void i_want_to_get_the_validation_message() throws InterruptedException {
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
		String actual = driver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]")).getText();
		Assert.assertTrue(actual.contains("Success: You have modified manufacturers!"));
		System.out.println(actual);
		Thread.sleep(2000);
		
	}
	    catch (WebDriverException e) {
	    	fetched=false;
	    }
	    	    
	    Assert.assertEquals(expect, fetched);
	    String actual = driver.findElement(By.xpath("//*[@id='form-manufacturer']/div/table/tbody/tr[3]/td[2]")).getText();
	    String expected = "CloudTail India Pvt LTD";
	    Assert.assertEquals(expected, actual);
	    Thread.sleep(2000);
	    
   }
	@Given("User clicks  on the edit button")
	public void user_clicks_on_the_edit_button() {
		try
		{
			
		driver.findElement(By.xpath("//*[@id='form-manufacturer']/div/table/tbody/tr[23]/td[4]/a")).click();
		}
	
		catch(Exception e)
		{
		System.out.println("Error "+e+" in User clicks  on the edit button block");
		}
		
	}

	@When("User edits the information {string} {string} {string}")
	public void user_edits_the_information(String m_name, String seo_url, String sort_order) {
	 
		try
		{
			WebElement element=driver.findElement(By.id("input-name"));
			element.clear();
			element.sendKeys(m_name);
			
			
			element =driver.findElement(By.id("input-keyword"));
		    element.clear();
		    element.sendKeys(seo_url);
		    
		    element= driver.findElement(By.id("input-sort-order"));
		    element.clear();
		    element.sendKeys(sort_order);
		    mm_name=m_name;
		}
		catch(Exception e)
		{
			System.out.println("Error "+e+" in User edits the information {string} {string} {string} block");
		}
		
	    
	}

	@When("Clicks on save button")
	public void clicks_on_save_button() {
		try
		{
			String actual= driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		    String expected="Success: You have modified manufacturers!\n×";
		    Assert.assertEquals(expected, actual);
		    
		    
		    actual= driver.findElement(By.xpath("//*[text()='"+mm_name+"']")).getText();
		    expected=mm_name;
		    Assert.assertEquals(expected, actual);
		}
		catch(Exception e)
		{
			System.out.println("Error "+e+" in Success message is displayed and edit is confirmed block");
		}
	    
	    
	}

	@Then("Success message is displayed and edit is confirmed")
	public void success_message_is_displayed_and_edit_is_confirmed() {
		try
		{
			String actual= driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		    String expected="Success: You have modified manufacturers!\n×";
		    Assert.assertEquals(expected, actual);
		    
		    
		    actual= driver.findElement(By.xpath("//*[text()='"+mm_name+"']")).getText();
		    expected=mm_name;
		    Assert.assertEquals(expected, actual);
		}
		catch(Exception e)
		{
			System.out.println("Error "+e+" in Success message is displayed and edit is confirmed block");
		}
	}


	




}
