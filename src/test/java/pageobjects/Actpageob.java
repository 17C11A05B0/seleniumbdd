package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actpageob {  
	 
	WebDriver driver;
	
	public Actpageob(WebDriver driver)
	{
		 this.driver=driver ;			 
		 PageFactory.initElements(driver, this);
	} 
	@FindBy(xpath="//span[contains(text(),'Electronics')]")  
	WebElement elect;
	@FindBy(xpath="//a[contains(text(),'Gaming')]")
	WebElement gaming;  
	
	public WebElement getele()
	{
		return elect;
	}
	
	public void elecli()
	{
		elect.click();
	}   
	public WebElement gamingget()
	{
		return gaming;
	}
	
	public void gamingcli()
	{
		elect.click();
	}  
	
	
	
	

}