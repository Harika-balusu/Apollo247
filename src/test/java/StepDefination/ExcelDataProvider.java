package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageFactory.ExelExec;

public class ExcelDataProvider {
	WebDriver driver;
	 @Test(dataProvider="testdata")
	 public void Program(String specification) {
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apollo247.com/doctors/doctors-in-hyderabad-dcity?source=City_Listing");
		//driver.findElement(By.xpath("//p[text()='Consult']")).click();
		//driver.findElement(By.xpath("//a[text()='Hyderabad']")).click();
		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div/div[1]/div[2]/div[2]/div[3]/div/div[3]/div/input")).click();	
		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div/div[1]/div[2]/div[2]/div[3]/div/div[3]/div/input")).sendKeys(specification);
		driver.findElement(By.xpath("(//div/h6[text()='Dr. Padmaja Lokireddy'])[2]")).click();
	}
	 @DataProvider(name = "testdata")
		public Object getData() {
			ExelExec utils = new ExelExec("C:\\Users\\BALHARIK\\Desktop\\excelfile.xlsx");
			int rows = utils.getRowCount(0);
			Object[][] logindata = new Object[rows][1];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < 1; j++) {
					logindata[i][j] = utils.getdata(0, i + 1, j);
					System.out.println(logindata[i][j]);
				}
			}
			return logindata;
		}	

}
