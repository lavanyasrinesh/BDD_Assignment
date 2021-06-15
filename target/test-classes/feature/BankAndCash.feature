Feature: Techfios bank and cash New Account Functionality 

Background: 
	Given User is on the techfios login page 
	
Scenario Outline: User should be able to login with valid credentials 
	and open a new account	
	When User enters the "<username>" and "<password>" 
	And  User clicks on login button 
	Then User should be able to see the dashboard 
	When User clicks on bank and cash 
	When User clicks on new account 
	When User fill up the form entering "<accountTitle>"and "<description>"and "<initialBalance>"and "<accountNumber>"and "<contactPerson>"and "<phone>"and "<internetBankingUrl>" and clicks on submit 
	Then User should be able to validate new account created
	Examples:
	|username         | password|accountTitle|description|initialBalance|accountNumber|contactPerson| phone   | internetBankingUrl                |
	|demo@techfios.com| abc123  | credit     |   saving  |   40,000     |438960376    | person 		| 7658946 | https://www.texanscu.org/home/home|