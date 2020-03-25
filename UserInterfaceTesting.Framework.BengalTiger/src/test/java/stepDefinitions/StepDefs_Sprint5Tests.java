package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;

import pageactions.Sprint5Page2Actions;
import pageactions.Sprint5PageActions;
import pages.BasePage;
import resources.Animal;
import resources.Gender;
import resources.User;
import constants.ErrorConstants;
import constants.PageConstants;
import constants.UserConstants;

public class StepDefs_Sprint5Tests
{
	private WebDriver driver;
	
	private User user;

	private Sprint5PageActions sprint5PageActions;
	
	private Sprint5Page2Actions sprint5Page2Actions;

	public StepDefs_Sprint5Tests(BaseSteps baseSteps)
	{
		driver = baseSteps.GetDriver();
		user = baseSteps.GetUser();
		sprint5PageActions = new Sprint5PageActions(driver);
		sprint5Page2Actions = new Sprint5Page2Actions(driver);
	}
	
	@Given("^I go to the sprint5 first page$")
	public void i_go_to_the_sprint5_first_page() throws Throwable 
	{
		GotoSampleApplicationPage(sprint5PageActions.Sprint5Page, PageConstants.Sprint5Url, PageConstants.Sprint5Title);
	}

	@When("^I fill out the sprint5 first form and submit it$")
	public void i_fill_out_the_sprint5_first_form_and_submit_it() throws Throwable 
	{
		user.setGenderType(Gender.Other);
		sprint5PageActions.FillOutPrimaryContactForm(user);
		User emergencyContactUser = new User(UserConstants.EmergencyContactFirstName, UserConstants.EmergencyContactLastName, Gender.Female);
		sprint5PageActions.FillOutEmergencyContactFormAndSubmit(emergencyContactUser);
	}

	@Then("^I should be redirected to the sprint5 second page$")
	public void i_should_be_redirected_to_the_home_page_from_sprint5_page() throws Throwable 
	{
		ValidatePageTitle(sprint5PageActions.Sprint5Page, ErrorConstants.SampleApplicationPage2Error, PageConstants.FormPage2Title);
	}	
	
	@When("^I fill out the sprint5 second form and submit it$")
	public void i_fill_out_the_sprint5_second_form_and_submit_it() throws Throwable 
	{
		sprint5Page2Actions.FillOutRadioButtonAndSubmit(Animal.Crocodiles);
	}

	@Then("^I should be redirected to the home page from sprint5 second page$")
	public void i_should_be_redirected_to_the_home_page_from_sprint5_second_page() throws Throwable 
	{
		ValidatePageTitle(sprint5Page2Actions.Sprint5Page2, ErrorConstants.UltimateQaHomePageError, PageConstants.UltimateQaHomePageTitle);
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