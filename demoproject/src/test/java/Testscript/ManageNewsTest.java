package Testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtilities;

public class ManageNewsTest extends Base{
ManageNewsPage managenewspage;
HomePage homepage;
	@Test        
	public void verifyUserIsAbleToCreateNews() throws IOException 
	{
		String username=ExcelUtilities.getStringData(1, 0, "loginpage");
		String password=ExcelUtilities.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username).enterPassword(password);
		//loginpage.enterPassword(password);
		homepage=loginpage.clicksignin();
		//ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage=homepage.clickMoreInfonewspage();
		managenewspage.clickNewButton();
		String createnews=ExcelUtilities.getStringData(0, 0, "news");
		managenewspage.enterNews(createnews).clickSaveButton();
		//managenewspage.clickSaveButton();
		boolean alert=managenewspage.isAlertDisplayed();
		Assert.assertTrue(alert);
			
		
		
		
	}
}
	