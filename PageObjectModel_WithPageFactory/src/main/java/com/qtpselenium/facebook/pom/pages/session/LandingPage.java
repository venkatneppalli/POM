package com.qtpselenium.facebook.pom.pages.session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.facebook.pom.base.BasePage;
import com.qtpselenium.facebook.pom.util.FBConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LandingPage extends BasePage{
	
	
	@FindBy(xpath=FBConstants.LOGOUT_BUTTON)
	public WebElement logoutlink;
	
	public LandingPage(WebDriver driver,ExtentTest test){
		super(driver,test);
	}
	public ProfilePage gotoProfilePage() {
		test.log(LogStatus.INFO, "Click on Logout Link");
		logoutlink.click();
		ProfilePage profilePage = new ProfilePage(driver,test);
		PageFactory.initElements(driver, profilePage);
		return profilePage;
	}
}
