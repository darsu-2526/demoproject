package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Base{
	public Login(WebDriver driver) {
		
	}
	@Test
	
	public void login() {
		//driver.navigate().to("https://groceryapp.uniqassosiates.com/admin");
		String username="admin";
		String password="admin";
		WebElement UserName=driver.findElement(By.name("username"));
		UserName.sendKeys(username);
		WebElement Password=driver.findElement(By.name("password"));
		Password.sendKeys(password);
		WebElement signin=driver.findElement(By.xpath("//button[text()='Sign In']"));
		signin.click();
		WebElement dashboard=driver.findElement(By.xpath("//p[text()='Dashboard']"));
		boolean ishomepageDisplayed=dashboard.isDisplayed();
		Assert.assertTrue(ishomepageDisplayed);
		
		}
	@Test
	public void wrongUsernmae() {
		String username="darsana";
		String password="admin";
		WebElement UserName=driver.findElement(By.name("username"));
		UserName.sendKeys(username);
		WebElement Password=driver.findElement(By.name("password"));
		Password.sendKeys(password);
		WebElement signin=driver.findElement(By.xpath("//button[text()='Sign In']"));
		signin.click();
		WebElement alert=driver.findElement(By.xpath("//button[@data-dismiss=\"alert\"]"));
		boolean isAlerrtDisplayed=alert.isDisplayed();
		Assert.assertTrue(isAlerrtDisplayed);
		
		
	}
	@Test
	public void wrongPassword() {
		String username="admin";
		String password="password";
		WebElement UserName=driver.findElement(By.name("username"));
		UserName.sendKeys(username);
		WebElement Password=driver.findElement(By.name("password"));
		Password.sendKeys(password);
		WebElement signin=driver.findElement(By.xpath("//button[text()='Sign In']"));
		signin.click();
		WebElement alert=driver.findElement(By.xpath("//button[@data-dismiss=\"alert\"]"));
		boolean isAlerrtDisplayed=alert.isDisplayed();
		Assert.assertTrue(isAlerrtDisplayed);
		
	}
	@Test
	public void wrongUsernameAndPassword() {
		String username="darsana";
		String password="password";
		WebElement UserName=driver.findElement(By.name("username"));
		UserName.sendKeys(username);
		WebElement Password=driver.findElement(By.name("password"));
		Password.sendKeys(password);
		WebElement signin=driver.findElement(By.xpath("//button[text()='Sign In']"));
		signin.click();
		WebElement alert=driver.findElement(By.xpath("//button[@data-dismiss=\"alert\"]"));
		boolean isAlerrtDisplayed=alert.isDisplayed();
		Assert.assertTrue(isAlerrtDisplayed);
		
	}
}
