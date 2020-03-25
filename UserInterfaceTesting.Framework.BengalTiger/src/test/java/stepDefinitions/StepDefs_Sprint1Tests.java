package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import pageactions.Sprint1PageActions;
import pages.BasePage;
import constants.ErrorConstants;
import constants.PageConstants;
import constants.UserConstants;

public class StepDefs_Sprint1Tests
{
	private WebDriver driver;
	
	private Sprint1PageActions sprint1PageActions;
	
	public StepDefs_Sprint1Tests(BaseSteps baseSteps)
	{
		driver = baseSteps.GetDriver();
		sprint1PageActions = new Sprint1PageActions(driver);
	}
	
	@Given("^I go to the sprint1 page$")
	public void i_go_to_the_sprint1_page() throws Throwable 
	{
		GotoSampleApplicationPage(sprint1PageActions.Sprint1Page, PageConstants.Sprint1Url, PageConstants.Sprint1Title);
	}

	@When("^I fill out the sprint1 form and submit it$")
	public void i_fill_out_the_sprint1_form_and_submit_it() throws Throwable 
	{
		sprint1PageActions.FillOutFormAndSubmit(UserConstants.DefaultFirstName);
	}

	@Then("^I should be redirected to the home page from sprint1 page$")
	public void i_should_be_redirected_to_the_home_page_from_sprint1_page() throws Throwable 
	{
		ValidatePageTitle(sprint1PageActions.Sprint1Page, ErrorConstants.UltimateQaHomePageError, PageConstants.UltimateQaHomePageTitle);
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