package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scenario3 {
	WebDriver driver;
    public Scenario3(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//a[text()='Dr. Korrai Bala Raju']") WebElement pf3;
    
    public void doctor() {
    	pf3.click();
    

}
}
