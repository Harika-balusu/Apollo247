package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scenario4 {
	WebDriver driver;
    public Scenario4(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//a[text()='Hyderabad']") WebElement pf4;
    @FindBy(xpath="//*[@id=\"mainContainerCT\"]/div/div[1]/div[2]/div[2]/div[3]/div/div[3]/div/input") WebElement pf41;
    //@FindBy(xpath="(//div[contains(@class,'MuiInputBase-root MuiInput-root')]//input)[2]") WebElement pf41;
    @FindBy(xpath="(//ul/a/li[text()='Haematology'])[2]") WebElement pf42;
    @FindBy(xpath="//a[text()='Dr. Padmaja Lokireddy']") WebElement pf43;
    public void haematology_loc() {
    	pf4.click();
    }
    public void search(String string) {	
    	pf41.click();
    	pf41.sendKeys(string);
    }
    public void hae_select() {
    	pf42.click();
    }
    public void hae_doc() {
    	pf43.click();
    }
    

}


