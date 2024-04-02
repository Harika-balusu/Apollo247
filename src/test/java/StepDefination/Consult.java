package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.NegativeScenario;
import PageFactory.Scenario1;
import PageFactory.Scenario2;
import PageFactory.Scenario3;
import PageFactory.Scenario4;
import PageFactory.Scenario5;
import PageFactory.Scenario6;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Consult {
	WebDriver driver;
	@Given("User clicks on consult module")
	public void user_clicks_on_consult_module() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apollo247.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//WebElement consult = driver.findElement(By.xpath("//p[text()='Consult']"));
		//consult.click();
		Scenario1 cm = new Scenario1(driver);
		cm.consult();
		
//
	}
//
	@When("User navigates to consult module")
	public void user_navigates_to_consult_module() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("User succesfully navigated")
	public void user_succesfully_navigated() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User selects a location")
	public void user_selects_a_location() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//WebElement location =driver.findElement(By.xpath("//a[text()='Hyderabad']"));
		//location.click();
		Scenario2 loc = new Scenario2(driver);
		loc.location();

	}

	@Then("Location is selected successfully")
	public void location_is_selected_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User selects doctor")
	public void user_selects_doctor() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//WebElement doctor = driver.findElement(By.xpath("//a[text()='Dr. Korrai Bala Raju']"));
     	//doctor.click();
		Scenario3 doc = new Scenario3(driver);
		doc.doctor();

	}

	@When("User proceeds to payment")
	public void user_proceeds_to_payment() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Appointment is booked successfully")
	public void appointment_is_booked_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User select a Location")
	public void user_select_a_location() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebElement location =driver.findElement(By.xpath("//a[text()='Hyderabad']"));
		//location.click();
		Scenario4 loc1 = new Scenario4(driver);
		loc1.haematology_loc();


	}
//
	@Then("Location is selected succesfully")
	public void location_is_selected_succesfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

//	@When("User searches for Haematology doctor")
//	public void user_searches_for_Haematology_doctor() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		//WebElement searchbutton =  driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div/div[1]/div[2]/div[2]/div[3]/div/div[3]/div/input"));
//
//		//searchbutton.click();
//		//searchbutton.sendKeys("Haematology");
//		//driver.findElement(By.xpath("(//ul/a/li[text()='Haematology'])[2]")).click();
//		Scenario4 s = new Scenario4(driver);
//		s.search();
//		Scenario4 se=new Scenario4(driver);
//		se.hae_select();
//		
//		
//
//	}
	@When("User searches for Haematology doctor {string}")
	public void user_searches_for_haematology_doctor(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Scenario4 s = new Scenario4(driver);
		s.search(string);
		Scenario4 se=new Scenario4(driver);
		se.hae_select();
	}

	@When("User selects an Haematology doctor")
	public void user_selects_an_Haematology_doctor() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.xpath("(//div[@class='InfoCardPartner_doctorInfo__rna0X']//div)[3]")).click();
		//driver.findElement(By.xpath("//a[text()='Dr. Padmaja Lokireddy']")).click();
		Scenario4 hdoc = new Scenario4(driver);
		hdoc.hae_doc();
		

	}
	
		@When("User searches for Neurology doctor")
	public void user_searches_for_neurology_doctor() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		WebElement location =driver.findElement(By.xpath("//a[text()='Hyderabad']"));
//		location.click();
		//WebElement searchbutton =  driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div/div[1]/div[2]/div[2]/div[3]/div/div[3]/div/input"));
//
		//searchbutton.click();
		//searchbutton.sendKeys("Neurology");
		//driver.findElement(By.xpath("(//ul/a/li[text()='Neurology'])[2]")).click();
		//driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div/div[1]/div[2]/div[2]/div[3]/div/div[3]/div[2]/div[1]/ul/a[1]/li")).click();
//		//driver.findElement(By.xpath("//a[@href='/specialties/neurology?source=past_searches']")).click();
//		//driver.findElement(By.xpath("(//a[text()='Neurology'])[1]")).click();
//		//driver.findElement(By.xpath("//ul[@class='PastSearches_pastSearchList__fm_Zs']//a")).click();
//		driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/div/ul/a[1]/div/div[1]")).click();
		//driver.findElement(By.className("icon-ic_arrow_right2")).click();
		
		Scenario5 ns = new Scenario5(driver);
		ns.neuro_search();
		Scenario5 nse=new Scenario5(driver);
		nse.neuro_select();
		

		
		
	}

	@Then("search is succesful")
	public void search_is_succesful() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
	}

	@When("User selects neuro doctor")
	public void user_selects_neuro_doctor() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		//driver.findElement(By.xpath("//a[text()='Dr. Deepika Sirineni']")).click();
		//driver.findElement(By.xpath("//a[text()='Dr. Joydeep Biswas']")).click();
		//driver.findElement(By.linkText("Dr. Joydeep Biswas")).click();
		//driver.findElement(By.xpath("//span[text()='Book an Appointment']")).click();
		
		Scenario6 ndoc = new Scenario6(driver);
		ndoc.neurodoc();
	}

//	@When("User searches for Gastroenterology doctor")
//	public void user_searches_for_gastroenterology_doctor() {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		//WebElement g_search = driver.findElement(By.xpath("//*[@id=\\\"mainContainerCT\\\"]/div/div[1]/div[2]/div[2]/div[3]/div/div[3]/div/input"));
//		//g_search.click();
//		//g_search.sendKeys("Gastroenterology/GI medicine");
//		//WebElement g_doc = driver.findElement(By.xpath("(//li[text()='Gastroenterology/GI medicine'])[2]"));
//		//g_doc.click();
//		//driver.findElement(By.xpath("//span[text()='Filters']")).click();
//		NegativeScenario gastro=new NegativeScenario(driver);
//		
//		//gastro.g_search();
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		gastro.g_doctor();
//		gastro.filters();
//		
//	}
//	@When("User selects female doctor with {int}+ years experience")
//	public void user_selects_female_doctor_with_years_experience(Integer int1) {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
////		driver.findElement(By.xpath("//span[text()='16+']")).click();
////		driver.findElement(By.xpath("//span[text()='Gender']")).click();
////		driver.findElement(By.xpath("//span[text()='Female']")).click();
////		driver.findElement(By.xpath("//span[text()='Apply Filters']")).click();
//		NegativeScenario gastro=new NegativeScenario(driver);
//		gastro.exp();
//		gastro.gender();
//		gastro.female();
//		gastro.apply() ;
//	}
	
	@Given("scroll down to menu")
	public void scroll_down_to_menu() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		NegativeScenario gastro=new NegativeScenario(driver);
		gastro.g_doctor();

	}

	@When("User clicks on orthopedic")
	public void user_clicks_on_orthopedic() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		NegativeScenario sortho=new NegativeScenario(driver);
		sortho.sleect();

	}

	@When("User applies required filters")
	public void user_applies_required_filters() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    NegativeScenario fil=new NegativeScenario(driver);
	    fil.filters();
	    fil.exp();
	    fil.gender();
	    fil.female();
	    fil.apply();
       
	}


	@Then("Doctor not found")
	public void doctor_not_found() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement error =driver.findElement(By.xpath("//p[text()='Sorry, No Doctors Found']"));
//		String err_msg=error.getText();
//		System.out.println(err_msg);
		NegativeScenario nodoc=new NegativeScenario(driver);
		nodoc.notfound();
	}




}
