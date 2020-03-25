package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import pageactions.Sprint2PageActions;
import pages.BasePage;
import constants.ErrorConstants;
import constants.PageConstants;
import constants.UserConstants;

public class StepDefs_Sprint2Tests
{
	private WebDriver driver;
	
	private Sprint2PageActions sprint2PageActions;
	
	public StepDefs_Sprint2Tests(BaseSteps baseSteps)
	{
		driver = baseSteps.GetDriver();
		sprint2PageActions = new Sprint2PageActions(driver);
	}
	
	@Given("^I go to the sprint2 page$")
	public void i_go_to_the_sprint2_page() throws Throwable 
	{
		GotoSampleApplicationPage(sprint2PageActions.Sprint2Page, PageConstants.Sprint2Url, PageConstants.Sprint2Title);
	}

	@When("^I fill out the sprint2 form and submit it$")
	public void i_fill_out_the_sprint2_form_and_submit_it() throws Throwable 
	{
		sprint2PageActions.FillOutFormAndSubmit(UserConstants.DefaultFirstName, UserConstants.DefaultLastName);
	}

	@Then("^I should be redirected to the home page from sprint2 page$")
	public void i_should_be_redirected_to_the_home_page_from_sprint2_page() throws Throwable 
	{
		ValidatePageTitle(sprint2PageActions.Sprint2Page, ErrorConstants.UltimateQaHomePageError, PageConstants.UltimateQaHomePageTitle);
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