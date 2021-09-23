package com.test.WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInLocators {
	
	WebDriver driver;
	public SignInLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="ap_email")
	private WebElement emailID;
	public WebElement getEmailID() {
		return emailID;
	}
	
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement SearchText;
	public WebElement getSearchText() {
		return SearchText;
	}
	
	@FindBy(xpath="//*[@id='nav-search-dropdown-card']//select")
	private WebElement SearchDropDownl;
	public WebElement getSearchDropDown1() {
		return SearchDropDownl;
	}
	
	@FindBy(xpath="//*[@class='nav-search-scope nav-sprite']")
	private WebElement SearchDropicon;
	public WebElement getSearchDropicon() {
		return SearchDropicon;
	}

	
	@FindBy(xpath="//*[@class='nav-search-facade']")
	private WebElement droplist;
	public WebElement getdroplist() {
		return droplist;
	}
	
	@FindBy(id="nav-search-submit-button")
	private WebElement searchButton;
	public WebElement getsearchButton() {
		return searchButton;
	}
	
	@FindBy(id="continue")
	private WebElement ContinueButton;
	public WebElement getContinueButton() {
		return ContinueButton;
	}
	
	@FindBy(id="ap_password")
	private WebElement PassowrdText;
	public WebElement getPassowrdText() {
		return PassowrdText;
	}
	
	@FindBy(id="signInSubmit")
	private WebElement SignInButton;
	public WebElement getSignInButton() {
		return SignInButton;
	}
	
	@FindBy(xpath="//*[text()='Important Message!']")
	private WebElement SignInError;
	public WebElement getSignInError() {
		return SignInError;
	}

	@FindBy(id = "nav-link-accountList-nav-line-1")
	private WebElement HelloButton;

	public WebElement getHelloButton() {
		return HelloButton;
	}


	@FindBy(id = "ap_password")
	private WebElement Password;

	public WebElement getPassword() {
		return Password;
	}

	@FindBy(id = "signInSubmit")
	private WebElement signInSubmit;

	public WebElement getsignInSubmit() {
		return signInSubmit;
	}

}
