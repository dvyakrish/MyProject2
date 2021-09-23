package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.WebElements.SignInLocators;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataVerifySteps {

	WebDriver driver;
	SignInLocators Locator ;
	@Given("Launch the Amazon Application")
	public void launch_the_amazon_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\JavaClassSession\\Data_BDD\\Browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Locator = new SignInLocators(driver);
		
	}

	@When("Enter the userName and Password")
	public void enter_the_user_name_and_password(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		List<Map<String,String>> details = dataTable.asMaps(String.class,String.class);
		System.out.println("Size:"+details.size());
		
		System.out.println(details.get(0).get("UserName"));
		System.out.println(details.get(0).get("Password"));
		
		Locator.getHelloButton().click();
		Locator.getEmailID().sendKeys(details.get(0).get("UserName"));
		Locator.getContinueButton().click();
		Locator.getPassword().sendKeys(details.get(0).get("Password"));
		Locator.getsignInSubmit().click();
	 
	}


	@Then("close the browser")
	public void close_the_browser() {
	    driver.quit();
	}


	@Then("Search for the items")
	public void search_for_the_items(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
		List<String> searchList = dataTable.asList(String.class);
		System.out.println(searchList.get(0));
		
		Locator.getSearchText().sendKeys(searchList.get(0));
		Locator.getsearchButton().click();
		Locator.getSearchText().clear();
		Locator.getSearchText().sendKeys(searchList.get(1));
		Locator.getsearchButton().click();
		
	}



	

}
