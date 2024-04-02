package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scenario2 {
	WebDriver driver;
    public Scenario2(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//a[text()='Hyderabad']") WebElement pf2;
    
    public void location() {
    	pf2.click();
    }
}
