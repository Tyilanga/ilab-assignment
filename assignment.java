package selenium;



public class assignment {
 

	
	
	public static void main(String[] args) throws Exception {

	  StartChrome.startBrowser("https://www.ilabquality.com/");

	  ByLinkName.clickLink("CAREERS");
	  ByLinkName.clickLink("South Africa");
	  ByLinkName.clickLink("Senior Test Automation Specialist – Johannesburg");
	  ByLinkName.clickLink("Apply Online");
	  
	  inputData.inputText("applicant_name" , "Aphiwe");
	  inputData.inputText("email" , "automationAssessment@iLABQuality.com");
	  inputData.inputText("phone" , inputData.generateNumber());
	  
	  ByButton.clickId("wpjb_submit");
	  
	  //StartChrome.closeBrowser();
	

  }
}