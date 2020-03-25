Feature: Sprint5Tests
As a user,
I want the ability to fill out the Sprint5 forms.

  @AcceptanceCriteria
  Scenario: A user successfully fills out the sprint5 forms
    Given I go to the sprint5 first page
	 When I fill out the sprint5 first form and submit it
	 Then I should be redirected to the sprint5 second page
	 When I fill out the sprint5 second form and submit it
	 Then I should be redirected to the home page from sprint5 second page	 