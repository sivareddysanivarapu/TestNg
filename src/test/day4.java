package test;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//rahulonlinetutor@gmail.com

public class day4 {

	@Parameters({ "URL" })//it provides data from xml file
	@Test
	public void WebloginHomeLoan(String uname)
	{
		//selenium
		System.out.println("webloginhomePersonalLoan");
		System.out.println(uname);
		
	}
	
	
	@Test(groups={"Smoke"})//when we trigger the groups that particular group will be run
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("MobileloginHome");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		//Rest API automation
		System.out.println("APIloginHome");
	}
}
