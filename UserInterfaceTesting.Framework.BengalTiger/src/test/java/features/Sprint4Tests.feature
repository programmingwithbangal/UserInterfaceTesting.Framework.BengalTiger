Feature: Sprint4Tests
As a user,
I want the ability to fill out the Sprint4 form.

  @AcceptanceCriteria
  Scenario: A user successfully fills out the sprint4 form
    Given I go to the sprint4 page
	 When I fill out the sprint4 form and submit it
	 Then I should be redirected to the home page from sprint4 page