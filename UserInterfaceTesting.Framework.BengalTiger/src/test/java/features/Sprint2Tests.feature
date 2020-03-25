Feature: Sprint2Tests
As a user,
I want the ability to fill out the Sprint2 form.

  @AcceptanceCriteria
  Scenario: A user successfully fills out the sprint2 form
    Given I go to the sprint2 page
	 When I fill out the sprint2 form and submit it
	 Then I should be redirected to the home page from sprint2 page