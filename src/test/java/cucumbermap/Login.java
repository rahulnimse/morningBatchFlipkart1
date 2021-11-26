package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uility.HTMLReportGenerator;
import uility.SeleniumOperaton;

public class Login {

	@Given ("^User open \"(.*)\" browser with exe path as \"(.*)\"$")
	public void browserLaunch(String bname ,String exe)
	{
		Object[] input=new Object[2];
        input[0]= bname;
        input[1]= exe;
        SeleniumOperaton.browserLaunch(input);
	}
	@Given ("^User enter \"(.*)\" as url$")
	public void enterUrl(String url)
	{
		Object[] input1=new Object[1];
        input1[0]=url;
        SeleniumOperaton.openApplication(input1);
		
	}
	@Given ("^User click on cancel button of login popup$")
	public void clickOnElement()
	{
		Object[] input2=new Object[1];
        input2[0]="//*[@class='_2KpZ6l _2doB4z']";
        SeleniumOperaton.clickOnElement(input2);
	}
	@Given ("^User hover mouse on login button$")
	public void navigateTo() 
	{Object[] input3=new Object[1];
    input3[0]="//*[@class='_28p97w']";
    SeleniumOperaton.navigateToLogin(input3);	
	}
	@When ("^User click on My profile button$")
	public void clickOnProfile()
	{
		Object[] input4=new Object[1];
        input4[0]="//*[text()='My Profile']";
        Hashtable<String, Object> output4 =SeleniumOperaton.clickOnElement(input4);
        HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^User click on My profile button$", output4.get("MESSAGE").toString());
	}
	@When ("^User enter \"(.*)\" as user name$")
	public void enterUserName(String uname) 
	{
		Object[] input5=new Object[2];
        input5[0]="//*[@class='_2IX_2- VJZDxU']";
        input5[1]=uname;
        Hashtable<String, Object> output5 =SeleniumOperaton.sendKey(input5);
        HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^User enter \"(.*)\" as user name$", output5.get("MESSAGE").toString());

	}
	@When ("^User enter \"(.*)\" as password$")
	public void enterPassword(String pass) 
	{Object[] input6=new Object[2];
    input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
    input6[1]="rahul@5551";
    Hashtable<String, Object> output6 =SeleniumOperaton.sendKey(input6);
    HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^User enter \"(.*)\" as password$", output6.get("MESSAGE").toString());
}
	@When ("^User click on login button$")
	public void clickOnLoin() 
	{
		Object[] input7=new Object[1];
        input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
        Hashtable<String, Object> output7 =SeleniumOperaton.clickOnElement(input7);
        HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^User click on login button$", output7.get("MESSAGE").toString());
}
	@Then ("^Application shows user profile to user$")
	public void userOnUserProfile() 
	{
		Object[] input8=new Object[2];
        input8[0]="Rahul Nimse";
        input8[1]="//*[text()='Rahul Nimse']";
        Hashtable<String, Object> output8 =SeleniumOperaton.ValidatonLogin(input8);
        HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^Application shows user profile to user$", output8.get("MESSAGE").toString());
        
	}
}



	

