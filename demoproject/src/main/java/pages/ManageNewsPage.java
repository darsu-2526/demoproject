package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='active nav-link']")WebElement moreinfonewspage;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
	@FindBy(xpath="//textarea[@id='news']")WebElement textarea;
	@FindBy(xpath="//button[@class='btn btn-danger']")WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	/*public void clickMoreInfonewspage()
	{
		moreinfonewspage.click();
	}*/
	
	public ManageNewsPage clickNewButton()
	{
		newbutton.click();
		return this;
	}
	public ManageNewsPage enterNews(String createnews)
	{
		textarea.sendKeys(createnews);
		return this;
	}
	public ManageNewsPage clickSaveButton()
	{
		savebutton.click();
		return this;
	}
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
	}
	
	
	
			

}
