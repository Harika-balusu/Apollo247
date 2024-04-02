package PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NegativeScenario {
	WebDriver driver;
    public NegativeScenario(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
   // @FindBy(xpath="//*[@id=\"mainContainerCT\"]/div/div[1]/div[2]/div[2]/div[3]/div/div[3]/div/input") WebElement ns1;
    //@FindBy(xpath="(//div/ul/a/li[text()='Gastroenterology/GI medicine'])[2]") WebElement ns2;
    //@FindBy(xpath="//*[@id=\"mainContainerCT\"]/div/div[1]/div[2]/div[2]/div[3]/div/div[3]/div[2]/div[1]/ul/a/li") WebElement ns2;
   // @FindBy(xpath="(//li[text()='Surgical Oncology'])[2]") WebElement ns2;
    @FindBy(xpath="//p[text()='Knee Pain, Shoulder Pain, Bone deformity']") WebElement ns2;
    @FindBy(xpath="//span[text()='Filters']") WebElement ns3;
    @FindBy(xpath="//button/span[text()='16+']") WebElement ns4;
    @FindBy(xpath="//span[text()='Gender']") WebElement ns5;
    @FindBy(xpath="//span[text()='Female']") WebElement ns6;
    @FindBy(xpath="//span[text()='Apply Filters']") WebElement ns7;
    @FindBy(xpath="//p[text()='Sorry, No Doctors Found']") WebElement ns8;
  
//    public void g_search() {
//    	ns1.click();
//    	ns1.sendKeys("Surgical Oncology");
//    }
    
    public void g_doctor() {
    	 JavascriptExecutor javascriptExecutor  = (JavascriptExecutor) driver;
         javascriptExecutor.executeScript("window.scrollBy(0,300)");
    }
    public void sleect() {

    	 ns2.click();
	}
//    	driver.navigate().refresh();
//    	try {
//    		ns2.click();
//    	}catch(StaleElementReferenceException sere) {
//    		try {
//    			driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
//    		}catch(Exception e) {}
//    		ns2 = driver.findElement(By.xpath("(//ul/a/li[text()='Gastroenterology/GI medicine'])[2]"));
    	   
    		
    	
    //}
    
    public void filters() {
    	ns3.click();
    }
    
    public void exp() {
    	ns4.click();
    }
    public void gender() {
    	ns5.click();
    }
    public void female() {
    	ns6.click();
    }
    public void apply() {
    	ns7.click();
    }
    public void notfound() {
    	
    	String err_msg=ns8.getText();
		System.out.println(err_msg);
    }
    

}
