package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import pageactions.Sprint3PageActions;
import pages.BasePage;
import resources.Gender;
import resources.User;
import constants.ErrorConstants;
import constants.PageConstants;

public class StepDefs_Sprint3Tests
{
	private WebDriver driver;
	
	private User user;

	private Sprint3PageActions sprint3PageActions;
	
	public StepDefs_Sprint3Tests(BaseSteps baseSteps)
	{
		driver = baseSteps.GetDriver();
		user = baseSteps.GetUser();
		sprint3PageActions = new Sprint3PageActions(driver);
	}
	
	@Given("^I go to the sprint3 page$")
	public void i_go_to_the_sprint3_page() throws Throwable 
	{
		GotoSampleApplicationPage(sprint3PageActions.Sprint3Page, PageConstants.Sprint3Url, PageConstants.Sprint3Title);
	}

	@When("^I fill out the sprint3 form and submit it$")
	public void i_fill_out_the_sprint3_form_and_submit_it() throws Throwable 
	{
		user.setGenderType(Gender.Female);
		sprint3PageActions.FillOutFormWithRadioButtonAndSubmit(user);
	}

	@Then("^I should be redirected to the home page from sprint3 page$")
	public void i_should_be_redirected_to_the_home_page_from_sprint3_page() throws Throwable 
	{
		ValidatePageTitle(sprint3PageActions.Sprint3Page, ErrorConstants.UltimateQaHomePageError, PageConstants.UltimateQaHomePageTitle);
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