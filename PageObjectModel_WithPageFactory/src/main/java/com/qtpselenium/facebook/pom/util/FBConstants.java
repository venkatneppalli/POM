package com.qtpselenium.facebook.pom.util;

import java.util.Hashtable;

public class FBConstants {
	public static final boolean GRID_RUN=false;
	
	//paths
	public static final String CHROME_DRIVER_EXE="C:\\Browser_Drivers\\chromedriver.exe";
	public static final String FIREFOX_DRIVER_EXE="C:\\Browser_Drivers\\geckodriver.exe";
	public static final String IEXPLORE_DRIVER_EXE="C:\\Browser_Drivers\\IEDriverServer.exe";
	
	// locators
	public static final String LOGIN_USERNAME = "//*[@id='username']";
	public static final String LOGIN_PASSWORD = "//*[@id='password']";
	public static final String LOGIN_BUTTON = "//*[@id='login";
	public static final String LOGOUT_BUTTON = "//*[contains(text(),'Logout')]";
	public static final String NAVIGATION_LABEL = "html/body/div[1]/div[1]/div/div[1]/div/div/div/div[2]/div[3]/div[2]/div/div/a";
	public static final String SETTINGS_LINK = "//span[text()='Settings']";
	public static final String PASSWORD_CHANGE = "//*[@id='SettingsPage_Content']/ul/li[4]/a";
	public static final String OLD_PASSWORD = "//*[@id='password_old']";
	public static final String NEW_PASSWORD = "//*[@id='password_new']";
	public static final String CONFIRM_CHANGE = "//*[@id='password_confirm']";
	public static final String SAVE_CHANGES = "//label[@class='submit uiButton uiButtonConfirm']";
	public static final String KILL_SESSION = "//input[@value='kill_sessions']";
	public static final String CONTINUE_PASSWORD_CHANGE_BUTTON = "//button[text()='Continue']";
	
	// URLs-prod
	public static final String PROD_HOMEPAGE_URL = "http://adactin.com/HotelApp/";
	public static final String PROD_USERNAME = "seleniumtesting";
	public static final String PROD_PASSWORD = "password1";
	
	// URLs-uat
	public static final String UAT_HOMEPAGE_URL = "http://adactin.com/HotelApp/";
	public static final String UAT_USERNAME = "seleniumtesting";
	public static final String UAT_PASSWORD = "password1";
		
	
	public static final String ENV="PROD"; //PROD, UAT,SAT 
			

	//paths
	public static final String REPORTS_PATH = "D:\\reports\\";
	public static final String DATA_XLS_PATH = System.getProperty("user.dir")+"\\data\\Data.xlsx";
	public static final String TESTDATA_SHEET = "TestData";
	public static final Object RUNMODE_COL = "Runmode";
	public static final String TESTCASES_SHEET = "TestCases";
	
	public static Hashtable<String,String> table;
	
	public static Hashtable<String,String> getEnvDetails(){
		if(table==null){
			table = new Hashtable<String,String>();
			if(ENV.equals("PROD")){
				table.put("url", PROD_HOMEPAGE_URL);
				table.put("username", PROD_USERNAME);
				table.put("password", PROD_PASSWORD);
			}else if(ENV.equals("UAT")){
				table.put("url", UAT_HOMEPAGE_URL);
				table.put("username", UAT_USERNAME);
				table.put("password", UAT_PASSWORD);
			}
			
		}
		return table;
		 
	}




	


	


	




	



	

}
