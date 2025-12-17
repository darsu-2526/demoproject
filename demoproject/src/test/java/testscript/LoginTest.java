package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class LoginTest extends Base{
	HomePage homepage;
	@Test(groups= {"regression"},retryAnalyzer=retry.Retry.class)//valid username and password
	public void verifyUserIsAbleToLoginUsingValidCredentials() throws IOException {
		//String username="admin";
		//String password="admin";
		String username=ExcelUtilities.getStringData(1, 0, "loginpage");
		String password=ExcelUtilities.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username).enterPassword(password);
		//loginpage.enterPassword(password);
		homepage=loginpage.clicksignin();
		boolean homepage=loginpage.isHomePageDisplayed();
		Assert.assertTrue(homepage);
		}
	
	@Test//valid username and invalid password
	public void verifyUserLoginUsingValidUsernameAndInvalidPassword() throws IOException {
		String username=ExcelUtilities.getStringData(2, 0, "loginpage");
		String password=ExcelUtilities.getStringData(2, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterPassword(password);
		loginpage.clicksignin();
		boolean alert=loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);
		}
	
	@Test//invalid username and valid password
	public void VerifyUserLoginUsingInvalidUsernameAndValidPassword() throws IOException
	{
		String username=ExcelUtilities.getStringData(3, 0, "loginpage");
		String password=ExcelUtilities.getStringData(3, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterPassword(password);
		loginpage.clicksignin();
		boolean alert=loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);
	}
	
	@Test//invalid username and invalid password
	public void VerifyUserLoginUsingInvalidUsernameAndInvalidPassword() throws IOException
	{
		String username=ExcelUtilities.getStringData(4, 0, "loginpage");
		String password=ExcelUtilities.getStringData(4, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterPassword(password);
		loginpage.clicksignin();
		boolean alert=loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);
		
	}

}
