package PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scenario5 {
	WebDriver driver;
    public Scenario5(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    
    @FindBy(xpath="//*[@id=\"mainContainerCT\"]/div/div[1]/div[2]/div[2]/div[3]/div/div[3]/div/input") WebElement pf5;
    //@FindBy(xpath="(//div[contains(@class,'MuiInputBase-root MuiInput-root')]//input)[2]") WebElement pf5;
    @FindBy(xpath="(//ul/a/li[text()='Neurology'])[2]") WebElement pf51;
    //@FindBy(xpath="//*[@id="mainContainerCT']/div/div[1]/div[2]/div[2]/div[3]/div/div[3]/div[2]/div[1]/ul/a/li") WebElement pf51;
    //@FindBy(id="//*[@id=\"mainContainerCT\"]/div/div[1]/div[2]/div[2]/div[3]/div/div[3]/div[2]/div[1]/ul") WebElement pf51;
    //@FindBy(xpath="div#mainContainerCT>div>div>div:nth-of-type(2)>div:nth-of-type(2)>div:nth-of-type(3)>div>div:nth-of-type(3)>div:nth-of-type(2)>div>ul>a>li") WebElement pf51; 
    public void neuro_search() {
    	pf5.click();
    	pf5.sendKeys("Neurology");
    }
    public void neuro_select() {
//    	driver.navigate().refresh();
//    	try {
//    		pf51.click();
//    	}catch(StaleElementReferenceException sere) {
//    		try {
//    			driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
//    		}catch(Exception e) {}
//    		pf51=driver.findElement(By.xpath("(//li[text()='Neurology'])[2]"));
    		pf51.click();
    //	}
    	
    }	
    
}



