Feature: Sprint3Tests
As a user,
I want the ability to fill out the Sprint3 form.

  @AcceptanceCriteria
  Scenario: A user successfully fills out the sprint3 form
    Given I go to the sprint3 page
	 When I fill out the sprint3 form and submit it
	 Then I should be redirected to the home page from sprint3 page