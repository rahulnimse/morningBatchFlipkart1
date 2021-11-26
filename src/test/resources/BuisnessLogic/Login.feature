Feature: Login Functionality

Background: User is on flipkart home login page and hover mouse to login
Given User open "Chrome" browser with exe path as "E:\\Automation software\\chromedriver.exe"
Given User enter "https://www.flipkart.com/" as url
Given User click on cancel button of login popup
Given User hover mouse on login button

@SmokeTest
Scenario: Login functionality with valid credential
When User click on My profile button
When User enter "9767895722" as user name
When User enter "rahul@5551" as password
When User click on login button
Then Application shows user profile to user