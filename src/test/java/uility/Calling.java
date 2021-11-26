package uility;

public class Calling {

	public static void main (String[]args) 
	{
		//brouserLaunch
		Object[] input=new Object[2];
		         input[0]="Chrome";
		         input[1]="E:\\\\Automation software\\\\chromedriver.exe";
		         SeleniumOperaton.browserLaunch(input);
		
		       //openApllication
		         Object[] input1=new Object[1];
		         input1[0]="https://www.flipkart.com/";
		         SeleniumOperaton.openApplication(input1);
		         
		       //click on Element
		         Object[] input2=new Object[1];
		         input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		         SeleniumOperaton.clickOnElement(input2);
		      
		         //navigate to login
		         Object[] input3=new Object[1];
		         input3[0]="//*[@class='_28p97w']";
		         SeleniumOperaton.navigateToLogin(input3);
		         
		     	//click on My Profile
		         Object[] input4=new Object[1];
		         input4[0]="//*[text()='My Profile']";
		         SeleniumOperaton.clickOnElement(input4);
		
		         //sendKeys
		         Object[] input5=new Object[2];
		         input5[0]="//*[@class='_2IX_2- VJZDxU']";
		         input5[1]="9767895722";
		         SeleniumOperaton.sendKey(input5);
		         
		       //senKeys
		         Object[] input6=new Object[2];
		         input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		         input6[1]="rahul@5551";
		         SeleniumOperaton.sendKey(input6);
		         
		       //click on Element
		         Object[] input7=new Object[1];
		         input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
		         SeleniumOperaton.clickOnElement(input7);
		         
		         // validation
		         Object[] input8=new Object[2];
		         input8[0]="Rahul Nimse";
		         input8[1]="//*[text()='Rahul Nimse']";
		         SeleniumOperaton.ValidatonLogin(input8);
		         
		         
		        
	}

	
	
	
	
}
