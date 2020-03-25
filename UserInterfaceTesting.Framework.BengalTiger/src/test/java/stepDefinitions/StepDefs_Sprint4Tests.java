package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import pageactions.Sprint4PageActions;
import pages.BasePage;
import resources.Gender;
import resources.User;
import constants.ErrorConstants;
import constants.PageConstants;
import constants.UserConstants;

public class StepDefs_Sprint4Tests
{
	private WebDriver driver;
	
	private User user;

	private Sprint4PageActions sprint4PageActions;
	
	public StepDefs_Sprint4Tests(BaseSteps baseSteps)
	{
		driver = baseSteps.GetDriver();
		user = baseSteps.GetUser();
		sprint4PageActions = new Sprint4PageActions(driver);
	}
	
	@Given("^I go to the sprint4 page$")
	public void i_go_to_the_sprint4_page() throws Throwable 
	{
		GotoSampleApplicationPage(sprint4PageActions.Sprint4Page, PageConstants.Sprint4Url, PageConstants.Sprint4Title);
	}

	@When("^I fill out the sprint4 form and submit it$")
	public void i_fill_out_the_sprint4_form_and_submit_it() throws Throwable 
	{
		user.setGenderType(Gender.Female);
		sprint4PageActions.FillOutPrimaryContactForm(user);
		User emergencyContactUser = new User(UserConstants.EmergencyContactFirstName, UserConstants.EmergencyContactLastName, Gender.Other);
		sprint4PageActions.FillOutEmergencyContactFormAndSubmit(emergencyContactUser);
	}

	@Then("^I should be redirected to the home page from sprint4 page$")
	public void i_should_be_redirected_to_the_home_page_from_sprint4_page() throws Throwable 
	{
		ValidatePageTitle(sprint4PageActions.Sprint4Page, ErrorConstants.UltimateQaHomePageError, PageConstants.UltimateQaHomePageTitle);
	}	
	
	private void GotoSampleApplicationPage(BasePage basePage, String url, String title) 
	{
		basePage.goTo(url);
		ValidatePageTitle(basePage, ErrorConstants.SampleApplicationPageError, title);
	}

	private void ValidatePageTitle(BasePage basePage, String error, String title) 
	{
		System.out.println(driver.getTitle());        
        assertTrue(error, basePage.IsLoaded(title));
	}
}