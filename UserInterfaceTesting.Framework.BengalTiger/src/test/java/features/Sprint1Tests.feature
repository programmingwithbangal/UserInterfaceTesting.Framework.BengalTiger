Feature: Sprint1Tests
As a user,
I want the ability to fill out the Sprint1 form.

  @AcceptanceCriteria
  Scenario: A user successfully fills out the sprint1 form
    Given I go to the sprint1 page
	 When I fill out the sprint1 form and submit it
	 Then I should be redirected to the home page from sprint1 page