package InterfaceConcepts;

public class testingInterface {

	public static void main(String[] args) {
		AutomationTester at = new seleniumTester();
		//WebDriver driver = new ChromeDriver();
		
		
		
		
		at.manualConcepts();
		at.automationTool();
		at.versionControlTool();
		
		
		
		
		at = new qtpTester();
		at.manualConcepts();
		at.automationTool();
		at.versionControlTool();
	}

}
