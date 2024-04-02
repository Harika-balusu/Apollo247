package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scenario6 {
	WebDriver driver;
    public Scenario6(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    
    @FindBy(xpath="//a[text()='Dr. Deepika Sirineni']") WebElement pf6;
    
    public void neurodoc() {
    	pf6.click();
}


}
