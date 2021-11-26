package cucumbermap;

import java.net.UnknownHostException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import uility.HTMLReportGenerator;

public class Hookable {
	@Before
	public void beoreMethod(Scenario scenario) throws UnknownHostException 
	{
		
	HTMLReportGenerator.TestSuiteStart("E:\\morningbatch1\\flipkart.html", "flipkatProject");
	HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
	System.out.println("-------------Scenario Start-------------");	
		
	}
	
@After	
public void afterMethod(Scenario scenario)
{
	System.out.println("-------------Scenario End--------------");	
	HTMLReportGenerator.TestCaseEnd();
	HTMLReportGenerator.TestSuiteEnd();
}
}
